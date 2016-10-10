package pages;

import org.openqa.selenium.WebElement;

public class ThamesSignUpNowPage  extends ThamesRegisterPage{
	
	public static String account1 = "input.for-webtrends-duration-start";
	public static String account2 = "input.for-webtrend";
	public static String pass = "input.alignlft";
	public static String nlink = "input#submit_details";
	public static String error = "h2";
	
	
	public  ThamesSignUpNowPage signup(String accountnumber,String postcode) {
	
		WebElement acc = driver.findElementByCssSelector(account1);
		acc.sendKeys("12345");
		WebElement acc2 = driver.findElementByCssSelector(account2);
		acc2.sendKeys("1110111");
		WebElement post = driver.findElementByCssSelector(pass);
		post.sendKeys("tw47nh");
		WebElement login = driver.findElementByCssSelector(nlink);
		login.click();
		return new ThamesSignUpNowPage();
		
	}
	
	public void getThamesSignUpText(){
		WebElement errortext = driver.findElementByTagName(error);
		String str = errortext.getText();
		System.out.println("print : "+str);
	}
}
