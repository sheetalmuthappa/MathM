package WhiteHatJr.MathM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.TeacherPanel;


public class LoginPageTeacherTest extends App {
	
	WebDriver driver;
	public static Logger log= LogManager.getLogger(App.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		
		
		log.info("Driver is initiated-Sheetal");		
		System.out.print(driver);
		driver.get(prop.getProperty("URL"));
		log.info("URL invoked-Sheetal");
		log.info("URL invoked-Sheetal_new");
	}

	@Test
	public void lognToParent() throws IOException {
		// TODO Auto-generated constructor stub		
		
		//inheritance  & create objects 
		LoginPage l= new LoginPage(driver);
		l.getLoginButton("teachers").click();
		TeacherPanel T= new TeacherPanel(driver);
		T.teacherPanelLogin().click();
	//	driver.manage().logs().get(logType);
		log.info("hi");
	}
		
		@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}
		
	

}
