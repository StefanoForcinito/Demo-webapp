package Service;

import Controller.User;
import org.springframework.stereotype.Service;

@Service
public class ParameterService {

    public boolean checkParameterIsNotFound(User user) {
        if (user.getNome() != null) {
            return true;
        } else {
            return false;
        }
    }
}
