package com.lanhuigu.canghai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CanghaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanghaiApplication.class, args);
        //ConfigurableApplicationContext run = SpringApplication.run(CanghaiApplication.class, args);

        //String[] names = run.getBeanDefinitionNames();
        //
        //for (String name : names) {
        //    System.out.println(name);
        //}

        //Pet tom01 = run.getBean("tom", Pet.class);
        //Pet tom02 = run.getBean("tom", Pet.class);
        //
        //System.out.println(tom01.equals(tom02));
        //System.out.println(tom01 == tom02);
        //
        //MyConfig myConfig = run.getBean(MyConfig.class);
        //System.out.println(myConfig);
        //
        //Person p1 = myConfig.person01();
        //Person p2 = myConfig.person01();
        //System.out.println(">>>>> p1 and p2");
        //System.out.println(p1 == p2);
        //
        //Person person01 = run.getBean("person01", Person.class);
        //Pet pet01 = run.getBean("tom", Pet.class);
        //System.out.println("验证Person的Pet是否为从容器中取出的Pet");
        //System.out.println(person01.getPersonPet() == pet01);
        //
        //System.out.println("======");
        //String[] persons = run.getBeanNamesForType(Person.class);
        //for (String p : persons) {
        //    System.out.println(p);
        //}

        //System.out.println(run.containsBean("person01"));
    }

}
