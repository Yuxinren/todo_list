package com.peterFirstApp.todolist.models;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todo_item")
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @NotBlank(message = "Description is required")
    private String description;

    @Getter
    @Setter
    private boolean complete;

    @Getter
    @Setter
    private String createdDate;

    @Getter
    @Setter
    private String modifiedDate;

    public TodoItem() {
    }

    public TodoItem(String description) {
        this.description = description;
        this.complete = false;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.createdDate = dtf.format(now);
        this.modifiedDate = dtf.format(now);
    }

    @Override
    public String toString() {
        return String.format(
                "TodoItem{id = %d, description = '%s', complete = '%s', createdDate = '%s', modifiedDate = '%s'}",
                id, description, complete, createdDate, modifiedDate);
    }
}
