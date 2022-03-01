package com.app.cal.model.service;

import java.util.StringTokenizer;

import org.springframework.stereotype.Service;

import com.app.cal.model.vo.OperatorVo;


@Service
public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public void calculation(String expression) {
		StringTokenizer st = new StringTokenizer(expression, OperatorVo.OPERATOR_PLUS.toString());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	}

}
