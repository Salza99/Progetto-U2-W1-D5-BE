package DavideSalzani.ProgettoU2W1D5.entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "UserBuilder")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    @Column(nullable = false)
    private String username;
    private String nome;
    private String cognome;
    private String email;

    @ManyToMany
    @JoinTable(
            name = "user_postazione",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "postazione_id")
    )
    private List<Postazione> prenotazionePostazioni;

    public static class UserBuilder{
        private Faker faker = new Faker(Locale.ITALY);
        private String username= faker.name().username();
        private String nome = faker.name().firstName();
        private  String cognome = faker.name().lastName();
        private String email = faker.internet().emailAddress(nome);

    }
}
