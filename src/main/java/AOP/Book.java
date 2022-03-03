package AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Война и мир")
    private String name;

    @Value("Л.Н.Толстой")
    private String author;

    @Value("1859")
    private int yearsPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearsPublication() {
        return yearsPublication;
    }

}
