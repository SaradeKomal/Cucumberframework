package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	public void initializeDriver() throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
	 prop=new Properties();
	prop.load(fis);
	String browsername=prop.getProperty("Browser");
	
	if (browsername.equalsIgnoreCase("chrome")) {
		 driver=new ChromeDriver();
	}else if(browsername.equalsIgnoreCase("egde")) {
		 driver=new EdgeDriver();
	}else if(browsername.equalsIgnoreCase("firefox")) {
		WebDriver driver=new FirefoxDriver();
	}else {
		System.out.println("enter proper browsername");
	}
	}
	
	/*
	 * public void launchBrowser() throws IOException {
	 * 
	 * initializeDriver();
	 * 
	 * String url = prop.getProperty("url"); driver.get(url);
	 * 
	 * }
	 */
	 


}
