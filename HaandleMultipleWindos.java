package webDriverAssigment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HaandleMultipleWindos {
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		// click in cradit card
		driver.findElement(By.xpath("(//img[@class='front icon'])[2]")).click();
		
		//Get ParentWindow Property
				String parentWindowProp=driver.getWindowHandle();
				
		//Wait For ApplyNow Link
				WebDriverWait wait=new WebDriverWait(driver,50);
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Click to apply for Credit Cards']")));
				
		//click in apply
		driver.findElement(By.xpath("//a[@title='Click to apply for Credit Cards']")).click();
		
		//Get Child Window Property
				for(String childWindowProp : driver.getWindowHandles()) {
					
					//Select Child Window
					driver.switchTo().window(childWindowProp);
					
				}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtName")));
		//enter first name 
		driver.findElement(By.id("txtName")).sendKeys("jaydeep");
		
		// switch to again parent window
		driver.switchTo().window(parentWindowProp);
		
		//Wait For ApplyNow Link
		WebDriverWait wait1=new WebDriverWait(driver,50);
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Click to apply for Credit Cards']")));
		
//click in apply
driver.findElement(By.xpath("//a[@title='Click to apply for Credit Cards']")).click();

//Get Child Window Property
		for(String childWindowProp : driver.getWindowHandles()) {
			
			//Select Child Window
			driver.switchTo().window(childWindowProp);
			
		}

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtName")));
//enter first name 
driver.findElement(By.id("txtEmailID")).sendKeys("jaygohil59@gmail.com");

		// switch to one more time parent window
          driver.switchTo().window(parentWindowProp);
		
        //Wait For ApplyNow Link
  		WebDriverWait wait2=new WebDriverWait(driver,50);
  	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Click to apply for Credit Cards']")));
  		
  //click in apply
  driver.findElement(By.xpath("//a[@title='Click to apply for Credit Cards']")).click();

  
  //Get Child Window Property
  		for(String childWindowProp : driver.getWindowHandles()) {
  			
  			//Select Child Window
  			driver.switchTo().window(childWindowProp);
  			
  		}

  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtName")));
  //enter first name 
  driver.findElement(By.id("txtPincode")).sendKeys("5600016");

	
		
	}

}
