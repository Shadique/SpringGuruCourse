package com.example.SpringGuruCourse.repositories;

import com.example.SpringGuruCourse.domin.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookReprository extends CrudRepository<Book,Long> {
}
