package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ThrowAspect {
    @Before("AOP.aspects.Poincat.AllAddMethod()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeAddBookAdvice: Throw#3");
        System.out.println("---------------------------------");
    }
}
