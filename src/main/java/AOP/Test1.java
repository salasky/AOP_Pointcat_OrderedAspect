package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        var library = context.getBean("libraryBean", Library.class);
        //Вызов метода, к которому прикреплен Advice метод

        Book book=context.getBean("book",Book.class);

        library.addBook("Salavat",book);
        library.addMagazine();
        library.getBook();
        library.returnBook();
        library.returnMagazine();
        context.close();
    }
}
