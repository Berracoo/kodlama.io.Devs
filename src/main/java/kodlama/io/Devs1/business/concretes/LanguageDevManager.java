package kodlama.io.Devs1.business.concretes;

import kodlama.io.Devs1.business.abstracts.LanguageDevService;
import kodlama.io.Devs1.dataAccess.abstracts.LanguageDevRepository;
import kodlama.io.Devs1.entities.LanguageDev;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class LanguageDevManager implements LanguageDevService {
    private LanguageDevRepository languageDevRepository;
    // by this way we made loose-coupling
    private static List<LanguageDev> languageDevs;

    @Autowired
    public LanguageDevManager(LanguageDevRepository languageDevRepository) {
        this.languageDevRepository = languageDevRepository;
    }
    // we have created a constructor so that we can use LanguageDevRepository


    @Override
    public List<LanguageDev> getAll() {
        return languageDevRepository.getAll();
    }

    @Override
    public LanguageDev getById(int id) throws Exception {
        return languageDevRepository.getById(id);
    }

    @Override
    public void add(LanguageDev languageDev) throws Exception {
        if (languageDev.getProgrammingLanguage().isEmpty())
            throw new Exception("Programming Language cannot be empty.");
        for (LanguageDev languageDev1 : languageDevs){
            if(Objects.equals(((LanguageDev) languageDevs).getProgrammingLanguage(),languageDev1.getProgrammingLanguage())) {
                throw new Exception("You cannot enter the same programming language name twice.");
            }
        }
        languageDevRepository.add(languageDev);

    }

    @Override
    public void update(LanguageDev languageDev, int id) throws Exception {
        languageDevRepository.update(languageDev,id);
    }

    @Override
    public void delete(LanguageDev languageDev,int id) throws Exception {
      languageDevRepository.delete(languageDev,id);
    }
}
