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
public class SearchForMobile extends Base {
	private static final CharSequence Mobile = null;
	WebDriver driver;
	

	   @Given("^The User loads the url$")
	    public void the_user_loads_the_url() throws Throwable {
		System.out.println("Navigated to URL Successfully");
		 Thread.sleep(10000);
	     
	    }

//	    @When("^The user close login popup and continue without login$")
//	    public void the_user_close_login_popup_and_continue_without_login() throws Throwable {
//	        driver.findElement(By.xpath ("//button[text()= '✕']")).click();
//	        Thread.sleep(10000);
//	        
//	    }
	   @When("^The user is in Home page$")
	    public void the_user_is_in_home_page() throws Throwable {
	       
	    }


	   @Then("^The user click on the search box and search as \"([^\"]*)\" and click search$")
	    public void the_user_click_on_the_search_box_and_search_as_something_and_click_search(String strArg1) throws Throwable {
	    	driver.findElement(By.xpath ("//input[@title='Search for products, brands and more']")).sendKeys(Mobile);
	        Thread.sleep(800);
	        driver.findElement(By.xpath ("//button[@type= 'submit']")).click();
	        Thread.sleep(1000);
	    }

	   
//	   @And("^The mobiles are listed$")
//	    public void the_mobiles_are_listed() throws Throwable {
//	       
//	    }

//	   @When("^The user select the required mobile from the list$")
//	    public void the_user_select_the_required_mobile_from_the_list() throws Throwable {
//	    	driver.findElement(By.xpath ("//div[contains (text(), 'POCO M3')]")).click();
//	    	 Thread.sleep(1000);
//	     
//	    	
//	    }
	    
//	   @Then("^The product details page is displayed$")
//	    public void the_product_details_page_is_displayed() throws Throwable {
//	    	Set<String>windows=driver.getWindowHandles();
//	    	Iterator<String>it=windows.iterator();
//	    	String parentWindow=it.next();
//	    	String activeWindow=it.next();
//	    	driver.switchTo().window(activeWindow);
//	    	Thread.sleep(1000);
//	 
//	    }


//	   @And("^The user click on Add to cart button$")
//	    public void the_user_click_on_add_to_cart_button() throws Throwable {
//	    	driver.findElement(By.xpath ("//button[text()='ADD TO CART']")).click();
//	        
//	    }

	}	
