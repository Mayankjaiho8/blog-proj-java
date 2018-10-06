package com.blogproj.blog.dataaccess.service.interfac;

import com.blogproj.bean.BlogPostBean;
import com.blogproj.response.GetSummaryPostsResponse;

public interface IBlogPostDBService {

	public BlogPostBean addPost(BlogPostBean post);
	
	public GetSummaryPostsResponse getSummarisedPostsForBloggerId(long bloggerId);
}
