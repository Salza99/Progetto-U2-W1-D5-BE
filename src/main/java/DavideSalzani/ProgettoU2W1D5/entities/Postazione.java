package DavideSalzani.ProgettoU2W1D5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "postazione")
@Getter
@Setter
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
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;
    @ManyToMany(mappedBy = "prenotazioni")
    private List<User> utentiPrenotati;
}
