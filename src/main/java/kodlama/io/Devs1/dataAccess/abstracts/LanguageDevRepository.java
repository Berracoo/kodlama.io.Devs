package kodlama.io.Devs1.dataAccess.abstracts;

import kodlama.io.Devs1.entities.LanguageDev;

import java.util.List;

public interface LanguageDevRepository {
    LanguageDev getById(int id) throws Exception;
    List<LanguageDev> getAll();

    void add(LanguageDev languageDev);

    void update (LanguageDev languageDev, int id) throws Exception;

    void delete(LanguageDev languageDev, int id) throws Exception;
}
