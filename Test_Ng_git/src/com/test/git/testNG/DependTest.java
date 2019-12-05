package com.test.git.testNG;

import org.testng.annotations.Test;

public class DependTest {
	
	//这是个依赖测试
	/*比如运行test2 之前，先运行test1
	 * test1是 test2 的前置条件
	 * 若test1 运行失败了，则test2 会被忽略掉*/
	@Test
	public void test1(){
		System.out.println("运行测试1");
		throw new RuntimeException(); //抛出一个异常，方法test1运行失败
	}
	
	
	@Test(dependsOnMethods = {"test1"})
	public void test2(){
		System.out.println("运行测试2");
	}

}
