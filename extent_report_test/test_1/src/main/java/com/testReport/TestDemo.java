package com.testReport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class TestDemo {
	
	@Test
	public void test11(){
		Assert.assertEquals(1, 2);
		
	}
	
	@Test
	public void test22(){
		Assert.assertEquals(2, 2);
		
	}
	
	@Test
	public void test33(){
		Assert.assertEquals("AAA", "AAA");
		
	}
	
	@Test
	public void logDemo(){
		Reporter.log("这是我自己写的日志");
		throw new RuntimeException("这是我自己的运行时异常");
		
	}

}
