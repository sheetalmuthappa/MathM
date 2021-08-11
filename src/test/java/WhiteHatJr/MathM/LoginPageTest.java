package WhiteHatJr.MathM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.TeacherPanel;

public class LoginPageTest extends App {
	WebDriver driver;
	@Test
	public void lognToParent() throws IOException {
		// TODO Auto-generated constructor stub
		
		driver = initializeDriver();
		
		
		System.out.print(driver);
		driver.get(prop.getProperty("URL"));
		//inheritance  & create objects 
		LoginPage l= new LoginPage(driver);
		l.getLoginButton("teachers").click();
		TeacherPanel T= new TeacherPanel(driver);
		T.teacherPanelLogin().click();
	//	driver.manage().logs().get(logType);
		
		
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
