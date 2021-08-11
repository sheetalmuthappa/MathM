package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeacherPanel {

	WebDriver driver;
	
	By teacherLoginButton = By.xpath("//span[contains(text(),'Login With Password')]");
	
	public TeacherPanel(WebDriver driver2) {
		
		this.driver = driver2;
		// TODO Auto-generated constructor stub
	}

	public WebElement teacherPanelLogin() {
		
		return driver.findElement(teacherLoginButton);
				
	}
	
}
