package com.pubhub100.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pubhub100.model.Book;
import com.pubhub100.util.ConnectionUtil;


public class BookDAO {

	public void addBook (Book book) throws Exception
	{
		Connection connection= ConnectionUtil.getConnection();
		PreparedStatement pst=connection.prepareStatement("INSERT INTO BOOK (bname,bprice) values (?,?)");
		pst.setString(1, book.getBname());
		pst.setInt(2, book.getBprice());
		pst.executeUpdate();
	
	}
	
	public void changePrice (Book book) throws Exception
	{
		Connection connection= ConnectionUtil.getConnection();
		PreparedStatement pst=connection.prepareStatement("update book set bprice=? where bid=?");
		pst.setInt(1, book.getBid());
		pst.setInt(2, book.getBprice());
		pst.executeUpdate();

	}
	
	public void removeBook (Book book) throws Exception
	{
		Connection connection= ConnectionUtil.getConnection();
		PreparedStatement pst=connection.prepareStatement("delete from book where id=? and name=?");
		pst.setString(1, book.getBname());
		pst.executeUpdate();
	}
	
	
	public List<Book> viewAll () throws Exception
	{
		List<Book> list=new ArrayList<Book>();
		Connection connection= ConnectionUtil.getConnection();
		PreparedStatement pst=connection.prepareStatement("select bname,bprice from book where name like=?");
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			Book book=new Book();
			book.setBname(rs.getString(1));
			book.setBprice(rs.getInt(2));
			list.add(book);
		}
		return list;
	
		
	}
	
	public List<Book> viewByName (String bname) throws Exception
	{
		List<Book> list=new ArrayList<Book>();
		Connection connection= ConnectionUtil.getConnection();
		PreparedStatement pst=connection.prepareStatement("select bname,bprice from book where name like=?");
		pst.setString(1, "%"+bname+"%");
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			Book book=new Book();
			book.setBname(rs.getString(1));
			book.setBprice(rs.getInt(2));
			list.add(book);
		}
		return list;
	
	}
	}
	

