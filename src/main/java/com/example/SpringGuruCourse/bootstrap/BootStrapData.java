package com.example.SpringGuruCourse.bootstrap;

import com.example.SpringGuruCourse.domin.Author;
import com.example.SpringGuruCourse.domin.Book;
import com.example.SpringGuruCourse.repositories.AuthorRepository;
import com.example.SpringGuruCourse.repositories.BookReprository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookReprository bookReprository;

    public BootStrapData(AuthorRepository authorRepository, BookReprository bookReprository) {
        this.authorRepository = authorRepository;
        this.bookReprository = bookReprository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric= new Author("Eric","Evans");
        Book ericBook=new Book("Spring Boot Book","234234");
        eric.getBooks().add(ericBook);
        ericBook.getAuthors().add(eric);

        authorRepository.save(eric);
        bookReprository.save(ericBook);

        Author rod= new Author("Rod", "Johnson");
        Book noEjb= new Book("J2EE Developent without EJB","43534534");
        rod.getBooks().add(noEjb);
        noEjb.getAuthors().add(rod);

        authorRepository.save(rod);
        bookReprository.save(noEjb);

        System.out.println("Started Bootstarp");
        System.out.println("Number of Books: "+bookReprository.count());

    }
}
