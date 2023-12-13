package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project2Test {
	
	@Test
	
	public void pjc2Test()
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
	}

	

}
