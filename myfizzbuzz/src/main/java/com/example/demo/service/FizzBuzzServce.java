package com.example.demo.service;

import java.util.List;

public interface FizzBuzzServce {

	/**
	 * 根据传入Service实例处理 当前数字
	 * @param n
	 * @param list
	 */
	public String dealNum(int n,List<IntToStringService> list);
}
