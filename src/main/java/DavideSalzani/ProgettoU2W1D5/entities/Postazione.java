package DavideSalzani.ProgettoU2W1D5.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "postazione")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    private String descrizione;
    private TipoPostazione tipoPostazione;
    private Integer numeroMassimoOccupanti;
    @ManyToOne
    private Edificio edificio;
}
