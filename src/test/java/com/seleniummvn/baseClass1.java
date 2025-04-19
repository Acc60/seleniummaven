package com.seleniummvn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass1  {
	
	 public WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		
	
	//WebDriverManager.chromedriver().clearResolutionCache().setup();
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHUL\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");

        // Configure Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);

	   driver.get("https://the-internet.herokuapp.com/");
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	  
	  Thread.sleep(5000);
	}

	
	 @AfterClass
	  public void teardown() {
		 // driver.quit();
		  System.out.println("Inside teardown method");
		  
	  }
}
