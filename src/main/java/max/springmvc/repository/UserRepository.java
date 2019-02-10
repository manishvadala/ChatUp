package max.springmvc.repository;

import max.springmvc.model.Login;
import max.springmvc.model.User;

public interface UserRepository {

    public void createUser(User user);

    public User validateUser(Login login);
}
