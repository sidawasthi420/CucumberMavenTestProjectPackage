package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class loginStepDef {

	public static WebDriver driver = null;
	
	  @Given("^Open the \"([^\"]*)\" browser$")
	  public void launchBrowser(String browser)
	    {
	    	if(browser.equalsIgnoreCase("Chrome"))
	    	{
	    		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	    		driver = new ChromeDriver(); // type-casting
	    		driver.manage().window().maximize();
	    	}
	    	else if(browser.equalsIgnoreCase("Firefox"))
	    	{    	
	    		 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\driver\\geckodriver1.exe");
	    		 driver = new FirefoxDriver();
	    		 driver.manage().window().maximize();
	    	}
	    	else if(browser.equalsIgnoreCase("ie"))
	    	{    
	    		System.setProperty("webdriver.ie.driver",  System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	    		driver = new InternetExplorerDriver();
	    		driver.manage().window().maximize();
	    	}
	    }
	   
	  @When("^User navigates to the url \"([^\"]*)\"$")
	  public void user_navigates_to_the_url(String url) throws InterruptedException {
	     Thread.sleep(4000);	  
	     driver.get(url);
	  }

	  @Then("^Nutrien Logo got displayed successfully$")
	  public void nutrien_logo_got_displayed_successfully() throws InterruptedException {
	     Thread.sleep(4000);
	     boolean logo = driver.findElement(By.xpath("//img[@alt='Nutrien Logo']")).isDisplayed();
	     Assert.assertEquals(true, logo);
	  }
	  
	  @Then("^Close the browser$")
	  public void close_the_browser() throws InterruptedException {
	     Thread.sleep(4000);
	     driver.quit();
	  }
}
