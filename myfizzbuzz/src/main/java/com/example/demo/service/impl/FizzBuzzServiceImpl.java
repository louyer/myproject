package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.service.FizzBuzzServce;
import com.example.demo.service.IntToStringService;

@Service
public class FizzBuzzServiceImpl implements FizzBuzzServce{

	@Override
	public String dealNum(int n, List<IntToStringService> list) {
		StringBuffer sb = new StringBuffer();
		
		if(list!=null&&list.size()>0){
			for(IntToStringService service:list){
				if(service.judge(n)){
					sb.append(service.replaceStr(n));
				}
			}
		}
		if(sb.length()==0){
			sb.append(n);
		}
		return sb.toString();
	}



}
