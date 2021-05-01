package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Bookmark;
import com.example.models.Customer;
import com.example.models.Login;
import com.example.service.BookmarkService;

@RestController
@CrossOrigin
public class Controller {
	
	@Autowired
	private BookmarkService service;
	
	@GetMapping("/getAllBookmarks")
	public List<Bookmark> getAllBookmarks(){
		
		return service.getAllBookmarks();
	}
	
	@PostMapping("/addBookmark")
	public int addBookmark(@RequestBody Bookmark bookmark) {
		
		return service.addBookmark(bookmark);
	}
	
	@PostMapping("/updateBookmark")
	public boolean updateBookmark(@RequestBody Bookmark bookmark) {
		
		return service.updateBookmark(bookmark);
	}
	
	@PostMapping("/deleteBookmark")
	public boolean deleteBookmark(@RequestBody int id) {
		
		return service.deleteBookmark(id);
	}
	
	@PostMapping("/registerCustomer")
	public Customer registerCustomer(@RequestBody Customer customer) {
		
		return service.registerCustomer(customer);
	}
	
	@PostMapping("/loginCustomer")
	public Customer loginCustomer(@RequestBody Login login) {
		
		return service.loginCustomer(login);
	}
	
	@PostMapping("/findBookmarkById")
	public Bookmark findBookmarkById(@RequestBody int id) {
		return service.findBookmarkById(id);
	}
	
	
	
	
	
	
	
	
	

}
