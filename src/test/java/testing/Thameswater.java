package testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sample.testingautomation.Driver;

public class Thameswater extends Driver {
	
	
	String link = "a.padlft5";
	String sing = "ul.tout-list";
	String window = "http://www.thameswater.co.uk/your-account/18205.htm";
	String window2 = "https://my.thameswater.co.uk/cps/rde/xchg/account/hs.xsl/register.htm";
	String account1 = "input.for-webtrends-duration-start";
	String account2 = "input.for-webtrend";
	String pass = "input.alignlft";
	String nlink = "input#submit_details";
	
	
	@Test
	public void test(){
		driver.get("http://www.thameswater.co.uk");
		WebElement rlink = driver.findElementByCssSelector(link);
		rlink.click();
		driver.navigate().to(window);
		WebElement singup = driver.findElementByCssSelector(sing);
		singup.click();
		driver.navigate().to(window2);
		WebElement acc1 = driver.findElementByCssSelector(account1);
		acc1.sendKeys("12345");
		WebElement acc2 = driver.findElementByCssSelector(account2);
		acc2.sendKeys("1110111");
		WebElement password = driver.findElementByCssSelector(pass);
		password.sendKeys("tw4 7nh");
		WebElement nextlink = driver.findElementByCssSelector(nlink);
		nextlink.click();
	}
	
}
