package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ThrowAspect {
    @Before("AOP.aspects.Poincat.AllMethodNotReturn()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Logging#3");
    }
}
