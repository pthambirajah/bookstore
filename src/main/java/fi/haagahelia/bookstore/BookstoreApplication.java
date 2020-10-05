package fi.haagahelia.bookstore;

import fi.haagahelia.bookstore.domain.*;
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
    public CommandLineRunner demo(BookRepository repository, CategoryRepository categoryRepository, UserRepository urepository){
        return (args) -> {

        Category cA = new Category("IT");
        Category cB = new Category("Business");
        Category cC = new Category("Law");

        categoryRepository.save(cA);
        categoryRepository.save(cB);
        categoryRepository.save(cC);

        Book a = new Book("one thing", "mister a", "EFD-ef-32", 2019, 15.99, cA);
        Book b = new Book("two things", "mister b","EFD-ew-32", 2018, 5.99, cB);
        Book c = new Book("three things", "mister c","EDF-ef-32", 2020, 18.99, cC);

        repository.save(a);
        repository.save(b);
        repository.save(c);

            User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER", "user@haaga.fi");
            User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN", "user@haaga.fi");
            urepository.save(user1);
            urepository.save(user2);

        };
    };

}
