package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.models.Bookmark;
import com.example.models.Customer;
import com.example.models.Login;

@Repository
public class BookmarkRepositoryImpl implements BookmarkRepository {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	@Transactional
	public int addBookmark(Bookmark bookmark) {
		bookmark = entityManager.merge(bookmark);
		return bookmark.getId();
	}

	@Override
	@Transactional
	public boolean updateBookmark(Bookmark bookmark) {
		bookmark = entityManager.merge(bookmark);
		if (bookmark.getId() > 0)
			return true;
		return false;
	}

	@Override
	public Bookmark findBookmarkById(int id) {
		Bookmark bookmark = entityManager.find(Bookmark.class, id);
		return bookmark;
	}

	@Override
	@Transactional
	public boolean deleteBookmark(int id) {
		if (id > 0) {
			Bookmark bookmark = findBookmarkById(id);
			entityManager.remove(bookmark);
			entityManager.flush();
			entityManager.clear();
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public Customer registerCustomer(Customer customer) {
		customer = entityManager.merge(customer);
		return customer;
	}

	public Customer findCustomerByEmail(String email) {
		String sql = "select c from Customer c where c.email=: e";
		Query query = entityManager.createQuery(sql);
		query.setParameter("e", email);
		List<Customer> list = query.getResultList();
		if (list.size() > 0)
			return list.get(0);
		return null;

	}

	@Override
	public List<Bookmark> gettAllBookmarks() {
		String sql="select b from Bookmark b ";
		Query query= entityManager.createQuery(sql);
		return query.getResultList();
	}

}
