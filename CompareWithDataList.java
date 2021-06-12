package webDriverAssigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareWithDataList {
	
	public static void main(String[] args) {
	new CompareWithDataList().testCase();
}
   public void testCase() {
	   
	   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.w3schools.com/html/html_tables.asp");
	   
	 //table[@id='customers']/tbody/tr/td[1]
	   
	   String xpath_Start="//table[@id='customer']/tbody/tr";
	   String xpath_End="/td[1]";
	        int i =2 ;
	        for(i=2; i<8;i++) {
	        	driver.findElement(By.xpath(xpath_Start+i+xpath_End)).getText();
	        	System.out.println(i);
	        }
	   
			   
   }
}
