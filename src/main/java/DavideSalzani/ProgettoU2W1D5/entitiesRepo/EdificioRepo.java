package DavideSalzani.ProgettoU2W1D5.entitiesRepo;

import DavideSalzani.ProgettoU2W1D5.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepo extends JpaRepository<Edificio, Long> {
    
}
