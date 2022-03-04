package AOP;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    //Пусть у нас его сквозная логика связанная с этим методом, но
    //к нему ничего писать не надо
    public void getBook() {
        System.out.println("Мы берем книгу");
        System.out.println("---------------------------------");
    }
    public String returnBook(){
        System.out.println("Возвращаем книгу");
        return "Война и Мир";
    }
    public void getMagazine() {
        System.out.println("Мы берем журнал");
        System.out.println("---------------------------------");
    }
    public void returnMagazine(){
        System.out.println("Возвращаем журнал");
        System.out.println("---------------------------------");
    }
    public void addBook(String person,Book book){
        System.out.println("Добавляем книгу");
        System.out.println("---------------------------------");
    }
    public void addMagazine(){
        System.out.println("Добавляем журнал");
        System.out.println("---------------------------------");
    }

}
