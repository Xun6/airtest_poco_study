package com.test.git.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

/*annotations ：注释、注解*/

public class TestName {
	
	@Test
	public void testCase1(){
		System.out.println("这是测试用例一");
		System.out.printf("Thread Id_4 : %s%n",Thread.currentThread().getId());
	}
	
	
	@Test
	public void testCase2(){
		System.out.println("这是测试用例二");
	}
	@Test(enabled = false)    //表示忽略测试,false表示忽略，true表示不忽略
	public void testCase3(){
		System.out.println("这条测试被忽略了！！！！");
		
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("------------------------");  /*在每一个测试方法之前运行*/
	}
	
	@AfterMethod
	public void AfterMethod(){
		System.out.println("++++++++++++++++++++++++++"); /*在每一个测试方法之后运行*/
	}
	
	@BeforeClass
	public void BeforeClass(){
		System.out.println("在当前类的第一个测试方法调用前运行");
	}
	
	@AfterClass
	public void AfterClass(){
		System.out.println("在当前类所有测试方法调用后运行");
	}
	
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("在所有测试运行之前运行");
	}
	
	@AfterSuite
	public void AfterSuite(){
		System.out.println("在所有测试运行之后运行");
	}
				
}
