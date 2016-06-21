import dao.AuthorDao;
import dao.BookDao;
import entity.Author;
import entity.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Денис on 11.06.2016.
 */
public class Project {
    public static void main(String[] args) throws SQLException {
        Factory factory = Factory.getInstance();
        BookDao bookDao = factory.getBookDao();
        AuthorDao authorDao = factory.getAuthorDao();

        Author author = new Author();
        author.setFirstName("Gayle");
        author.setLastName("Laakmann");
        author.setMiddleName("John");

        authorDao.addAuthor(author);

        author.setFirstName("Bruce");
        author.setLastName("Eckel");
        author.setMiddleName("Joey");

        authorDao.addAuthor(author);

        List<Author> authors = authorDao.getAuthors();
        System.out.println("---- add data into db ----");
        System.out.println("id  first_name    middle_name   last_name");
        for (Author a: authors) {
            System.out.println(a.getId()+ " " + a.getFirstName() + "  "
                    + a.getMiddleName()+ "    " + a.getLastName());
        }
        
        /*//add data into db
        Book book = new Book();
        book.setTitle("Thinking in java");
        book.setDescription("decription language java");
        book.setIsbn(1234);

        bookDao.addBook(book);

        book.setTitle("Crack Code");
        book.setDescription("clean code");
        book.setIsbn(2478);

        bookDao.addBook(book);

        book.setTitle("How would you move mount fuji?");
        book.setDescription("book about interview");
        book.setIsbn(784);

        bookDao.addBook(book);

        List<Book> books = bookDao.getBooks();
        System.out.println("---- add data into db ----");
        System.out.println("id  isbn    title   description");

        for (Book b: books) {
            System.out.println(b.getId()+ "  " + b.getIsbn() + "  "
                    + b.getTitle()+ "    " + b.getDescription());
        }

        System.out.println("---- get book #3 from db ----");
        System.out.println("id  isbn    title   description");
        Book tempBook = bookDao.getBook(3);
        System.out.println(tempBook.getId()+ "  " + tempBook.getIsbn() + "  "
                + tempBook.getTitle()+ "    " + tempBook.getDescription());

        //DELETE FROM book WHERE id = 2;
        bookDao.deleteBook(bookDao.getBook(2));
        books = bookDao.getBooks();
        System.out.println("---- delete book #2 from db ----");
        System.out.println("id  isbn    title   description");

        for (Book b: books) {
            System.out.println(b.getId()+ "  " + b.getIsbn() + "  "
                    + b.getTitle()+ "    " + b.getDescription());
        }*/
    }
}
