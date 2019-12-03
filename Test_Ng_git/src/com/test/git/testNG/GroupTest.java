package com.test.git.testNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


public class GroupTest {
	@Test(groups = "Client")    //给一个组标签
	public void Client1(){
		System.out.println("客户端组111111111");
	}
	
	
	@Test(groups = "Server")
	public void Server2(){
		System.out.println("服务端组22222222222");
	}
	
	
	
	@BeforeGroups("Client")              //赋予标签，使方法运行在组之前
	public void BeforeGroupsOnClient(){
		System.out.println("在客户端组之前运行bbbbbbbb");
	}
	@AfterGroups("Client")
	public void AfterGroupsOnClient(){
		System.out.println("在客户端组之后运行aaaaaaaaaaa");
		System.out.println("\n");
			
	}
	
	
	
	
	
	@BeforeGroups("Server")
	public void BeforeGroupsOnServer(){
		System.out.println("在服务端组之前运行bbbbbbbb");
	}
	@AfterGroups("Server")
	public void AfterGroupsOnServer(){
		System.out.println("在服务端组之后运行aaaaaaaaaaa");
	
	}
}
