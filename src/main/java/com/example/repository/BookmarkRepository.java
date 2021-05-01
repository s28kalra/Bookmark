package com.example.repository;

import java.util.List;

import com.example.models.Bookmark;
import com.example.models.Customer;
import com.example.models.Login;

public interface BookmarkRepository {
	
	List<Bookmark> gettAllBookmarks();
	int addBookmark( Bookmark bookmark);
	Bookmark findBookmarkById(int id);
	boolean updateBookmark( Bookmark bookmark);
	boolean deleteBookmark( int id);
	Customer registerCustomer( Customer customer);
	Customer findCustomerByEmail(String email);


}
