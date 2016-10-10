package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sample.testingautomation.Driver;

public class ThamesRegisterPage extends ThamesHomePage {
	
	protected String rpTitle = "Your online account - Your account - Thames Water";
	public static String sign = "span.button-left";
	
	
	
	public String getRegisterPageTitle(){	
		String title = driver.getTitle();
		return title;		
	}
	public ThamesSignUpNowPage goToSignUpNowPage(){

		WebElement signup = driver.findElementByCssSelector(sign);
			signup.click();
			ThamesSignUpNowPage ts = new ThamesSignUpNowPage();
			return ts;	
	}
	
	
	}
	


