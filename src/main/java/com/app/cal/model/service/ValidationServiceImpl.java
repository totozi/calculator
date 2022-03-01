package com.app.cal.model.service;

import java.util.EmptyStackException;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService{
	private static final Logger logger = LoggerFactory.getLogger(ValidationServiceImpl.class);
	
	@Override
	public boolean validation(String expression) {
		logger.info("validation has got started.");
		
		if(expression == null || expression == "") {
			logger.error("nullAndBlank validation has faced an error.");
			return false;
		} else if(!bracketValidation(expression)){
			logger.error("bracket Validation has faced an error.");
			return false;
		} else {
			logger.info("validation has got finished.");
			return true;
		}
	}
	
	public boolean bracketValidation(String expression) {
		Stack<Character> bracketStack = new Stack<Character>();
		try {
			for(int i=0; i < expression.length(); i++) {
				if(expression.charAt(i) == '(') {
					bracketStack.push((Character)expression.charAt(i));
				} else if(expression.charAt(i) == ')'){
					bracketStack.pop();
				}
			}
		} catch (EmptyStackException e) {
			System.out.println("the number of '(' is not enough");
			return false;
		}
		
		if(bracketStack.isEmpty()) {
			return true;
		} else {
			System.out.println("the number of ')' is not enough");
			return false;
		}
	}
}
