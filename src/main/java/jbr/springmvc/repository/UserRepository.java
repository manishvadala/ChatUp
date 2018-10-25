package jbr.springmvc.repository;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface UserRepository {

    public void createUser(User user);

    public User validateUser(Login login);
}
