package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.FizzBuzzServce;
import com.example.demo.service.IntToStringService;


@SpringBootApplication
public class MyfizzbuzzApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyfizzbuzzApplication.class, args);
		
		FizzBuzzServce fizzBuzzService = context.getBean("fizzBuzzServiceImpl",FizzBuzzServce.class);
		IntToStringService fizzService = context.getBean("intToFizzServiceImpl",IntToStringService.class);
		IntToStringService buzzService = context.getBean("intToBuzzServiceImpl",IntToStringService.class);
		

		List<IntToStringService> list = new ArrayList<IntToStringService>();
		list.add(fizzService);
		list.add(buzzService);
		
		//打印结果
		for(int i=0;i<=100;i++){
			String str = fizzBuzzService.dealNum(i, list);
			System.out.println(str);
		}
	}
	


}
