package com.test.git.testNG.Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PeramterTest {
	/*参数化测试，需添加配置项*/
	@Test
	@Parameters({"name","age"})
	public void param(String name,int age){
		System.out.println("name ="+ name +";  age ="+ age);
	}

}
