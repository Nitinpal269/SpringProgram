package com.spring.practice.el;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/practice/el/elconfig.xml");
		Laptop l=(Laptop)context.getBean("ob");
		System.out.println(l);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression=temp.parseExpression("22+44");
		System.out.println(expression.getValue());

	}

}
