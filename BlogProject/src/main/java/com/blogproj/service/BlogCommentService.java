package com.blogproj.service;

import com.blogproj.bean.BlogCommentBean;
import com.blogproj.blog.dataaccess.service.BlogCommentDBService;

public class BlogCommentService {

	public BlogCommentBean addComment(BlogCommentBean comment)
	{
		BlogCommentDBService commentDBService = new BlogCommentDBService();
		
		return commentDBService.addPost(comment);
	}
}
