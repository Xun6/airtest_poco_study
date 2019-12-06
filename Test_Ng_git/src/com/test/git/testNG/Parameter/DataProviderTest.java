package com.test.git.testNG.Parameter;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	/*参数化测试 2
	 * */
	@Test(dataProvider = "data")
	public void testData(String name,int age){
		System.out.println("name = "+ name + ";age = "+ age);
		
	}
	
	@DataProvider(name ="data")
	public Object[][] Providerdata(){
		Object[][] o = new Object[][]{
				{"zhangsan",10},
				{"lisi",20}
		};
		return o;
	}
	
	
	
	//=====================
	@Test(dataProvider = "methodData")
	public void test1(String name,int age){
		System.out.println("test1方法的name = "+ name + ";age = "+ age);
	}
	@Test(dataProvider = "methodData")
	public void test2(String name,int age){
		System.out.println("test1方法的name = "+ name + ";age = "+ age);
	}
	
	@DataProvider(name ="methodData")
	public Object[][] methodDataTest(Method method){
		Object[][] B = null;
		if(method.getName().equals("test1")){
			B = new Object[][]{
					{"wang",30},
					{"qian",40}
			};
		}else if(method.getName().equals("test2")){
			B = new Object[][]{
					{"sun",50},
					{"li",60}
			};
		}
		return B;
	}

}
