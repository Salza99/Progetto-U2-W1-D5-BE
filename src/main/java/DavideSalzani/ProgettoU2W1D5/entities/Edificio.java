package DavideSalzani.ProgettoU2W1D5.entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "edificio")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "EdificioBuilder")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    private String nome;
    private String indirizzo;
    private String citta;
    @OneToMany(mappedBy = "edificio", cascade = CascadeType.REMOVE)
    private List<Postazione> postazione;
    public static class EdificioBuilder{
        private Faker faker = new Faker(Locale.ITALY);
        private String name = "A-"+ faker.number().digits(2);
        private String indirizzo = faker.address().streetAddress();
        private String citta = faker.address().cityName();
    }
}
