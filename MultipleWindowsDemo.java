package webDriver.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowsDemo {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Maxmizethe browser
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
			
		
		//Click on Credit Card Image
		driver.findElement(By.xpath("//img[@alt='Credit Cards']")).click();
		
		System.out.println("Before Click Apply Now : "+driver.getWindowHandles().size());
		
		//Get ParentWindow Property
		String parentWindowProp=driver.getWindowHandle();
		
		//Wait For ApplyNow Link
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Click to apply for Credit Cards']")));
		
		//Click on Apply Now
		driver.findElement(By.xpath("//a[@title='Click to apply for Credit Cards']")).click();
		
		
		//Get Child Window Property
		for(String childWindowProp : driver.getWindowHandles()) {
			
			//Select Child Window
			driver.switchTo().window(childWindowProp);
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtName")));
		//Enter Name
		driver.findElement(By.id("txtName")).sendKeys("selenium");

		System.out.println("After Click Apply Now : "+driver.getWindowHandles().size());
		
		//Seelct Parent Window
		driver.switchTo().window(parentWindowProp);
		
		if(driver.getWindowHandles().size()==2) {
			System.out.println("Test Case Pass");
		}
		//Click Close Option on Parent Window
		driver.findElement(By.xpath("//a[@title='Click to apply for Credit Cards']/../preceding-sibling::a")).click();
	}
}

	


