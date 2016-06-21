import dao.AuthorDao;
import dao.BookAuthorDao;
import dao.BookDao;
import entity.Author;
import entity.Book;
import entity.BookAuthors;

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
        BookAuthorDao bookAuthorDao = factory.getBookAuthorDao();

        /*BookAuthors bookAuthors = new BookAuthors();

        bookAuthors.setBook(bookDao.getBook(1));
        bookAuthors.setAuthor(authorDao.getAuthor(2));
        bookAuthorDao.addBookAuthors(bookAuthors);

        bookAuthors.setBook(bookDao.getBook(5));
        bookAuthors.setAuthor(authorDao.getAuthor(2));
        bookAuthorDao.addBookAuthors(bookAuthors);

        bookAuthors.setBook(bookDao.getBook(4));
        bookAuthors.setAuthor(authorDao.getAuthor(1));
        bookAuthorDao.addBookAuthors(bookAuthors);

        bookAuthors.setBook(bookDao.getBook(3));
        bookAuthors.setAuthor(authorDao.getAuthor(3));
        bookAuthorDao.addBookAuthors(bookAuthors);*/



        /*List<Book> books = bookDao.getBooks();
        System.out.println("---- add data into db ----");
        System.out.println("id  isbn    title   description");

        for (Book b: books) {
            System.out.println(b.getId()+ "  " + b.getIsbn() + "  "
                    + b.getTitle()+ "    " + b.getDescription());
        }*/



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

        bookDao.addBook(book);*/

        List<Book> books = bookDao.getBooks();
        System.out.println("---- data in db book ----");
        System.out.println("id  isbn    title   description");

        for (Book b: books) {
            System.out.println(b.getId()+ "  " + b.getIsbn() + "  "
                    + b.getTitle()+ "    " + b.getDescription());
        }

        /*System.out.println("---- get book #3 from db ----");
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

        List<Author> authors = authorDao.getAuthors();
        System.out.println("---- data in db author ----");
        System.out.println("id  first_name    middle_name   last_name");
        for (Author a: authors) {
            System.out.println(a.getId()+ " " + a.getFirstName() + "  "
                    + a.getMiddleName()+ "    " + a.getLastName());
        }

        List<BookAuthors> bookAuthorses = bookAuthorDao.getBookAuthors();
        System.out.println("---- data in db book_authors ----");
        System.out.println("id  isbn    title   description id  first_name    middle_name   last_name");

        for (BookAuthors ba: bookAuthorses) {
            Book book = ba.getBook();
            Author author = ba.getAuthor();

            System.out.print(book.getId()+ "  " + book.getIsbn() + "  "
                    + book.getTitle()+ "    " + book.getDescription()+ "    ");

            System.out.println(author.getId()+ " " + author.getFirstName() + "  "
                    + author.getMiddleName()+ "    " + author.getLastName());
        }
    }
}
