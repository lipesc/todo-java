package com.lipesc.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.lipesc.todolist.entity.Todo;
import com.lipesc.todolist.exception.BadRequestException;
import com.lipesc.todolist.repository.TodoRepository;

@Service
public class TodoService {
  private TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> list() {
    Sort sort = Sort.by(Direction.DESC, "prioridade")
        .and(Sort.by(Direction.ASC, "id"));

    return todoRepository.findAll(sort);
  }

  public List<Todo> create(Todo todo) {
    todoRepository.save(todo);
    return list();
  }

  public List<Todo> update(Long id, Todo todo) {
    todoRepository.findById(id).ifPresentOrElse((existingTodo) -> {
      todo.setId(id);
      todoRepository.save(todo);
    }, () -> {
      throw new BadRequestException("Task %d não existe! ".formatted(id));
    });

    return list();

  }

  public List<Todo> delete(Long id) {
    todoRepository.findById(id).ifPresentOrElse((existingTodo) -> todoRepository.delete(existingTodo), () -> {
      throw new BadRequestException("Task %d não existe! ".formatted(id));
    });
    return list();
  }
}
