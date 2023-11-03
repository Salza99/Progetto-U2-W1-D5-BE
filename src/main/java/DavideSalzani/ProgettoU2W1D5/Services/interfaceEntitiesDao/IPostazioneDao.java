package DavideSalzani.ProgettoU2W1D5.Services.interfaceEntitiesDao;

import DavideSalzani.ProgettoU2W1D5.entities.Postazione;

import java.util.List;

public interface IPostazioneDao {
    public void save(Postazione postazione);
    public void findByIdAndUpdate(long id, Postazione postazione);
    public void findBYIdAndDelete(long id);
    public List<Postazione> findAll();
    public Postazione findById(long id);
}
