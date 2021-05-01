package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.example.controller.Controller;
import com.example.models.Bookmark;
import com.example.models.Customer;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class BookmarkTest {
	
	@Autowired
	private Controller controller;

	@Test
	public void testAddBookmark() {
		Bookmark bookmark= new Bookmark();
		bookmark.setTitle("React");
		bookmark.setUrl("https://react.com");
		bookmark.setTag("React");
		
		int id= controller.addBookmark(bookmark);
		System.out.println(id);
	}
	
	@Test
	public void testDeleteBookmark() {
		assertTrue(controller.deleteBookmark(0));
	}
	
	@Test
	public void testGetAllBookmarks() {
		System.out.println(controller.getAllBookmarks());
	}
	
	@Test
	public void testRegisterCustomer() {
		Customer customer= new Customer();
		customer.setEmail("kalrasagar122@gmail.com");
		customer.setMobile("7988348317");
		customer.setName("Sagar");
		customer.setPassword("Sagar@1234");
		System.out.println(controller.registerCustomer(customer));
	}
	
	
	
	
	
	
	
	
	

}
