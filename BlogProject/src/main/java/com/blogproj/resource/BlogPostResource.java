package com.blogproj.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.blogproj.bean.BlogPostBean;
import com.blogproj.request.GetSummaryPostsRequest;
import com.blogproj.response.GetSummaryPostsResponse;
import com.blogproj.service.BlogPostService;

@Path("/blog")
public class BlogPostResource {
	
	@Path("/post")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addPost(BlogPostBean blogPost)
	{
		BlogPostService blogPostService = new BlogPostService();
		BlogPostBean updatedBlogPost = null;
		try{
			
			updatedBlogPost = blogPostService.addPost(blogPost);
			
			return Response.ok(updatedBlogPost).build();
		}
		catch(Exception e){
			return Response.serverError()
					.entity(updatedBlogPost)
					.build();
		}
		
	}
	
	@GET
	@Path("/post")
	@Produces(MediaType.TEXT_PLAIN)
	public String test()
	{
		return "Working fine";
	}
	
	@Path("/posts/{bloggerId}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Response  getSummaryPosts(@PathParam("bloggerId") long bloggerId)
	{
		
		BlogPostService blogPostService = new BlogPostService();
		
		GetSummaryPostsRequest getSummaryPostsRequest = new GetSummaryPostsRequest();
		getSummaryPostsRequest.setBloggerId(bloggerId);
		
		GetSummaryPostsResponse getSummaryPostsResponse = blogPostService.getSummarisedPostsForBloggerId(getSummaryPostsRequest);
		
		
		return Response.ok(getSummaryPostsResponse).build();
	}
	
	@Path("/{postId}/comment")
	@POST
	public BlogCommentResource addComment()
	{
		return new BlogCommentResource();
	}

}
