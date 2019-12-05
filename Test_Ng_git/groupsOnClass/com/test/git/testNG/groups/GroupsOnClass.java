package com.test.git.testNG.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass {
	
	public void teacher1(){
		System.out.println("在GroupsOnClass中运行的方法`````````");
	}
	
	
	public void teacher2(){
		System.out.println("在GroupsOnClass中运行的方法.............");
	}

}
