package DavideSalzani.ProgettoU2W1D5.Services;

import DavideSalzani.ProgettoU2W1D5.Services.interfaceEntitiesDao.IPostazioneDao;
import DavideSalzani.ProgettoU2W1D5.entities.Postazione;
import DavideSalzani.ProgettoU2W1D5.entitiesRepo.PostazioneRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class PostazioneService implements IPostazioneDao {
    @Autowired
    private PostazioneRepo postazioneRepo;
    @Override
    public void save(Postazione postazione) {
        postazioneRepo.save(postazione);
        System.out.println("Postazione numero " + postazione.getId() + " salvato correttamente");
    }

    @Override
    public void findByIdAndUpdate(long id, Postazione postazione) {
        Postazione found = this.findById(id);
        found.setDescrizione(postazione.getDescrizione());
        found.setTipoPostazione(postazione.getTipoPostazione());
        found.setUtentiPrenotati(postazione.getUtentiPrenotati());
        found.setNumeroMassimoOccupanti(postazione.getNumeroMassimoOccupanti());
        postazioneRepo.save(found);
        System.out.println("Postazione aggiornata");
    }

    @Override
    public void findBYIdAndDelete(long id) {
        Postazione found = this.findById(id);
        postazioneRepo.delete(found);
        System.out.println("postazione numero " + found.getId() + " eliminata con successo");
    }

    @Override
    public List<Postazione> findAll() {
        return postazioneRepo.findAll();
    }

    @Override
    public Postazione findById(long id) {
        return postazioneRepo.findById(id).orElseThrow(RuntimeException::new);
    }
}
