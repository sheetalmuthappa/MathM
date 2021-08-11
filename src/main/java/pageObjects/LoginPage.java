package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Streams.LongFunctionWithIndex;

public class LoginPage {

	WebDriver driver;

	By button = By.cssSelector("button.btn");

	By loginDiv = By.xpath("//div[@class='login-role-container']");

	public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver = driver2;
	}

	public WebElement getLoginButton(String loginType)

	{
		WebElement loginButton = null;
		// login-role-container
//		 return driver.findElements(button).get(index);
		String LoginType = loginType.toLowerCase();
		List<WebElement> loginForms = driver.findElements(loginDiv);
		for (WebElement s : loginForms) {
			if (s.findElement(By.tagName("IMG")).getAttribute("alt").toLowerCase().contains(LoginType)) {
				loginButton = s.findElement(button);

			}

		}
		return loginButton;
	}

}
