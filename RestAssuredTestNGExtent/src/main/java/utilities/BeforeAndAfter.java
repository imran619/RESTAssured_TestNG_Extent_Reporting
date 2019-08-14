package utilities;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAndAfter {

	@BeforeSuite
	public void setup() {
		System.out.println("RestAssured test started......");
	}

	@AfterSuite
	public void tearDown() throws IOException {
		System.out.println("RestAssured test finished......");
	}

}
