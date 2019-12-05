package com.test.git.testNG;

import org.testng.annotations.Test;

public class ExpectedException {
	/**
	 * 这是一条异常测试
	 * 在我们的期望结果是某一个异常的时候
	 * 比如：我们测试传入一些不合法的参数，程序抛出一个异常
	 * 也就是我们的预期结果就是这个异常*/
	
	
	//这个一条测试结果会失败的一场测试
//	@Test(expectedExceptions = RuntimeException.class)
//	public void runtimeExceptionFaild(){
//		System.out.println("这是一个失败的异常测试！！！");
//	}
//	
	
	//这是一个成功的异常测试
	
	@Test(expectedExceptions = RuntimeException.class)
	public void runtimeExceptionSuccess(){
		System.out.println("这是一个成功的异常测试！！！");
		throw new RuntimeException();
		
	}

}
