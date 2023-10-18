package org.example.app.services;

import org.apache.log4j.Logger;
import org.example.web.dto.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class BookRepository implements ProjectRepository<Book> {

    private final Logger logger = Logger.getLogger(BookRepository.class);
    private final List<Book> repo = new ArrayList<>();

    @Override
    public List<Book> retrieveAll() {
        return new ArrayList<>(repo);
    }

    @Override
    public void store(Book book) {
        book.setId(book.hashCode());
        logger.info("store new book: " + book);
        if(!Objects.equals(book.getAuthor(), "") ||
                !Objects.equals(book.getTitle(), "") ||
                book.getSize() != null)
            repo.add(book);
    }

    @Override
    public boolean removeItemById(Integer bookIdToRemove) {
        for (Book book : retrieveAll()) {
            if (book.getId().equals(bookIdToRemove)) {
                logger.info("remove book completed: " + book);
                return repo.remove(book);
            } else {
                logger.info("remove book failed: " + book);
            }
        }
        return false;
    }

    @Override
    public boolean removeItemByRegex(String regexQuery) {
        for (Book book : retrieveAll()) {
            if(book.getAuthor().equals(regexQuery) ||
                    book.getTitle().equals(regexQuery) ||
                    book.getSize().equals(Integer.valueOf(regexQuery))){
                logger.info("remove book completed: " + book);
                return repo.remove(book);
            } else {
                logger.info("remove book failed: " + book);
            }
        }
        return false;
    }
}
