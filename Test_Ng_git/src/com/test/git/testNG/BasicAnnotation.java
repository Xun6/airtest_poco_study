package com.test.git.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class BasicAnnotation {
	public static void main(String [] arg){
		
	}
	@Test
	public void testCase1(){
		System.out.println("这是测试用例一");
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("这是测试用例2");
	}
	
}
