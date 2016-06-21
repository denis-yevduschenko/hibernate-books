package dao.impl;

import dao.BookAuthorDao;
import entity.BookAuthors;
import org.hibernate.Session;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Денис on 22.06.2016.
 */
public class BookAuthorDaoImpl implements BookAuthorDao {
    public void addBookAuthors(BookAuthors bookAuthors) throws SQLException {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(bookAuthors);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())){
                session.close();
            }
        }
    }

    public List<BookAuthors> getBookAuthors() throws SQLException {
        List<BookAuthors> authorsList = null;

        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            authorsList = session.createCriteria(BookAuthors.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())){
                session.close();
            }
        }


        return authorsList;
    }

    public BookAuthors getBookAuthors(int id) throws SQLException {
        BookAuthors result = null;

        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            result = session.get(BookAuthors.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())){
                session.close();
            }
        }

        return result;
    }

    public void deleteBookAuthors(BookAuthors bookAuthors) throws SQLException {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(bookAuthors);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())){
                session.close();
            }
        }
    }
}
