package upao.book_manager_online.services;

import upao.book_manager_online.models.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);
    Book getBookById(Long id);
    List<Book> getAllBooks();

    Book addBook(Book book);

    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
    List<Book> searchBooks(String keywords);
}
