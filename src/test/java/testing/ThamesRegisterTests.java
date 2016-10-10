package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ThamesHomePage;
import pages.ThamesRegisterPage;

public class ThamesRegisterTests extends ThamesRegisterPage {
	
	
	@Test
	public void verifyRegisterPageTitle(){
		getThamesWaterHomePage();
		Assert.assertEquals(getTitle(), title );
		
		String cmdInhomePage = driver.getWindowHandle();
		
		goToRegisterPage();
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		Assert.assertEquals(getRegisterPageTitle(), rpTitle );
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	}	

}
