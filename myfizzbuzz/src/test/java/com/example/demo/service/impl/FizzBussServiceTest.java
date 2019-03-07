package com.example.demo.service.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.BaseTests;
import com.example.demo.service.FizzBuzzServce;
import com.example.demo.service.IntToStringService;


public class FizzBussServiceTest extends BaseTests {

	@Autowired
	private FizzBuzzServce fizzBuzzService;
	@Autowired
	private List<IntToStringService> intToStringServiceList;
	
	@Test
	public void testDealNum(){
		int n = 15;
		String result = fizzBuzzService.dealNum(n, intToStringServiceList);
		Assert.assertArrayEquals(new String[] {String.valueOf(n)}, new String[] {result});
	}
	
}
