package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginWithDatatable {
	
	WebDriver driver;
	
	@Given("User Launch Firefox browser")
	public void user_Launch_Firefox_browser() {
		driver = new FirefoxDriver();
	}

	@When("User Opens URL {string}")
	public void user_Opens_URL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User Enters username and password then clicks submit and logout")
	public void user_Enters_username_and_password_then_clicks_submit_and_logout(io.cucumber.datatable.DataTable credentials) throws InterruptedException {
		List<Map<String, String>> listOfMap = credentials.asMaps();
	    for(Map<String, String> map : listOfMap){
	    	//for(String key : map.keySet()){
	    		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='Email']"));
	    		txtUsername.clear();
	    		txtUsername.sendKeys(map.get("username"));
				WebElement txtPassword = driver.findElement(By.xpath("//input[@id='Password']"));
				txtPassword.clear();
				txtPassword.sendKeys(map.get("password"));
				Thread.sleep(2000);
				
				WebElement submitBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
				submitBtn.click();									
				Thread.sleep(2000);
				
				WebElement logoutLink = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
				logoutLink.click();
				Thread.sleep(2000);
	    }
	}

	@Then("Close Browser")
	public void close_Browser() {
	    driver.quit();
	}

}
