package seleniumtechnicaltask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectingmultioptionsdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vijay\\Downloads\\Rajeshkumar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		WebElement a = driver.findElement(By.xpath("//select[@id='course']"));
		Select sel = new Select(a);
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByVisibleText("other course");
		System.out.println(sel.getFirstSelectedOption().getText());

	}

}
