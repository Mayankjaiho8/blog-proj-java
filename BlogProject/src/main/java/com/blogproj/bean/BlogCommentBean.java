package com.blogproj.bean;

import java.util.Date;

public class BlogCommentBean {

	private long blogCommentId;
	private long blogPostId;
	private String commentText;
	private Date createDate;
	
	
	public BlogCommentBean() {
		super();
	}
	
	public BlogCommentBean(long blogCommentId, long blogPostId, String commentText, Date createDate) {
		super();
		this.blogCommentId = blogCommentId;
		this.blogPostId = blogPostId;
		this.commentText = commentText;
		this.createDate = createDate;
	}

	public long getBlogCommentId() {
		return blogCommentId;
	}
	public void setBlogCommentId(long blogCommentId) {
		this.blogCommentId = blogCommentId;
	}
	public long getBlogPostId() {
		return blogPostId;
	}
	public void setBlogPostId(long blogPostId) {
		this.blogPostId = blogPostId;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
