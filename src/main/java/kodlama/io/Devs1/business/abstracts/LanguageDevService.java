package kodlama.io.Devs1.business.abstracts;

import kodlama.io.Devs1.entities.LanguageDev;

import java.util.List;

public interface LanguageDevService {
    List<LanguageDev> getAll();
    LanguageDev getById(int id) throws Exception;
    void add (LanguageDev languageDev) throws Exception;
    void update(LanguageDev languageDev, int id) throws Exception;
    void delete(LanguageDev languageDev,int id) throws Exception;

}
