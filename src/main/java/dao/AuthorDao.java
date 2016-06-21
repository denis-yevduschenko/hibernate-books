package dao;

import entity.Author;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Денис on 21.06.2016.
 */
public interface AuthorDao {
    public void addAuthor(Author author) throws SQLException;
    public void deleteAuthor(Author author) throws SQLException;
    public Author getAuthor(int id) throws SQLException;
    public List<Author> getAuthors() throws SQLException;
}
