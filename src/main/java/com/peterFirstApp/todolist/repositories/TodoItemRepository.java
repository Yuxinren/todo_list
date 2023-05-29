package com.peterFirstApp.todolist.repositories;

import org.springframework.data.repository.CrudRepository;

import com.peterFirstApp.todolist.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

}
