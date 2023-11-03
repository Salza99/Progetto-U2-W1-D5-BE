package DavideSalzani.ProgettoU2W1D5.Services;

import DavideSalzani.ProgettoU2W1D5.Services.interfaceEntitiesDao.IEdificioDAO;
import DavideSalzani.ProgettoU2W1D5.entities.Edificio;
import DavideSalzani.ProgettoU2W1D5.entitiesRepo.EdificioRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EdificioService implements IEdificioDAO {
    @Autowired
    private EdificioRepo edificioRepo;

    @Override
    public void save(Edificio edificio) {
        edificioRepo.save(edificio);
        System.out.println("Edificio numero " + edificio.getNome() + " salvato correttamente");
    }

    @Override
    public void findByIdAndDelete(long id, Edificio edificio) {
        Edificio found = this.findById(id);
        edificioRepo.delete(found);
        System.out.println("Edificio numero " + found.getNome() + " eliminato con successo");
    }

    @Override
    public Edificio findById(long id) {
        return edificioRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Edificio> findAll() {
        return edificioRepo.findAll();
    }
}
