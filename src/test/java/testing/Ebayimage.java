package testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ebayimage {
	
	FirefoxDriver driver;
	String imageurl ="http://i2.ebayimg.com/images/g/2X8AAOxy0bRTEOVH/s-l500.jpg";
	String imageUrl1="div.big-hero-image [src*='s-1500']";
	String src = "div.big-hero-image";
	
	@BeforeMethod
	public void strat(){
		driver = new FirefoxDriver();
	}
	
	@Test
	public void test(){
		driver.get("http://www.ebay.co.uk");
		WebElement image = driver.findElementByCssSelector(imageUrl1);
		System.out.println("String image url :"+image.getAttribute("src"));	
		System.out.println("Item text :"+image.getText());
		
		driver.navigate().to("www.google.com");
	}
	
	@AfterMethod
	public void quit(){
		driver.quit();
	}
	

}
