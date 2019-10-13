package com.in28minutes.springboot.web.controller;

import com.in28minutes.springboot.web.model.Todo;
import com.in28minutes.springboot.web.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;
import java.util.List;

@Controller
@SessionAttributes("login_name")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("/list-todos")
    public String listTodos(ModelMap model) {
        String userName = (String) model.get("login_name");
        List<Todo> todos = todoService.retrieveTodos(userName);
        model.put("todos", todos);
        return "list-todos";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showAddTodoPage(ModelMap model) {
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodo(ModelMap model, @RequestParam String description) {
        todoService.addTodo((String) model.get("login_name"), description, new Date(), false);
        return "redirect:/list-todos";
    }

    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(ModelMap model, @RequestParam("id") int taskId) {
        todoService.deleteTodo(taskId);
        return "redirect:/list-todos";
    }

}
