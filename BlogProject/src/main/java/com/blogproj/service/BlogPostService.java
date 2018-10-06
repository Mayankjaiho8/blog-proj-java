package com.blogproj.service;

import com.blogproj.bean.BlogPostBean;
import com.blogproj.blog.dataaccess.service.BlogPostDBService;
import com.blogproj.request.GetSummaryPostsRequest;
import com.blogproj.response.GetSummaryPostsResponse;

public class BlogPostService {

	public BlogPostBean addPost(BlogPostBean blogPost)
	{
		BlogPostDBService dataAccessService = new BlogPostDBService();
		
		BlogPostBean addedBlogPost = dataAccessService.addPost(blogPost);
		
		return addedBlogPost;
	}
	
	public GetSummaryPostsResponse getSummarisedPostsForBloggerId(GetSummaryPostsRequest getSummaryPostsRequest)
	{
		BlogPostDBService dataAccessService = new BlogPostDBService();
		
		GetSummaryPostsResponse getSummaryPostsResponse = dataAccessService.getSummarisedPostsForBloggerId(getSummaryPostsRequest.getBloggerId());
		
		return getSummaryPostsResponse;
	}
}
