package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo(1, "yunz", "Learn AWS", LocalDate.now().plusMonths(1l), false));
		todos.add(new Todo(1, "yunz", "Learn DevOps", LocalDate.now().plusYears(1l), false));
		todos.add(new Todo(1, "yunz", "Learn Java", LocalDate.now().plusMonths(2l), false));
	}
	
	public List<Todo> findByUsername(String username) {
		
		return todos;
	}
}
