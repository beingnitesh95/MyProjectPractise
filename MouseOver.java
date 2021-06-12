package webDriverAssigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseOver {
	
	public static void main(String[] args) throws InterruptedException {
		new MouseOver().testCase();
	}
public void testCase() throws InterruptedException {
	
	//lanch the browser
    
	   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
	
	   WebDriver driver= new ChromeDriver();
	// get url 
	   driver.get("https://book.spicejet.com/search.aspx");
	
	// log in 
	   WebElement element=driver.findElement(By.id("Login"));
	     Actions action = new Actions(driver);
		 action.moveToElement(element).build().perform();
		Thread.sleep(5000); 
   //specific club member
		WebElement element1=driver.findElement(By.xpath("(//*[@class='rightarrowclass'])[5]"));
		 Actions action1 = new Actions(driver);
		 action1.moveToElement(element1).build().perform();
			Thread.sleep(5000);
	//	sign in 
		//a[text()='Sign up]'
		 WebElement element2=driver.findElement(By.xpath("//a[text()='Sign up']"));
		 Actions action2 = new Actions(driver);
		 action2.moveToElement(element2).build().perform(); 
		 
		 //click in sign in 
		 driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		 
	 
// first name
 driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName")).sendKeys("jaydeep");	
// last name
 driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName")).sendKeys("gohil");
 //number
 driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstPhone")).sendKeys("8085912697");
 // password CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword
 driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword")).sendKeys("selenium@123");
 //conform password
 driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm")).sendKeys("selenium@123");
 // day  
 WebElement day=driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListDOBDay"));
 Select s= new Select(day);
 s.selectByValue("6");
 // month 
 WebElement month=driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListDOBMonth"));
 Select s1= new Select(month);
 s1.selectByValue("9");
 // year  
 WebElement year=driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListDOBYear"));
 Select s2= new Select(year);
 s2.selectByValue("1995");
// email
 driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail")).sendKeys("jay@mailinator");

 
 
 
}
}
