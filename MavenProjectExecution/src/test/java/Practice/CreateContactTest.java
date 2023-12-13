package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactTest {
	
	@Test
	
	public void Test()
	{
		
		WebDriverManager.chromedriver().setup();
		
//		//opening the cromedriver
		WebDriver driver=new ChromeDriver();
		driver.get(null);
		System.out.println("Hehttps://www.amazon.com/llo");
	}

}
