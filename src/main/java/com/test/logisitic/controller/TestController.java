/**
 * 
 */
package com.test.logisitic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.logisitic.service.TestService;

import lombok.RequiredArgsConstructor;

/**
 * @author Navdeep Mutreja
 *
 */



@RestController
@RequiredArgsConstructor
public class TestController {

	private final TestService testService;
	
	@GetMapping(value = "/test")
	public ResponseEntity<HttpStatus> updateCount() {
		testService.updateCount();
		return new ResponseEntity<>(HttpStatus.OK);
	}

	
	
	
	
}
