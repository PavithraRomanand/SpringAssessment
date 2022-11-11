package com.training.project.BookSpringProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books {
	
	@Id
	@Column(name = "bookid")
	private int bookid;
	@Column(name = "bookname")
	private String bookname;
	@Column(name = "authorname")
	private String authorname;
	@Column(name = "publishcationname")
	private String publicationname;
	@Column(name = "price")
	private int price;
	@Column(name = "instock")
	private boolean instock;
	@Column(name = "discount")
	private float discount;
	
	
	public Books() {
		super();	
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getPublicationname() {
		return publicationname;
	}
	public void setPublicationname(String publicationname) {
		this.publicationname = publicationname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isInstock() {
		return instock;
	}
	public void setInstock(boolean instock) {
		this.instock = instock;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname
				+ ", publicationname=" + publicationname + ", price=" + price + ", instock=" + instock + ", discount="
				+ discount + "]";
	}
	
}
