package AOP.aspects;

import   org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//Класс аспект.
//Аспект - содержит сквозщную логику
//Для использования аннотаций Aspect необходим пакет AspecJ weaver
@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("AOP.aspects.Poincat.AllMethodNotReturn()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: Logging#1");
    }



}
