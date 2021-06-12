package webDriverAssigment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAdvance {
	
	public static void main(String[] args) {
		new GoogleAdvance().testCase();
	}
   public void testCase() {
	   
	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/advanced_search");
		
		List<String> testData =new ArrayList<String>();
		
		testData.add("jaydeep");
		testData.add("singh");
		testData.add("gohil");
		testData.add("testing");
		testData.add("selenium");
		testData.add("manual");
        testData.add("automation");
        
	List<WebElement> textBoxs= driver.findElements(By.xpath("//input[@type='text']"));
	
	 for(int i=0;i<textBoxs.size();i++)
	 {
		 textBoxs.get(i).sendKeys(testData.get(i));
	 }
	  
	   
   }
}
