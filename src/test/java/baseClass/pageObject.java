package baseClass;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.utility.RandomString;

public class pageObject extends bClass {

	public pageObject(WebDriver driver){
		super(driver);
	}
	
	//@FindBy(xpath ="//*[@id=\'content\']/h1")
	// WebElement headings;
	
	String head;
	//String h2=RandomStringUtils.randomNumeric(5);
	
	public String heading() throws InterruptedException {
		System.out.println(" inside page object model page");
		Thread.sleep(5000);
		//head=driver.findElement(By.xpath("//*[@id=\'content\']/h1")).getText();
	 	//head=headings.getText();
	 	System.out.println("before line printing the fetched value of head");
	 	System.out.println(head);
	 	return head;
	 	
	 	
	}
}
