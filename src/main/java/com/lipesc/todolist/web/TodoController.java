package com.lipesc.todolist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lipesc.todolist.entity.Todo;
import com.lipesc.todolist.service.TodoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tasks")
public class TodoController {
  @Autowired
  private TodoService todoService;

  
  @GetMapping
  List<Todo> list() {
    return todoService.list();
  }
  
  @PostMapping
  ResponseEntity<List<Todo>> create(@Valid @RequestBody Todo todo) {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(todoService.create(todo));
  }
  
  @PutMapping("{id}")
  List<Todo> update(@PathVariable Long id, @RequestBody Todo todo) {
    return todoService.update(id, todo);
  }

  @DeleteMapping("{id}")
  List<Todo> delete(@PathVariable Long id) {
    return todoService.delete(id);
  }
}
