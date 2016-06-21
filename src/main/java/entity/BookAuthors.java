package entity;

import javax.persistence.*;

/**
 * Created by Денис on 22.06.2016.
 */
@Entity
@Table(name="book_authors")
public class BookAuthors {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JoinColumn(name="book_id", referencedColumnName = "id")
    private Book book;

    @JoinColumn(name="author_id", referencedColumnName = "id")
    private Author author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

