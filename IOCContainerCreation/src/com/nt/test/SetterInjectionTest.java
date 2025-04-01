package com.nt.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	 public static void main(String[] args) {
		 FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationcontext.xml");
		 WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		 String result = generator.generateMessage("Bhargav");
		 System.out.println(result);
		 ctx.close();
	 }
}
