package dao.impl;

import dao.AuthorDao;
import entity.Author;
import org.hibernate.Session;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Денис on 21.06.2016.
 */
public class AuthorDaoImpl implements AuthorDao {
    public void addAuthor(Author author) throws SQLException {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(author);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())){
                session.close();
            }
        }
    }

    public void deleteAuthor(Author author) throws SQLException {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(author);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())){
                session.close();
            }
        }
    }

    public Author getAuthor(int id) throws SQLException {
        Author result = null;
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            result = session.get(Author.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())){
                session.close();
            }
        }

        return result;
    }

    public List<Author> getAuthors() throws SQLException {
        List<Author> authors = null;

        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            authors = session.createCriteria(Author.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())){
                session.close();
            }
        }

        return authors;
    }
}
