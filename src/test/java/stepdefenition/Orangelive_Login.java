package stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orangelive_Login {
	
	WebDriver driver;

	//Open OrangeLive URL in any browser
	@Given("Open OrangeLive URL in any browser")
	public void openBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	//User type valid username and password
	@When("User type valid username and password")
	public void testcredentials() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
	}
	
	
	//Click login button
	@And("Click login button")
	public void login () throws Exception {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
	}
	
	//User successfully logged in
	@When("User successfully logged in")
	public void logout() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
	}

	//System should show successfully complete message
	@Then("System should show successfully complete message")
	public void displaymessage() {
		    if (driver.findElements(By.linkText("Invalid credentials")).size() > 0) {
		    	String errmsg = driver.findElement(By.linkText("Invalid credentials")).getText();
		    	System.out.println(errmsg);
		    }
			else {
				System.out.println("valid credentials");
			}
			
		}
	
	@When("^User type \"([^\"]*)\" and \"([^\"]*)\"$")
	public void multiplecred(String un, String pwd) {
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		
	}

	}
	
	

	

