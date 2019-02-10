package max.springmvc.service;

import max.springmvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import max.springmvc.model.Login;
import max.springmvc.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public void register(User user) {
        userRepository.createUser(user);
    }

    @Override
    public User validateUser(Login login) {
        return userRepository.validateUser(login);
    }

}