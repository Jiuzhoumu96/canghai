package com.lanhuigu.canghai.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author: HeChengyao
 * @date: 2021/7/28 16:27
 */

//@Configuration(proxyBeanMethods = true)

//@Import(Person.class)
//@ConditionalOnMissingBean(name = "cbdsj")
/**
 * 开启Car配置绑定功能
 * 把这个car这个组件自动注册到容器中
 */
//@EnableConfigurationProperties(Car.class)
@Configuration
public class MyConfig {

    //@ConditionalOnBean(name = "tom")
    //@Bean
    //public Person person01() {
    //    Person person = new Person(1, "lwb", 18);
    //    person.setPersonPet(tomcat());
    //    return person;
    //}
    //
    //@Bean("tom")
    //public Pet tomcat() {
    //    return new Pet(1, "tom",12.5);
    //}


}
