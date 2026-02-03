package com.example.Todo.App.API.repository;


import com.example.Todo.App.API.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}


