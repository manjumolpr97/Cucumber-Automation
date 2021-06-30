package StepDefinition;

import org.openqa.selenium.WebDriver;

import CucumberWithSelenium.Selenium.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	WebDriver driver;
	@Before ("@SeleniumSmoke")
		public void BeforeSeleniumTest() {
		driver = Base.getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mobile-phones-store");
		
		 

	}
	
//	@After("@SeleniumSmoke")
//	public void AfterSeleniumTest() {
//		driver.close();
//		System.out.print("Driver closed successfully");
//	}
		
	}


