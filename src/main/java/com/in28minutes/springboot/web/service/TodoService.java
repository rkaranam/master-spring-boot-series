package com.in28minutes.springboot.web.service;

import com.in28minutes.springboot.web.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todoList = new ArrayList<>();
    private static int todoCount = 5;

    static {
        todoList.add(new Todo(101, "in28Minutes", "Learn Spring MVC", new Date(), false));
        todoList.add(new Todo(102, "rkaranam", "Learn Spring Boot", new Date(), false));
        todoList.add(new Todo(103, "in28Minutes", "Learn Hibernate", new Date(), false));
        todoList.add(new Todo(104, "rkaranam", "Learn VueJS", new Date(), false));
        todoList.add(new Todo(105, "in28Minutes", "Learn Microservices", new Date(), false));
    }

    public List<Todo> retrieveTodos(String userName) {
        List<Todo> resultList = new ArrayList<>();
        for (Todo todo : todoList) {
            if (todo.getUser().equals(userName)) {
                resultList.add(todo);
            }
        }
        return resultList;
    }

    public void addTodo(String userName, String description, Date targetDate, boolean isDone) {
        todoList.add(new Todo(++todoCount, userName, description, targetDate, isDone));
    }

    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todoList.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
        /*
        * Above code can be replaced with
        * todoList.removeIf(todo -> todo.getId() == id);
        */
    }

}
