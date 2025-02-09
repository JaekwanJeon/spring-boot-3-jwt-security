package com.alibou.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//스프링 서버 전역적으로 CORS 설정
//@Configuration
//@EnableWebMvc
public class CORSConfig implements WebMvcConfigurer {
	 @Override
	 public void addCorsMappings(CorsRegistry registry) {
		 // 사용안함 Spring boot Security의 CorsConfigurationSource를 사용한다.
		 // registry.addMapping("/**").allowedMethods("*").allowedHeaders("*").allowedOrigins("*");
//		.allowedOriginPatterns("*")
//	     registry.addMapping("/**")
//	     .allowedOrigins("http://localhost", "http://localhost:8080") // 허용할 출처
//		 .allowedMethods("*") // 허용할 HTTP method
//		 .allowCredentials(true) // 쿠키 인증 요청 허용
//		 .maxAge(3000); // 원하는 시간만큼 pre-flight 리퀘스트를 캐싱
	 }
}
