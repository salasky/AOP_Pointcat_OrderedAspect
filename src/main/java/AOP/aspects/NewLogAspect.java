package AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLogAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("В библитеку пытаются вернуть книгу");

         Object obj= proceedingJoinPoint.proceed();

        System.out.println("aroundReturnLoggingAdvice:в библиотеку возвращает книгу");
        return obj;
    }
}
