package fi.haagahelia.bookstore;

import fi.haagahelia.bookstore.web.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BookstoreApplicationTests {

    @Autowired
    private BookController bookController;

    @Test
    void contextLoads() throws Exception {
        assertThat(bookController).isNotNull();
    }

}
