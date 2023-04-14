package seleniumtechnicaltask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadingafile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vijay\\Downloads\\Rajeshkumar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		WebElement a = driver.findElement(By.id("uploadfile"));
		a.sendKeys("C:\\Users\\vijay\\OneDrive\\Desktop\\pic.jpg");
	}

}
