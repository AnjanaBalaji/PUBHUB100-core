package com.pubhub100.dao;


import com.pubhub100.model.Book;

public class TestBookDAO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Book book=new Book();
        book.setBname("stars");
		book.setBprice(125);
		BookDAO dao=new BookDAO();
		dao.addBook(book);
		
	}

}
