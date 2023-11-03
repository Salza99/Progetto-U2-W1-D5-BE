package DavideSalzani.ProgettoU2W1D5.entitiesRepo;

import DavideSalzani.ProgettoU2W1D5.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneRepo extends JpaRepository<Postazione, Long> {
}
