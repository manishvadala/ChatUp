package max.springmvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class TracingAspect {

    private Logger log = Logger.getLogger("TracingAspect");

    @Before("execution(* max.springmvc.repository.UserRepository.*(..))")
    public void traceBefore(JoinPoint point) {
//        System.out.println("Before Method Invoked --> " + point.getSignature().getName());
        log.info("Before Method Invoked -->" + point.getSignature().getName());
    }
}
