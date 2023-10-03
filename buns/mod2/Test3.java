package mod2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        Book book = new Book();
        String bookName = library.returnBook();
        library.getBook();
        library.addBook("Nick", book);
        System.out.println("В библиотеку вернули книгу " + bookName);

        context.close();
        System.out.println("Method main ends");
    }
}
