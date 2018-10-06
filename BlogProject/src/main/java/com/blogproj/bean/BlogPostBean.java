package com.blogproj.bean;

import java.util.Date;
import java.util.List;

public class BlogPostBean {

	private long blogPostId;
	private String postText;
	private long bloggerId;
	private String blogTitle;
	private Date createDate;
	private List<BlogCommentBean> comments;

	public BlogPostBean() {
		super();
	}

	public BlogPostBean(long blogPostId, String postText, long bloggerId, Date createDate, List<BlogCommentBean> comments, String blogTitle) {
		super();
		this.blogPostId = blogPostId;
		this.postText = postText;
		this.bloggerId = bloggerId;
		this.createDate = createDate;
		this.comments = comments;
		this.blogTitle = blogTitle;
	}

	public long getBlogPostId() {
		return blogPostId;
	}

	public void setBlogPostId(long blogPostId) {
		this.blogPostId = blogPostId;
	}

	public String getPostText() {
		return postText;
	}

	public void setPostText(String postText) {
		this.postText = postText;
	}

	public long getBloggerId() {
		return bloggerId;
	}

	public void setBloggerId(long bloggerId) {
		this.bloggerId = bloggerId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public List<BlogCommentBean> getComments() {
		return comments;
	}

	public void setComments(List<BlogCommentBean> comments) {
		this.comments = comments;
	}
	
	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	
}
