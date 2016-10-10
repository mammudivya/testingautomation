package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ThamesLoginPage;

public class ThamesLoginTests extends ThamesLoginPage  {
	
	public static String username = "";
	public static String password = "";
	
	@Test
	public void verifyLonginPageTitle(){
		getThamesWaterHomePage();
		Assert.assertEquals(getTitle(), title);
		
		String cmdInhomepage = driver.getWindowHandle();
		
		goToLoginPage();
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Assert.assertEquals(getLonginPageTitle(), loginTitle );
		
		driver.switchTo().window(cmdInhomepage);
	}
	
	@Test
	public void verifyUserLongin(){
		getThamesWaterHomePage();
		Assert.assertEquals(getTitle(), title);
		
		String cmdInhomepage = driver.getWindowHandle();
		
		goToLoginPage();
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Assert.assertEquals(getLonginPageTitle(), loginTitle );
		
		//call user login method here
		login(username, password);
		geterorrtext();
		
			}



}
