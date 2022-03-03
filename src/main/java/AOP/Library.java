package AOP;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    //Пусть у нас его сквозная логика связанная с этим методом, но
    //к нему ничего писать не надо
    public void getBook() {
        System.out.println("Мы берем книгу");
    }
    public void returnBook(){
        System.out.println("Возвращаем книгу");
    }
    public void getMagazine() {
        System.out.println("Мы берем журнал");
    }
    public void returnMagazine(){
        System.out.println("Возвращаем журнал");
    }
    public void addBook(){
        System.out.println("Добавляем книгу");
    }
    public void addMagazine(){
        System.out.println("Добавляем журнал");
    }

}
