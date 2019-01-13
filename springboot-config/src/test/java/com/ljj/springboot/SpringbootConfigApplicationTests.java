package com.ljj.springboot;

import com.ljj.springboot.model.Person;
import com.ljj.springboot.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConfigApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    ApplicationContext ioc;

    /*
    * 测试配置文件(@Configuration)
    * @PropertySource: 导入自定义配置文件
    * @ImportResource: 导入自定义spring的xml文件(推荐适用@Configuration注解写配置类代替)
    * */
    @Test
    public void testBean() {
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    public void testConfig() {
        System.out.println(person);
    }
}

