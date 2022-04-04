package SanketLearning.Mavenjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void testCase1()
	{
		System.out.println("Successfully Tested TestCase1");
		System.out.println("Successfully Tested Web Automation");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Successfully Tested TestCase2");
	}

		@Test
		public void run()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\soniq\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}

}
