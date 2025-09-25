package com.elevatelabs.internship;

public class User3 {
	private int uid;
	private String name;
	
	public User3(int uid, String name) {
		
		this.uid = uid;
		this.name = name;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User3 [uid=" + uid + ", name=" + name + "]";
	}
	
	

}
