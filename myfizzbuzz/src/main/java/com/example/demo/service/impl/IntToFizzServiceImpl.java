package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.IntToStringService;
import com.example.demo.util.FizzBuzzUtil;

@Service
public class IntToFizzServiceImpl implements IntToStringService {

	@Override
	public String replaceStr(int n) {
		return FizzBuzzUtil.FIZZ;
	}

	@Override
	public boolean judge(int n) {
		
	//判断模3 或 包含3
		return n%3 == 0 || String.valueOf(n).contains("3");
	}



}
