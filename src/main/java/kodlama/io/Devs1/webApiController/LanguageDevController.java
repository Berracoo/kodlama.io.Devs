package kodlama.io.Devs1.webApiController;

import kodlama.io.Devs1.business.abstracts.LanguageDevService;
import kodlama.io.Devs1.entities.LanguageDev;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/languageDevs")
public class LanguageDevController {
        private LanguageDevService languageDevService;
    @Autowired
    public LanguageDevController(LanguageDevService languageDevService) {
        this.languageDevService = languageDevService;
    }
    @GetMapping("/getAll") // get mapping is for getting a single or multiple resources
    // path variable is for extracting the resource that we invoke with get mapping
    public List<LanguageDev> getAll() {
        return languageDevService.getAll();
    }
    public LanguageDev getById(@PathVariable() int id) throws Exception {
        return languageDevService.getById(id);
    }
    @PostMapping("/add") // post mapping is for creating a resource
    public void add(@RequestBody LanguageDev languageDev) throws Exception{
        languageDevService.add(languageDev);
    }
    @PutMapping("/update") // put mapping is for updating a resource
    public void update(@RequestBody LanguageDev languageDev,@PathVariable int id) throws Exception {
        languageDevService.update(languageDev,id);
    }

    @DeleteMapping("/{id}") // delete mapping is for deleting a resource
    public void delete(@RequestBody LanguageDev languageDev, @PathVariable(name = "id") int id) throws Exception {
        languageDevService.delete(languageDev, id);
    }
}
