package max.springmvc.config;

import max.springmvc.service.UserService;
import max.springmvc.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {AspectConfig.class,InfrastructureConfig.class,WebConfig.class})
@ComponentScan(basePackages="max.springmvc")
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
