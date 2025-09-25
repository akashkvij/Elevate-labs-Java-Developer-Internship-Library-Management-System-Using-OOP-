package com.elevatelabs.internship;

public class Book3 {
	private int bid;
	private String bname;
	private String bauthor;
	private boolean issued;
	
	
	public Book3(int bid, String bname, String bauthor) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bauthor = bauthor;
		this.issued=false;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public boolean isIssued() {
		return issued;
	}
	public void setIssued(boolean issued) {
		this.issued = issued;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + ", issued=" + issued + "]";
	}
	
	

}
