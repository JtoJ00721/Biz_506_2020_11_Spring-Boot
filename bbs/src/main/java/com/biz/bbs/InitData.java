package com.biz.bbs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InitData {
	
	@Bean
	public CommandLineRunner initDataMethod() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				System.out.println("\n이기는 초기화 메서드지롱 ><\n");
			}
		};
	}
	
}
