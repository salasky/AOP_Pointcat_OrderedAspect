package AOP.aspects;

import AOP.Book;
import org.aspectj.lang.JoinPoint;
import   org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//Класс аспект.
//Аспект - содержит сквозщную логику
//Для использования аннотаций Aspect необходим пакет AspecJ weaver
@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("AOP.aspects.Poincat.AllAddMethod()")
    public void beforeAddBookAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature= (MethodSignature) joinPoint.getSignature();
        System.out.println("beforeAddBookAdvice: Попытка добавить книгу Logging#1");
        System.out.println("MethodSignature "+methodSignature.getMethod() );


        if(methodSignature.getName().equals("addBook")){
            Object[] arg=joinPoint.getArgs();
            for(Object obj:arg){
                if (obj instanceof Book) {
                    Book mybook=(Book) obj;
                    System.out.println("Название книги "+mybook.getName()+
                            " Автор "+mybook.getAuthor()+
                            " Год издания "+mybook.getYearsPublication());
                }
                else if(obj instanceof String){
                    System.out.println("Добавил пользователь"+obj);
                }
            }
        }
        System.out.println("---------------------------------");
    }



}
