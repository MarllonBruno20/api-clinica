package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Anotação utilizada por API's REST
@RequestMapping("/hello") //Qual a URL que esse Controller vai responder
public class HelloController {

    @GetMapping //Se chegar uma requisição no /hello do tipo GET, execute o método olaMundo
    public String olaMundo(){
        return "Hello World Spring";
    }

}
