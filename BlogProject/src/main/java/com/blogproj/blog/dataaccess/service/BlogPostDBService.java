package com.blogproj.blog.dataaccess.service;

import java.util.ArrayList;
import java.util.List;

import com.blogproj.bean.BlogPostBean;
import com.blogproj.bean.BloggerBean;
import com.blogproj.blog.dataaccess.service.interfac.IBlogPostDBService;
import com.blogproj.db.util.DBUtil;
import com.blogproj.dto.GetSummaryPostsDTO;
import com.blogproj.response.GetSummaryPostsResponse;

public class BlogPostDBService implements IBlogPostDBService {
	
	public BlogPostBean addPost(BlogPostBean blogPost)
	{
		return DBUtil.addPost(blogPost);
		
	}
	
	public GetSummaryPostsResponse getSummarisedPostsForBloggerId(long bloggerId)
	{
		List<BlogPostBean> blogPostListForBloggerId = DBUtil.getPostsForBloggerId(bloggerId);
		
		List<GetSummaryPostsDTO> summarisedblogPostsList = populateBlogSummarisedBlogList(blogPostListForBloggerId);
		
		GetSummaryPostsResponse getSummaryPostsResponse = new GetSummaryPostsResponse(summarisedblogPostsList);
		
		return getSummaryPostsResponse;
	}
	
	private List<GetSummaryPostsDTO> populateBlogSummarisedBlogList(List<BlogPostBean> blogPostListForBloggerId)
	{
		List<GetSummaryPostsDTO> summarisedList = new ArrayList<GetSummaryPostsDTO>();
		
		for(BlogPostBean postBean : blogPostListForBloggerId)
		{
			BloggerBean blogger = DBUtil.getBloggerDetailByBloggerId(postBean.getBloggerId());
			
			GetSummaryPostsDTO getSummaryPostsDTO = new GetSummaryPostsDTO(blogger.getBloggerId(), postBean.getBlogPostId(), 
						blogger.getBloggerName(), postBean.getBlogTitle(), 
						postBean.getPostText().length() > 20 ? postBean.getPostText().substring(0, 20) : postBean.getPostText());
			
			summarisedList.add(getSummaryPostsDTO);
			
		}
		
		return summarisedList;
	}

}
