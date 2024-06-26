package com.polarbookshop.catalogservice.domain;

import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface BookRepository{
    Iterable<Book> findAll();

    Optional<Book> findByIsbn(String isbn);

    boolean existsByIsbn(String isbn);

    void deleteByIsbn(String isbn);

    Book save(Book book);
}
