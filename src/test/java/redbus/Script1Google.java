package redbus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script1Google {
	static
	{
		System.setProperty("webDriver.chrome.driver","/redbus/chromedriver.exe" );
		
	}
	@Test
	public void test() {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}


}

