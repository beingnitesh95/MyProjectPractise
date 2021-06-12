package webDriver.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {
	
	public static void main(String[] args) throws InterruptedException {
		new FindElementExample().testCase();
	}
   public void testCase() throws InterruptedException {
	  
	   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://automationpractice.com/index.php");
	    Thread.sleep(5000);
	   driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
	   driver.findElement(By.id("email")).sendKeys("jaydeep@mailinator.com");
	   driver.findElement(By.id("passwd")).sendKeys("selenium@123");
	   driver.findElement(By.id("SubmitLogin")).click();
	   
	   List<String> expectedWishList=new ArrayList<String>();
	   expectedWishList.add("selenium1");
	   expectedWishList.add("selenium2");
	   expectedWishList.add("selenium4");
	   expectedWishList.add("selenium3");
	   expectedWishList.add("selenium5");
	   
	   String expectedData=RandomStringUtils.randomAlphabetic(6);
	   
	    driver.findElement(By.xpath("//a[@title='My wishlists']")).click();
	   for(int i=0;i<expectedWishList.size();i++) {
	   driver.findElement(By.id("name")).sendKeys(expectedWishList.get(i));
	   driver.findElement(By.id("submitWishlist")).click();
	   Thread.sleep(3000);
	   
	   }
	   
	  //get wish list name
	   
	  List<String> actualWishList=new ArrayList<String>();
	  
List<WebElement> actualWishListName= driver.findElements(By.xpath("//*[@class='table table-bordered']/tbody/tr/td[1]/a"));
	  for(int i=0; i<actualWishListName.size();i++) {
		  actualWishList.add(actualWishListName.get(i).getText());
	  }
	System.out.println("Expected WishList :"+expectedWishList);
	System.out.println("Actual WishList :"+actualWishList);
	
	Collections.sort(expectedWishList);
	Collections.sort(actualWishList);
	
	if(expectedWishList.equals(actualWishList)) {
		System.out.println("Test Case Pass");
	}else {
		System.out.println("Test Case Fail");
	}
   }
}
