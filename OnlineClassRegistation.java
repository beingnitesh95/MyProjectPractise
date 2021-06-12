package webdriver.nareshit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineClassRegistation {
	
	public void nareshhyderabad() {
		 //lanch browser
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//enter url
		driver.get("https://nareshit.in/student-registration/");
		
		//enter name
		driver.findElement(By.id("input_8_1")).sendKeys("goopal");
		
		//enter email
		driver.findElement(By.id("input_8_2")).sendKeys("goopalsingh25@gmail.com");
		// contact no.
		driver.findElement(By.id("input_8_3")).sendKeys("1122883399");
		// mode of traning
		driver.findElement(By.id("input_8_5")).sendKeys("online Traning");
		
	// cource
		driver.findElement(By.id("input_8_12")).sendKeys("selenium");
		//submit
		driver.findElement(By.id("gform_submit_button_8")).click();
		driver.quit();
		}
	public static void main(String[] args) {
		
		new OnlineClassRegistation().nareshhyderabad();
		
	}
}
