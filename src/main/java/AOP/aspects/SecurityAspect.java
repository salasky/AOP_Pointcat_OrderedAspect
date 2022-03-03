package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before("AOP.aspects.Poincat.AllAddMethod()")
    public void beforeAddBookAdvice() {
        System.out.println("beforeAddBookAdvice: Security#2");
        System.out.println("---------------------------------");
    }
}
