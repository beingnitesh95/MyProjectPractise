package webdriver.day9;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;import java.util.TimeZone;

public class GetDate {


	public static void main(String[] args) {


		String actualDate="2019-02-02";

		String DateForMat="yyyy-MM-dd";


		//Get Current Date
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DateForMat);  

		LocalDateTime l=LocalDateTime.now(ZoneId.of("America/New_York"));

		String expectedDate=dtf.format(l);

		if(expectedDate.equals(actualDate)) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
	}
}
