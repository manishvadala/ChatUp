package jbr.springmvc.config;

import jbr.springmvc.service.UserService;
import jbr.springmvc.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="jbr.springmvc")
public class AppConfig {

    @Bean
    public UserService register() {
        return new UserServiceImpl();
    }

    @Bean
    public UserService validateUser() {
        return new UserServiceImpl();
    }
}
