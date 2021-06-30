package StepDefinition;
import java.util.Iterator;
import java.util.Set;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CucumberWithSelenium.Selenium.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
public class AddToCart {
	private static final CharSequence Mobile = null;
	WebDriver driver;
    @When("^The mobiles are listed$")
    public void the_mobiles_are_listed() throws Throwable {
        
    }

    @Then("^The user select the required mobile from the list$")
    public void the_user_select_the_required_mobile_from_the_list() throws Throwable {
    	driver.findElement(By.xpath ("//div[contains (text(), 'POCO M3')]")).click();
   	    Thread.sleep(1000);
        
    }
    
    @And("^The product details page is displayed$")
    public void the_product_details_page_is_displayed() throws Throwable {
    	Set<String>windows=driver.getWindowHandles();
    	Iterator<String>it=windows.iterator();
    	String parentWindow=it.next();
    	String activeWindow=it.next();
    	driver.switchTo().window(activeWindow);
    	Thread.sleep(1000); 
    }

    @Then("^The user click on Add to cart button$")
    public void the_user_click_on_add_to_cart_button() throws Throwable {
    	driver.findElement(By.xpath ("//button[text()='ADD TO CART']")).click();
    	Thread.sleep(2000);
       
    }

    

}