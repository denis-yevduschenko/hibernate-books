import dao.AuthorDao;
import dao.BookAuthorDao;
import dao.BookDao;
import dao.impl.AuthorDaoImpl;
import dao.impl.BookAuthorDaoImpl;
import dao.impl.BookDaoImpl;


public class Factory {
    private static Factory instance = new Factory();
    private BookDao bookDao;
    private AuthorDao authorDao;
    private BookAuthorDao bookAuthorDao;

    private Factory() { }

    public static Factory getInstance(){
        return Factory.instance;
    }

    public BookDao getBookDao(){
        if (bookDao == null){
            bookDao = new BookDaoImpl();
        }
        return bookDao;
    }

    public AuthorDao getAuthorDao(){
        if (authorDao == null){
            authorDao = new AuthorDaoImpl();
        }
        return authorDao;
    }

    public BookAuthorDao getBookAuthorDao(){
        if (bookAuthorDao == null){
            bookAuthorDao = new BookAuthorDaoImpl();
        }
        return bookAuthorDao;
    }
}
