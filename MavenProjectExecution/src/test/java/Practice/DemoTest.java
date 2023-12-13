package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	
	@Test
	
	public void demoTest()
	{
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
		
		WebDriver driver;
		if(BROWSER.equalsIgnoreCase("chrome"))
			 {
				 WebDriverManager.chromedriver().setup();
					 driver=new ChromeDriver();
			 }
			 
			 else  
			 
			 {
				
				  driver=new FirefoxDriver();
				 
			 }
			 
			driver.get(URL);
	}

}
