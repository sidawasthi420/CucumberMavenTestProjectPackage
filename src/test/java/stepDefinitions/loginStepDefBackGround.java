package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;

public class loginStepDefBackGround {

	public static WebDriver driver = loginStepDef.driver;
	
	@FindBy(xpath="(//a[text()='Products'])[1]")
	public WebElement productPage;
	
	@FindBy(xpath="(//a[text()='Services'])[1]")
	public WebElement servicesPage;
	
	public loginStepDefBackGround(){
		PageFactory.initElements(driver, this);
	}
	
	@Then("^Navigate to product page$")
	public void navigate_to_product_page() throws InterruptedException {
	   Thread.sleep(3000);
	   productPage.click();
	}

	@Then("^Navigate to services page$")
	public void navigate_to_services_page() throws InterruptedException {
		Thread.sleep(3000);
		servicesPage.click();
	}
}
