package WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSetSize {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	Dimension dimension=new Dimension(1000,2000);
	driver.manage().window().setSize(dimension);
	driver.get("http://www.google.com");
	
}
}
