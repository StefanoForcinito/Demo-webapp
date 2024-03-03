package Controller;

import Service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class SalutoController {

    @Autowired
    public ParameterService parameterService;

    @PostMapping("/create")
    public ResponseEntity<User> insertNewParameter(@RequestBody User user) {
        if (parameterService.checkParameterIsNotFound(user)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(user);
    }

}
