package testng.day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import webdriver.day2.Setup;

public class ScreenshotDemo implements Setup{




	@Test
	public void testCase() throws IOException {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\screenshots\\test.png"));

	}
}
