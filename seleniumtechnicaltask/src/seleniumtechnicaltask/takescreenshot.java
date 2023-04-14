package seleniumtechnicaltask;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vijay\\Downloads\\Rajeshkumar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\vijay\\OneDrive\\Desktop\\New folder (2)\\pic.png");
		FileHandler .copy(src, des);
	}

		
}		
	





