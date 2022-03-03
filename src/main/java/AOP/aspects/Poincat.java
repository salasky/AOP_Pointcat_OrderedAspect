package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class Poincat {
    @Pointcut("execution(* get*())")
    public void AllGetMethod(){
    }

    @Pointcut("execution(* return*())")
    public void AllReturnMethod(){
    }

    @Pointcut("AllGetMethod() && !AllReturnMethod()")
    public void AllMethodNotReturn(){

    }
}
