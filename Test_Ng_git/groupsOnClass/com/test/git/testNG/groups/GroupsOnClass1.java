package com.test.git.testNG.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
	public void study1(){
		System.out.println("在GroupsOnClass 1中运行的方法1111111");
	}
	
	public void study2(){
		System.out.println("在GroupsOnClass 1中运行的方法222222222");
	}

}
