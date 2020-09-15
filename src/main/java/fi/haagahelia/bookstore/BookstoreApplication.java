package fi.haagahelia.bookstore;

import fi.haagahelia.bookstore.domain.Book;
import fi.haagahelia.bookstore.domain.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(BookRepository repository){
        return (args) -> {
        Book a = new Book("one thing", "mister a");
        Book b = new Book("two things", "mister b");
        Book c = new Book("three things", "mister c");

        repository.save(a);
        repository.save(b);
        repository.save(c);

        };
    };

}
