package com.andrew.spdjpa.repositories;

import com.andrew.spdjpa.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
