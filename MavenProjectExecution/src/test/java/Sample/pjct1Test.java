package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pjct1Test {
	
@Test
	
	public void pjcTest()
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
	}

	

}



