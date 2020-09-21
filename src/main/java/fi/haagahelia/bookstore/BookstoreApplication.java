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
        Book a = new Book("one thing", "mister a", "EFD-ef-32", 2019, 15.99);
        Book b = new Book("two things", "mister b","EFD-ew-32", 2018, 5.99);
        Book c = new Book("three things", "mister c","EDF-ef-32", 2020, 18.99);

        repository.save(a);
        repository.save(b);
        repository.save(c);

        };
    };

}
