package com.mypackage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer BookId;
	@Column(name = "BookName" , length = 50)
	private String bookName;
	@Column(name = "AuthorName" , length = 50)
	private String authorName;
	private Integer Price;
	private Integer Quantity;
	@Column(columnDefinition = "LONGBLOB")
	private byte[] Book_Pic;
	public Integer getBookId() {
		return BookId;
	}
	public void setBookId(Integer bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Integer getPrice() {
		return Price;
	}
	public void setPrice(Integer price) {
		Price = price;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public byte[] getBook_Pic() {
		return Book_Pic;
	}
	public void setBook_Pic(byte[] book_Pic) {
		Book_Pic = book_Pic;
	}
	
	
	
	
}
