package webDriverAssigment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo {
       public static void main(String[] args) {
		new LinkDemo().testCase();
	}
	public void testCase() {
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
			
		for(int i=0;i<links.size();i++)	{
			
			System.out.println(links.get(i).getAttribute("href"));
		}
			
			
	}
}
