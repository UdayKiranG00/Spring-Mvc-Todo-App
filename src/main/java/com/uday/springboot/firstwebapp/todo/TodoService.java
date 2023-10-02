package com.uday.springboot.firstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {

	private static List<Todo> todos=new ArrayList<Todo>();
	private static int id=0;
	public TodoService(){
		
	}
	static {
		todos.add(new Todo(++id,"Java","springboot",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++id,"Aws","amazon aws cloud",LocalDate.now().plusYears(2),false));
		todos.add(new Todo(++id,"Machine Learning","ml for robotics",LocalDate.now().plusYears(3),false));
	}
	
	public List<Todo> getTodosByUsername(String username){
		Predicate<? super Todo> predicate = todo -> todo.getUsername() == username;
		List<Todo> todoss =  (todos.stream().filter(predicate)).toList();
		return todoss;
	}
	
	public void addTodo(String username,String description,LocalDate targetTime,boolean done) {
		Todo todo =new Todo(++id,username,description,targetTime,done);
		todos.add(todo);
	}

	public void deleteById(int id2) {
		// TODO Auto-generated method stub
		Predicate<? super Todo> predicate = todo -> todo.getId() == id2;
		todos.removeIf(predicate);
	}

	public Todo findById(int id2) {
		// TODO Auto-generated method stub
		Predicate<? super Todo> predicate = todo -> todo.getId() == id2;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		// TODO Auto-generated method stub
		deleteById(todo.getId());
		todos.add(todo);
	}
}
