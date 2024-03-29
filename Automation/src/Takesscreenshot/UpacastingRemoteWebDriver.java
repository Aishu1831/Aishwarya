package Takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class UpacastingRemoteWebDriver {
public static void main(String[] args) throws IOException, InterruptedException {
		
		RemoteWebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://www.apple.com/");
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src=driver.getScreenshotAs(OutputType.FILE);
		 Thread.sleep(2000);
		 File dest=new File("./Screenshot/image.png");
		 Files.copy(src,dest);
}
}