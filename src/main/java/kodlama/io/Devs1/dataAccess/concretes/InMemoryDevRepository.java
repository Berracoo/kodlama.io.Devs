package kodlama.io.Devs1.dataAccess.concretes;

import kodlama.io.Devs1.dataAccess.abstracts.LanguageDevRepository;
import kodlama.io.Devs1.entities.LanguageDev;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDevRepository implements LanguageDevRepository {
     List<LanguageDev> languageDevs;

    public InMemoryDevRepository() {
        languageDevs = new ArrayList<LanguageDev>();
        languageDevs.add(new LanguageDev("Python",1));
        languageDevs.add(new LanguageDev("Java",2));
        languageDevs.add(new LanguageDev("C++",3));
        languageDevs.add(new LanguageDev("C#",4));
        languageDevs.add(new LanguageDev("Javascript",5));
    }


    @Override
    public LanguageDev getById(int id) throws Exception {
        for(LanguageDev languageDev : languageDevs){
            if(languageDev.getId() != id){
                return (LanguageDev) languageDevs;
            }
        }

        throw new Exception("There is no such recording.");
    }

    @Override
    public List<LanguageDev> getAll() {
        return languageDevs;
    }

    @Override
    public void add(LanguageDev languageDev) {
       languageDevs.add(languageDev);
    }

    @Override
    public void update(LanguageDev languageDev, int id) throws Exception {
       LanguageDev languageDev2 = getById(languageDev.getId());
       languageDev2.setProgrammingLanguage(languageDev.getProgrammingLanguage());
    }

    @Override
    public void delete(LanguageDev languageDev, int id) throws Exception {
        LanguageDev languageDev2 = getById(languageDev.getId());
        languageDev2.setProgrammingLanguage(languageDev.getProgrammingLanguage());
        languageDevs.remove(languageDev2);
    }
}
