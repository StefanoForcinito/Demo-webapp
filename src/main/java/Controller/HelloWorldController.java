package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/v1/ciao")
    public String greet(@RequestParam(name = "nome", defaultValue = "Giuseppe") String nome,
                        @RequestParam(name = "provincia", defaultValue = "Lombardia") String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}
