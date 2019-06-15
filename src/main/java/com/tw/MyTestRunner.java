package com.tw;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyTestRunner implements CommandLineRunner ,Ordered{
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println("this is first runner");

	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
