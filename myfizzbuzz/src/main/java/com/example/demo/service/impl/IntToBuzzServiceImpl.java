package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.IntToStringService;
import com.example.demo.util.FizzBuzzUtil;

@Service
public class IntToBuzzServiceImpl implements IntToStringService {

	@Override
	public String replaceStr(int n) {
		return FizzBuzzUtil.BUZZ;
	}

	@Override
	public boolean judge(int n) {
		
	//判断 模5 或包含 5
		return n%5==0 || String.valueOf(n).contains("5");
	}

}
