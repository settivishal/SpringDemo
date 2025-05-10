package com.vishal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Dev obj = context.getBean(Dev.class);
        Dev obj = (Dev) context.getBean("dev");
        obj.build();

//        obj.setAge(18);
//        System.out.println("age: " + obj.getAge());

        Laptop lap = (Laptop) context.getBean("lap1");
        lap.compile();
    }
}
