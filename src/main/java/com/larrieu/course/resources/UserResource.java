package com.larrieu.course.resources;
import com.larrieu.course.entities.User;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value= "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria Luiza", "navarr0@gmail.com", "9999999", "12431");
		return ResponseEntity.ok().body(u);
		
									
		
	}
}
