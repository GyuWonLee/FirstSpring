package com.gyuone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gyuone.controller.HelloController;

@Configuration // Spring용 설정 클래스
public class ControllerConfig {
	@Bean
	public HelloController helloController() {
		return new HelloController();
	}
}
