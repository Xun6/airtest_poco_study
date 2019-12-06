package com.test.git.testNG;

import org.testng.annotations.Test;

public class TimeOutTest{
	
	@Test(timeOut = 3000)  //单位为毫秒
	public void testSuccess() throws InterruptedException{   /*测试通过*/
		Thread.sleep(2000);
	}
	
	
	@Test(timeOut = 2000)  //单位为毫秒
	public void testFailed() throws InterruptedException{   /*测试失败,此方法超时未完成抛出异常*/   
		Thread.sleep(3000);
	}

}
