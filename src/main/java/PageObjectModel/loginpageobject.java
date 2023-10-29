package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpageobject {
	public WebDriver driver;
	 By username=By.xpath("//input[@id='username']");
	 By password=By.xpath("//input[@id='password']");
	 By login=By.xpath("//input[@id='Login']");

	 public loginpageobject(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement EnteruserName() {
		 return driver.findElement(username);
	 }
	 public WebElement EnterpassWord() {
		 return driver.findElement(password);
	 }
	 public WebElement ClickonLogin() {
		 return driver.findElement(login);
	 }
}
