package DavideSalzani.ProgettoU2W1D5.Services.interfaceEntitiesDao;

import DavideSalzani.ProgettoU2W1D5.entities.Edificio;

import java.util.List;

public interface IEdificioDAO {
    public void save(Edificio edificio);
    public void findByIdAndDelete(long id, Edificio edificio);
    public Edificio findById(long id);
    public List<Edificio> findAll();
}
