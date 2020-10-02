package fi.haagahelia.bookstore.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;


@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long categoryid;
    private String categoryName;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private List<Book> books;

    public Category() {
    }

    public Category( String categoryName) {
        super();
        this.categoryName = categoryName;
    }

    public long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(long id) {
        this.categoryid = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String title) {
        this.categoryName = title;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + categoryid +
                ", title='" + categoryName + '\'' +
                '}';
    }
}