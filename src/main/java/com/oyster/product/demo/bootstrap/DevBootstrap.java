package com.oyster.product.demo.bootstrap;

import com.oyster.product.demo.model.Author;
import com.oyster.product.demo.model.Book;
import com.oyster.product.demo.repositories.AuthorRepository;
import com.oyster.product.demo.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    private void initData(){

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","1234","Harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod","Johnson");
        Book noEjb = new Book("J2EE development without EJB","23444","Worx");
        rod.getBooks().add(noEjb);

        authorRepository.save(rod);
        bookRepository.save(noEjb);

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
