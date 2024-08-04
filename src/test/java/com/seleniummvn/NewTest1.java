package com.seleniummvn;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import baseClass.pageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 extends baseClass1 {
	
	baseClass1 b1=new baseClass1();
	pageObject pg=new pageObject(driver);
	
	 String h3;
	 
	 @Test
	 public void test1() throws InterruptedException {
		// pageObject pg=new pageObject(driver);
		 
		 System.out.println("printing before running chrome");
	
		h3= pg.heading();
		System.out.println(h3);
		
		
		
		}
	 
  
}
