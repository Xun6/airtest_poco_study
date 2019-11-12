package com.test.git.testNG.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SuiteConfig {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("~~~~~~在所有测试运行前运行 BeforeSuite~~~~~~");
		System.out.println("\n");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("\n");
		System.out.println("!!!!!!!!!!在所有测试运行后运行 AfterSuite!!!!!!!!!!");
	}
	
	@BeforeTest
	public void BeforeTest(){
		
		System.out.println("---------在测试运行之前运行 BeforeTest----------");
	}
	
	@AfterTest
	public void AfterTest(){
		
		System.out.println("+++++++++++在测试运行之后运行 AfterTest++++++++++++++++");
		System.out.println("\n");
	}

}
