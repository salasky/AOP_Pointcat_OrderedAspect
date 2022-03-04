package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLogingAspect {
    @Before("execution(* df())")
    public void befortReturnAdvice(){
        System.out.println("befortReturnAdvice-Around");
    }
}