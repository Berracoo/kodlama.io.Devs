package kodlama.io.Devs1.entities;

public class LanguageDev {
    private String programmingLanguage;
    private int id;

    public LanguageDev() {

    }

    public LanguageDev(String programmingLanguage, int id) {
        this.programmingLanguage = programmingLanguage;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
