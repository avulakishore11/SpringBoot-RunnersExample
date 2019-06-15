package com.tw;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hell this is MyRunner");
		System.out.println(args[1]);
		System.out.println(Arrays.asList(args));
		
	}

}
