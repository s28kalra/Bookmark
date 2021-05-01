package com.example.service;

import java.util.List;

import com.example.models.Bookmark;
import com.example.models.Customer;
import com.example.models.Login;

 public interface BookmarkService {
	
	List<Bookmark> getAllBookmarks();
	 int addBookmark( Bookmark bookmark);
	 boolean updateBookmark( Bookmark bookmark);
	 boolean deleteBookmark( int id);
	 Customer registerCustomer( Customer customer);
	 Customer loginCustomer( Login login);
	 Bookmark findBookmarkById(int id);
	
}
