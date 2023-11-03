package DavideSalzani.ProgettoU2W1D5.entitiesRepo;

import DavideSalzani.ProgettoU2W1D5.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
