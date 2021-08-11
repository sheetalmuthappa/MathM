package WhiteHatJr.MathM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

/**
 * Hello world!
 *
 */
public class App {

	public WebDriver driver;
	
	Properties prop;
	//String URL;
	//String browser;
	

	public WebDriver initializeDriver() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\TYSS\\eclipse-workspace\\MathM\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();

		prop.load(fis);
		String browser =(String) prop.getProperty("browser");
		//URL = prop.getProperty("URL");
		
		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\FireFoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		// System.out.println("value a "+ driver);
		// return driver;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	/*	
		public void getScreensShot()
		{
			TakesScreenshot ts=	(TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new Files());
					}*/
		
	}
//
//	/*
//	 * public static void main(String[] args) { // Initialize driver
//	 * 
//	 * System.setProperty("webdriver.chrome.driver",
//	 * "D:\\chromedriver\\chromedriver.exe");
//	 * System.setProperty("webdriver.gecko.driver",
//	 * "D:\\FireFoxDriver\\geckodriver.exe"); App call =new App();
//	 * call.initializeDriver("chrome"); System.out.println("value is "+
//	 * call.driver); }
//	 */

}
