import dao.AuthorDao;
import dao.BookDao;
import dao.impl.AuthorDaoImpl;
import dao.impl.BookDaoImpl;

/**
 * Created by Денис on 11.06.2016.
 */
public class Factory {
    public static Factory instance = new Factory();
    public BookDao bookDao;
    public AuthorDao authorDao;

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
}
