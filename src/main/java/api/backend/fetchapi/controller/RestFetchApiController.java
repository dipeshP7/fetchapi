package api.backend.fetchapi.controller;

import api.backend.fetchapi.entity.Template;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RequestMapping("/public/fetchapi/v1/")
@RestController
public class RestFetchApiController {

    @GetMapping("/test")
    public ResponseEntity initRestFetchApi(){
        return ResponseEntity.ok("Test Method Called");
    }

    @GetMapping("/template/{id}")
    public ResponseEntity<Template> getTemplateData(@PathVariable("id") int id){
        System.out.println("calling in template data method");
        Template template = new Template();
        template.setTemplateId(111);
        template.setName("Fetch Api Function");
        template.setLocation("Java Backend");
        if(id == template.getTemplateId()){
            return new ResponseEntity<Template>(template, HttpStatus.OK);
        } else {
            System.out.println("provide template id mismatch");
            return ResponseEntity.of(Optional.empty());
        }
    }
}
