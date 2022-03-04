package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("Main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        var library = context.getBean("libraryBean", Library.class);

        String bookName=library.returnBook();
        System.out.println("В библиотеку вернули книгу"+bookName);
        System.out.println("Main end");
        context.close();
    }
    }


