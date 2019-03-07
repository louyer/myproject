package com.example.demo.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.BaseTests;
import com.example.demo.service.IntToStringService;
import com.example.demo.util.FizzBuzzUtil;

public class IntToFizzServiceTest extends BaseTests {
	
	@Autowired
	@Qualifier("intToFizzServiceImpl")
	IntToStringService service;
	
	@Test
	public void judgeTrue1(){
		int n = 12;
		Assert.assertTrue(service.judge(n));
	}
	
	@Test
	public void judgeTrue2(){
		int n = 13;
		Assert.assertTrue(service.judge(n));
	}

	@Test
	public void judgeFalse(){
		int n = 61;
		Assert.assertFalse(service.judge(n));
	}
	
	@Test
	public void replaceStrTest(){
		int n = 36;
		String result = service.replaceStr(n);
		Assert.assertArrayEquals(new String[] {FizzBuzzUtil.FIZZ}, new String[] {result});
	}
}
