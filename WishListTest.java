package webdriver.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webdriver.day2.Setup;

public class WishListTest implements Setup{

	
	public void testCase(){
		
		System.setProperty(CHROME_KEY, CHROME_PATH);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		
		//Enter UserName
		driver.findElement(By.id("email")).sendKeys("manoj@mailinator.com");
		driver.findElement(By.id("passwd")).sendKeys("Manoj@123");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		//Wait For Till WishList Vissible
		
		new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='My wishlists']")));
		//Click on MyWishList
		driver.findElement(By.xpath("//a[@title='My wishlists']")).click();
		
		
		//Wait for New Wishlist Text Box Present
		List<String> expectedWishLists=new ArrayList();
		
		expectedWishLists.add("First WishList");
		expectedWishLists.add("Second WishList");
		expectedWishLists.add("Third WishList");
		expectedWishLists.add("Fourth WishList");

		for(int i=0;i<expectedWishLists.size();i++) {
			

		new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		
		//Enter wishList Name
		driver.findElement(By.id("name")).sendKeys(expectedWishLists.get(i));
		
		//Click on save button
		driver.findElement(By.id("submitWishlist")).click();
	
		}
		
	
		//Verify Wishlist table size
		List<WebElement> actualWishList=driver.findElements(By.xpath("//div[@id='block-history']//tbody/tr"));
		
		if(expectedWishLists.size()==actualWishList.size()) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		
		//Verify WishListName in the table
		
		/*//div[@id='block-history']//tbody/tr[
		1
		]/td[1]/a*/
		
		
		String xpath_Start="//div[@id='block-history']//tbody/tr[";
		String xpath_End="]/td[1]/a";
		
		int i=1;
		
		List<String> actualWishistNames=new ArrayList();
		for(i=1;i<=actualWishList.size();i++) {
			
			String wishListName=driver.findElement(By.xpath(xpath_Start+i+xpath_End)).getText();
			//Add wishlist name into actualWishistNames list
			actualWishistNames.add(wishListName);
		}
		
		System.out.println("actualWishistNames :"+actualWishistNames);
		System.out.println("expectedWishLists  :"+expectedWishLists);
	
		//Sort wishlist names
		Collections.sort(actualWishistNames);
		Collections.sort(expectedWishLists);
		
	
		if(actualWishistNames.equals(expectedWishLists)) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
	}
	
	
	public static void main(String[] args) {
		new WishListTest().testCase();
		
	}
}
