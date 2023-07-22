package com.BookRestApi.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookRestApi.Entity.Book;

public interface BookRepository extends JpaRepository<Book,Serializable> {

}
