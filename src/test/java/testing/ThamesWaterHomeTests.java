package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sample.testingautomation.Driver;

import pages.ThamesHomePage;

public class ThamesWaterHomeTests extends ThamesHomePage {
	
	@Test
	public void verifyThamesWaterHomePage(){
		getThamesWaterHomePage();
		Assert.assertEquals(getTitle(), title );
	}
	


}
