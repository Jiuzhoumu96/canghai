package com.lanhuigu.canghai.config;

import com.lanhuigu.canghai.po.Car;
import com.lanhuigu.canghai.po.Person;
import com.lanhuigu.canghai.po.Pet;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: HeChengyao
 * @date: 2021/7/28 16:27
 */
@Configuration(proxyBeanMethods = true)

@Import(Person.class)
//@ConditionalOnMissingBean(name = "cbdsj")
/**
 * 开启Car配置绑定功能
 * 把这个car这个组件自动注册到容器中
 */
@EnableConfigurationProperties(Car.class)
public class MyConfig {

    //@ConditionalOnBean(name = "tom")
    @Bean
    public Person person01() {
        Person person = new Person(1, "lwb", 18);
        person.setPersonPet(tomcat());
        return person;
    }

    @Bean("tom")
    public Pet tomcat() {
        return new Pet(1, "tom",12.5);
    }

}
