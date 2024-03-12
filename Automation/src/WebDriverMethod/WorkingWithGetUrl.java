package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetUrl {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://paytm.com/");
	
	driver.manage().window().maximize();
	
	String source = driver.getPageSource();
	System.out.println(source);
	
	String actual_url = driver.getCurrentUrl();
	String expected_url = "https://paytm.com/";
	if (actual_url.equals( expected_url))
	{
	    System.out.println("Test case pass");
	}
	else
	{
		System.out.println("test case fail");
	}
	
    String actual_title=driver.getTitle();
	String expected_title="Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
    if (actual_title.equals(expected_title))
    {
		System.out.println("TestCase is Pass");
	}
    	else
	{
		System.out.println("TestCase is fail");
	}

	
}
}
