package dao;

import entity.BookAuthors;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Денис on 22.06.2016.
 */
public interface BookAuthorDao {
    public void addBookAuthors(BookAuthors bookAuthors) throws SQLException;
    public List<BookAuthors> getBookAuthors() throws SQLException;
    public BookAuthors getBookAuthors(int id) throws SQLException;
    public void deleteBookAuthors(BookAuthors bookAuthors) throws SQLException;
}
