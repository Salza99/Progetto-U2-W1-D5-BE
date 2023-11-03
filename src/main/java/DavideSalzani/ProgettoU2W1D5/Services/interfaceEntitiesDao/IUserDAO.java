package DavideSalzani.ProgettoU2W1D5.Services.interfaceEntitiesDao;
import DavideSalzani.ProgettoU2W1D5.entities.User;

import java.util.List;

public interface IUserDAO {
    public void save(User user);
    public void findByIdAndUpdate(long id, User user);
    public void findBYIdAndDelete(long id);
    public List<User> findAll();
    public User findById(long id);
}
