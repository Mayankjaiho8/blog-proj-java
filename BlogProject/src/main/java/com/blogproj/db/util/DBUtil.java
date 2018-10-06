package com.blogproj.db.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.blogproj.bean.BlogCommentBean;
import com.blogproj.bean.BlogPostBean;
import com.blogproj.bean.BloggerBean;

public class DBUtil {

	private static Map<Long, BlogPostBean> blogPostMap;
	private static Map<Long, List<BlogCommentBean>> postToCommentMap;
	private static Map<Long, BloggerBean> bloggerIdToBloggerMap;
	
	static{
		blogPostMap = new HashMap<>();
		postToCommentMap = new HashMap<>();
		bloggerIdToBloggerMap = new HashMap<>();
		initializeBloggerMap();
	}
	
	public static BlogPostBean addPost(BlogPostBean blogPost)
	{
		long blogId = blogPostMap.size() + 1;
		
		blogPost.setBlogPostId(blogId);
		
		blogPostMap.put(blogId, blogPost);
		
		return blogPostMap.get(blogId);
	}
	
	public static BlogCommentBean addComment(BlogCommentBean comment)
	{
		Long postId = comment.getBlogPostId();
		Long commentId = (long)postToCommentMap.size() + 1;
		
		comment.setBlogCommentId(commentId);
		if(!postToCommentMap.containsKey(postId))
		{
			List<BlogCommentBean> commentList = new ArrayList<>();
			commentList.add(comment);
			
			postToCommentMap.put(postId, commentList);
		}
		else
		{
			postToCommentMap.get(postId).add(comment);
		}
		
		return comment;
		
	}
		
	public static List<BlogPostBean> getPostsForBloggerId(long bloggerId)
	{
		List<BlogPostBean> blogPostBeanList = new ArrayList<>();
		
		for(BlogPostBean postBean : blogPostMap.values())
		{
			if(postBean.getBloggerId() == bloggerId)
			{
				blogPostBeanList.add(postBean);
			}
		}
		
		return blogPostBeanList;
	}
	
	public static BloggerBean getBloggerDetailByBloggerId(long bloggerId)
	{
		return bloggerIdToBloggerMap.get(bloggerId);
	}
	
	private static void initializeBloggerMap()
	{
		bloggerIdToBloggerMap.put(1L, new BloggerBean(1L, "Mayank Kumawat"));
		bloggerIdToBloggerMap.put(2L, new BloggerBean(2L, "Nikhil Kumawat"));
		bloggerIdToBloggerMap.put(3L, new BloggerBean(3L, "Lokesh Kumawat"));
		bloggerIdToBloggerMap.put(4L, new BloggerBean(4L, "Jeetu Kumawat"));
		
	}
}
