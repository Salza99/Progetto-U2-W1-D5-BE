package DavideSalzani.ProgettoU2W1D5.entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

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
    private String nome;
    private String cognome;
    private int eta;

    public static class UserBuilder{
        private Faker faker = new Faker(Locale.ITALY);
        private String nome = faker.name().firstName();
        private  String cognome = faker.name().lastName();
        private int eta = faker.number().numberBetween(20, 35);
    }
}
