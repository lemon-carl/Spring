package com.hr.spring.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
		
				 @Test
				 public void testSpring() {
				   //创建HelloWorld的一个对象
				  // HelloWorld heWorld = new HelloWorld();
				   //为name的属性赋值
				   //heWorld.setName("Carl");
				   //调用hello的方法
				   //heWorld.hello();
				   
				   //1.创建Spring 的 IOC 容器对象
				   @SuppressWarnings("resource")
				ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				   
				   //2.从IOC 容器中获取Bean实例
			      HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
				   
				   //3.调用hello的方法
			    //  helloWorld.hello();
				 }
}
