package com.ljj.springboot.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {

    /*
    * @Value: 1.字面量
    *         2.${},取配置文件中的值
    *         3.#{},spEL表达式:spring表达式
    * @Validated: 对变量值进行校验(JSR303校验)，只适用于@ConfigurationProperties注解
    * */
    @Email
    private String name;
    private int age;
    private Map<String, Object> map;
    private Animal animal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", map=" + map +
                ", animal=" + animal +
                '}';
    }
}
