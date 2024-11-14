package com.lipesc.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lipesc.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
