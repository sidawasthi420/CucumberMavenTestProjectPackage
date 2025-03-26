package hooks;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class nutrienagsolutionsHook {

	public static WebDriver driver = null;
	
	@Before
	public void launchBrowser()
	{
		/*
		 * if(browser.equalsIgnoreCase("Chrome")) {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\siddh\\Downloads\\chromedriver-win641\\chromedriver-win64\\chromedriver.exe"
		 * ); driver = new ChromeDriver(); // type-casting
		 * driver.manage().window().maximize(); } else
		 * if(browser.equalsIgnoreCase("Firefox")) {
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\siddh\\Downloads\\geckodriver1.exe"); driver = new
		 * FirefoxDriver(); driver.manage().window().maximize(); } else
		 * if(browser.equalsIgnoreCase("ie")) {
		 * System.setProperty("webdriver.ie.driver",
		 * "C:\\Users\\siddh\\Downloads\\chromedriver-win641\\chromedriver-win64\\inernetexplorerdriver.exe"
		 * ); driver = new InternetExplorerDriver();
		 * driver.manage().window().maximize(); }
		 */
		
		System.out.println("Before Hook executed");
	}
	
	@After
	public void closeBrowser()
	{
		//driver.quit();
		System.out.println("After Hook executed");
	}
}