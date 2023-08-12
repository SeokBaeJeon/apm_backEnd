package com.example.apm;

import io.netty.handler.codec.http.HttpMethod;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // 실제 프론트엔드 주소
                .allowedMethods("*") // 필요한 메소드만 허용
                .allowedHeaders("*") // 모든 헤더 허용
                .exposedHeaders(HttpHeaders.LOCATION); // 노출할 헤더 설정
    }
}
