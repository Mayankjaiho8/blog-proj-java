package com.blogproj.blog.dataaccess.service;

import com.blogproj.bean.BlogCommentBean;
import com.blogproj.db.util.DBUtil;

public class BlogCommentDBService {

	public BlogCommentBean addPost(BlogCommentBean comment)
	{
		return DBUtil.addComment(comment);
		
	}
}
