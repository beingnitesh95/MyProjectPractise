package webDriver.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListComparison {
	public static void main(String[] args) {
		
		
		List<String> expected = new ArrayList<String>();
		expected.add("selenium2");
		expected.add("selenium1");
		expected.add("selenium3");
		

		List<String> actual= new ArrayList<String>();
		actual.add("selenium1");
		actual.add("selenium2");
		actual.add("selenium3");
		
		Collections.sort(expected);
		Collections.sort(actual);
		
		if(expected.equals(actual)) {
			System.out.println("Test Case Pass");
		}else {
		System.out.println("Test Case Fail");
		}

		
	}
}
