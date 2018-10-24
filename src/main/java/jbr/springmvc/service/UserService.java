package jbr.springmvc.service;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import org.springframework.context.annotation.Bean;

public interface UserService {

    void register(User user);

    User validateUser(Login login);
}