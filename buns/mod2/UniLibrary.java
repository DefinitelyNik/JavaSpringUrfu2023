package mod2;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(Book book) {
        System.out.println("Мы берем книгу \"" + book.getName() + "\" из UniLibrary");
    }

//    public String returnBook() {
//        System.out.println("Мы возвращаем книгу в UniLibrary");
//        return "ok";
//    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
    }
}
