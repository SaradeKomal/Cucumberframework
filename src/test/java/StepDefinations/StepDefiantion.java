package StepDefinations;

import java.io.IOException;

import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;
import PageObjectModel.loginpageobject;
import Resources.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class StepDefiantion extends BaseClass{
	
	public loginpageobject LPO;
@Given("Initialize browser")
public void initialize_browser() throws IOException {
	initializeDriver();
	
  //driver=new ChromeDriver();
}

@When("user navigates url")
public void user_navigates_url() {
	LPO=new loginpageobject(driver);//(problem)
	
   driver.get("https://login.salesforce.com/");
   System.out.println("pass");
}

@When("user enter username and password and click on login")
public void user_enter_username_and_password_and_click_on_login() {
 LPO=new loginpageobject(driver);
 
	LPO.EnteruserName().sendKeys("hello");
	LPO.EnterpassWord().sendKeys("122");
	LPO.ClickonLogin().click();
	/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
 driver.findElement(By.xpath("//input[@id='Login']")).click();*/
}

@Then("user should be login successfully")
public void user_should_be_login_successfully() {
   System.out.println("hello");
}
}