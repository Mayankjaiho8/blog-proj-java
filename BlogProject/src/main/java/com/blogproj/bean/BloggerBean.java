package com.blogproj.bean;

public class BloggerBean {

	private long bloggerId;
	private String bloggerName;
	
	public BloggerBean() {}
	
	public BloggerBean(long bloggerId, String bloggerName) {
		super();
		this.bloggerId = bloggerId;
		this.bloggerName = bloggerName;
	}
	
	public long getBloggerId() {
		return bloggerId;
	}
	
	public void setBloggerId(long bloggerId) {
		this.bloggerId = bloggerId;
	}
	
	public String getBloggerName() {
		return bloggerName;
	}
	
	public void setBloggerName(String bloggerName) {
		this.bloggerName = bloggerName;
	}
}
