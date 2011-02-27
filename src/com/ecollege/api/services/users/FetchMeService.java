package com.ecollege.api.services.users;

import org.apache.http.HttpResponse;

import com.ecollege.api.model.User;
import com.ecollege.api.services.BaseService;

public class FetchMeService extends BaseService {

	private User result;
	
	public User getResult() {
		return result;
	}

	@Override
	public String getResource() {
		return "/me";
	}

	@Override
	public void processResponse(HttpResponse response, String responseContent) {
		super.processResponse(response,responseContent);
		result = parseContentAsJson(responseContent,"me", User.class);
		System.out.println("Result is " + result);
	}
	
}
