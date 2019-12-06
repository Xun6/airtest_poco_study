package com.test.git.testNG.multiThread;

import org.testng.annotations.Test;

public class multiThreadOnXmlTest {
	/*多线程测试实例*/
	@Test
	public void test1(){
		System.out.printf("Thread Id_1 : %s%n",Thread.currentThread().getId());
	}
	
	@Test
	public void test2(){
		System.out.printf("Thread Id_2 : %s%n",Thread.currentThread().getId());
	}
	
	@Test
	public void test3(){
		System.out.printf("Thread Id_3 : %s%n",Thread.currentThread().getId());
	}

}
