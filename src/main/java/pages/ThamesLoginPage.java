package pages;

import org.openqa.selenium.WebElement;

import com.sample.testingautomation.Driver;

public class ThamesLoginPage extends ThamesHomePage {
	
	protected String loginTitle ="Log in to your account";
	public static String mail = "input#lg";
	public static String passwod = "input.passwordInput.input-block";
	public static String link = "input.for-webtrends-duration-submit";
	public static String error = "p.input-info.error";
			
			
	public String getLonginPageTitle(){
		String ltitle =  driver.getTitle();
		return ltitle;
	} 
	
	//write login method which should return ThamesUserHomePage
	
	public ThamesUserHomePage login(String username, String password){
		
		WebElement mailid = driver.findElementByCssSelector(mail);
		mailid.sendKeys("example@yahoo.co.uk");
		WebElement pass = driver.findElementByCssSelector(passwod);
		pass.sendKeys("mammu123");
		WebElement loginlk = driver.findElementByCssSelector(link);
		loginlk.click();		
		return new ThamesUserHomePage();
	}
	
	public void geterorrtext(){
		WebElement errortext = driver.findElementByCssSelector(error);
		String str = errortext.getText();
		System.out.println("print:"+str);
		
	}

}
