package com.blogproj.request;

public class GetSummaryPostsRequest {

	private long bloggerId;

	public GetSummaryPostsRequest(long bloggerId) {
		super();
		this.bloggerId = bloggerId;
	}

	public GetSummaryPostsRequest() {}

	public long getBloggerId() {
		return bloggerId;
	}

	public void setBloggerId(long bloggerId) {
		this.bloggerId = bloggerId;
	}
	
	
}
