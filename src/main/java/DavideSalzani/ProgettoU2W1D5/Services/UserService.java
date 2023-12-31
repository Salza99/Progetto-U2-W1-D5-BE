package DavideSalzani.ProgettoU2W1D5.Services;

import DavideSalzani.ProgettoU2W1D5.Services.interfaceEntitiesDao.IUserDAO;
import DavideSalzani.ProgettoU2W1D5.entities.User;
import DavideSalzani.ProgettoU2W1D5.entitiesRepo.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class UserService implements IUserDAO {
    @Autowired
    private UserRepo userRepo;
    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public void findByIdAndUpdate(long id, User user) {
        User found = this.findById(id);
        found.setUsername(user.getUsername());
        found.setPrenotazionePostazioni(user.getPrenotazionePostazioni());
        userRepo.save(found);
        System.out.println("nuovo utente salvato correttamente");
    }

    @Override
    public void findBYIdAndDelete(long id) {
        User found = this.findById(id);
        userRepo.delete(found);
        System.out.println("utente eliminato con successo");
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepo.findById(id).orElseThrow(RuntimeException::new);
    }
}
