package com.test.git.testNG.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
	public void stu1(){
		System.out.println("在GroupsOnClass2中运行的方法1111111");
	}
	
	
	public void stu2(){
		System.out.println("在GroupsOnClass2中运行的方法222222222");
	}

}
