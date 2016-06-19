import dao.BookDao;
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

        //add data into db
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
        }
    }
}
