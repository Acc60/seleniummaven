package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class bClass {
	
	 WebDriver driver;
	 
	 
	
	bClass(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
