package com.blogproj.response;

import java.util.List;

import com.blogproj.dto.GetSummaryPostsDTO;

public class GetSummaryPostsResponse {

	private List<GetSummaryPostsDTO> summaryPostsList;

	
	public GetSummaryPostsResponse() {}

	
	public GetSummaryPostsResponse(List<GetSummaryPostsDTO> summaryPostsList) {
		super();
		this.summaryPostsList = summaryPostsList;
	}


	public List<GetSummaryPostsDTO> getSummaryPostsList() {
		return summaryPostsList;
	}

	public void setSummaryPostsList(List<GetSummaryPostsDTO> summaryPostsList) {
		this.summaryPostsList = summaryPostsList;
	}
	
	
}
