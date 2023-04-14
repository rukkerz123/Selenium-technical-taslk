package seleniumtechnicaltask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vijay\\Downloads\\Rajeshkumar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println("open window size =" + driver.getWindowHandles().size());
		Set<String>windowid=driver.getWindowHandles();
		Iterator<String> iterator = windowid.iterator();
		List<String>index = new ArrayList<String>();
		while(iterator.hasNext()) {
			index.add(iterator.next());
		driver.switchTo().window(index.get(0));
		System.out.println("first window title"+ driver.getTitle());
		driver.switchTo().window(index.get(1));
		System.out.println("first window title"+ driver.getTitle());
		driver.switchTo().window(index.get(2));
		System.out.println("first window title"+ driver.getTitle());
		
		
		
		
		
		
		
		
}
			
		


	}

}
