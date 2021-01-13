package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       Student student=(Student)context.getBean("student");
       Student student2=(Student)context.getBean("student2");
       System.out.println(student);
       System.out.println(student2);
        
    }
}
