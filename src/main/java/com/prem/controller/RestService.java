package com.prem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class RestService {

	@RequestMapping(value = "/api/v1/getInfo", method = RequestMethod.GET)
	public ResponseEntity<String> getInfo(){
		
		List<String> userList = new ArrayList<String>();
		userList.add("Hello");
		userList.add("World");
		//userList = new UserLoopUpImpl().getUserInfo();
		
		return new ResponseEntity<String>(new Gson().toJson(userList),HttpStatus.OK);
		
	}
}
