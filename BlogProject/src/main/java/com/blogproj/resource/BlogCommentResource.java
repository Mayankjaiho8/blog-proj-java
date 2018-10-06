package com.blogproj.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.blogproj.bean.BlogCommentBean;
import com.blogproj.service.BlogCommentService;

@Path("/comment")
public class BlogCommentResource {

	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	public Response addPost(@PathParam("postId") long postId, BlogCommentBean comment)
	{
		comment.setBlogPostId(postId);
		BlogCommentService commentService = new BlogCommentService();
		BlogCommentBean postedComment = commentService.addComment(comment);
		return Response.ok(postedComment).build();
		
	}
	
}
