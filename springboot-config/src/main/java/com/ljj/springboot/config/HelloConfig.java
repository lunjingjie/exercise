package com.ljj.springboot.config;

import com.ljj.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 试用注解的方式写配置文件
 * @Bean 在spring容器中注册bean组件，默认方法名为id值，返回值为注册对象
 */
@Configuration
public class HelloConfig {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
