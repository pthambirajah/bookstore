package fi.haagahelia.bookstore;

import fi.haagahelia.bookstore.domain.Book;
import fi.haagahelia.bookstore.domain.BookRepository;
import fi.haagahelia.bookstore.domain.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class BookstoreRepositoryTest {

    @Autowired
    private BookRepository repository;

    @Test
    public void createNewStudent() {
        Book book = new Book("Title one", "Author g", "ESBND32", 2021, 32, new Category("ITSEC"));
        repository.save(book);
        assertThat(book.getId()).isNotNull();
    }

    @Test
    public void deleteStudent() {
        List<Book> books = repository.findBookByAuthor("mister a");

        repository.delete(books.get(0));

        books = repository.findBookByAuthor("mister a");

        assertThat(books).hasSize(0);
    }

    @Test
    public void findByAuthorShouldReturnBook(){

        List<Book> books = repository.findBookByAuthor("mister a");

        assertThat(books).hasSize(1);
    }



}