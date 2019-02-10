package max.springmvc.service;

import max.springmvc.model.Login;
import max.springmvc.model.User;
import org.springframework.context.annotation.Bean;

public interface UserService {

    void register(User user);

    User validateUser(Login login);
}