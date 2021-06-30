package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CucumberWithSelenium.Selenium.Base;

public class SearchPage extends Base {
	
public WebDriver driver;

	public SearchPage (WebDriver driver) {
		this.driver = driver;
	}
	public void verifyIfNavigatedToSearchPage () throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//input[@title='Search for products, brands and more")).isDisplayed());
	}
}
