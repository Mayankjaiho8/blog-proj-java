package com.blogproj.dto;

public class GetSummaryPostsDTO {

	private long bloggerId;
	private long blogId;
	private String bloggerName;
	private String blogTitle;
	private String blogSummarisedText;
	
	
	public GetSummaryPostsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public GetSummaryPostsDTO(long bloggerId, long blogId, String bloggerName, String blogTitle,
			String blogSummarisedText) {
		super();
		this.bloggerId = bloggerId;
		this.blogId = blogId;
		this.bloggerName = bloggerName;
		this.blogTitle = blogTitle;
		this.blogSummarisedText = blogSummarisedText;
	}


	public long getBloggerId() {
		return bloggerId;
	}


	public void setBloggerId(long bloggerId) {
		this.bloggerId = bloggerId;
	}


	public long getBlogId() {
		return blogId;
	}


	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}


	public String getBloggerName() {
		return bloggerName;
	}


	public void setBloggerName(String bloggerName) {
		this.bloggerName = bloggerName;
	}


	public String getBlogTitle() {
		return blogTitle;
	}


	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}


	public String getBlogSummarisedText() {
		return blogSummarisedText;
	}


	public void setBlogSummarisedText(String blogSummarisedText) {
		this.blogSummarisedText = blogSummarisedText;
	}
	
}
