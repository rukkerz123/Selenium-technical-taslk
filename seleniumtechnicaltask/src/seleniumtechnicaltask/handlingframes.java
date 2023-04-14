package seleniumtechnicaltask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vijay\\Downloads\\Rajeshkumar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.switchTo().frame(0);
		WebElement a = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']"));
		WebElement b = driver.findElement(By.xpath("//span[@id='current_filter']"));
		b.click();
		

	}

}
