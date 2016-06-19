package dao;

import entity.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Денис on 11.06.2016.
 */
public interface BookDao {
    public void addBook(Book book) throws SQLException;
    public void deleteBook(Book book) throws SQLException;
    public Book getBook(int id) throws SQLException;
    public List<Book> getBooks() throws SQLException;
}
