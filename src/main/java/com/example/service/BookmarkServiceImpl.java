package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Bookmark;
import com.example.models.Customer;
import com.example.models.Login;
import com.example.repository.BookmarkRepository;

@Service
public class BookmarkServiceImpl implements BookmarkService {
	
	@Autowired
	private BookmarkRepository repository;

	@Override
	public List<Bookmark> getAllBookmarks() {
		return repository.gettAllBookmarks();
	}

	@Override
	public int addBookmark(Bookmark bookmark) {
		return repository.addBookmark(bookmark);
	}

	@Override
	public boolean updateBookmark(Bookmark bookmark) {
		return repository.updateBookmark(bookmark);
	}

	@Override
	public boolean deleteBookmark(int id) {
		return repository.deleteBookmark(id);
	}

	@Override
	public Customer registerCustomer(Customer customer) {
		Customer cus= repository.findCustomerByEmail(customer.getEmail());
		if(cus==null)
			return repository.registerCustomer(customer);
		return null;
	}

	@Override
	public Customer loginCustomer(Login login) {
		Customer customer= repository.findCustomerByEmail(login.getEmail());
		if(customer!=null) {
			if(customer.getPassword().equals(login.getPassword()))
				return customer;
		}
		return null;
	}

	@Override
	public Bookmark findBookmarkById(int id) {
		return repository.findBookmarkById(id);
	}
	

}
