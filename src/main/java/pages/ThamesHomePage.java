package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sample.testingautomation.Driver;

public class ThamesHomePage extends Driver {
	
	
	String homepageUrl = "http://www.thameswater.co.uk/";
	protected String title ="Homepage - Thames Water - Contact us, pay your bill, tell us you're moving";
	
	public ThamesHomePage  getThamesWaterHomePage() {
		driver.get(homepageUrl);
		return new ThamesHomePage();
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public ThamesRegisterPage goToRegisterPage(){

		WebElement register = driver.findElement(By.linkText("Register"));
			register.click();
			ThamesRegisterPage tr = new ThamesRegisterPage();
			return tr;	
	}
	
	public ThamesLoginPage goToLoginPage(){
		WebElement login = driver.findElementByLinkText("Log in");
		login.click();
		return new ThamesLoginPage(); 
	}

}
