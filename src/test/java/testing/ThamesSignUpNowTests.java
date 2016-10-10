package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ThamesSignUpNowPage;

public class ThamesSignUpNowTests extends ThamesSignUpNowPage {
	
	public static String username = "";
	public static String password = "";
	
	@Test	
	public void verifyThamesSignUpNow(){
		getThamesWaterHomePage();
		Assert.assertEquals(getTitle(), title );
		
		String cmdInhomePage = driver.getWindowHandle();
		
		goToRegisterPage();
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		Assert.assertEquals(getRegisterPageTitle(), rpTitle );
		goToSignUpNowPage();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		signup(username,password);
		getThamesSignUpText();
	}

}
