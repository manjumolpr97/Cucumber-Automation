package Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CucumberWithSelenium.Selenium.Base;

public class AddToCartPage extends Base {
		
public WebDriver driver;

public AddToCartPage (WebDriver driver) {
	this.driver = driver;
		}
		public void verifyIfAddToCartButtonDisplayed () throws InterruptedException {
			Thread.sleep(2000);
			Assert.assertTrue(driver.findElement(By.xpath("//button[text()= 'ADD TO CART']")).isDisplayed());
		}
	}



