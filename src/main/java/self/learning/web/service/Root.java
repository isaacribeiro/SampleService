package self.learning.web.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Root {

    @RequestMapping("/")
    String indexRequest(){
        return "Service is OK!";
    }

}
