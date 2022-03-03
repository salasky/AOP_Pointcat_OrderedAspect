package AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;


public class Poincat {
    @Pointcut("execution(* add*(..))")
    public void AllAddMethod(){
    }

    @Pointcut("execution(* return*())")
    public void AllReturnMethod(){
    }
    @Pointcut("execution(* get*())")
    public void AllGetMethod(){
    }
    //комбинирование аспектов
    @Pointcut("AllAddMethod() && !AllReturnMethod()")
    public void AllMethodNotReturn(){
    }


}
