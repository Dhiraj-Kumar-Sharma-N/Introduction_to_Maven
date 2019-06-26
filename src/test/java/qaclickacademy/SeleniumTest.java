package qaclickacademy;

import org.testng.annotations.Test;

public class SeleniumTest {

	//testng xml file from Maven
	// how to execute all test cases from Test folder  - mvn test
	@Test
	public void BrowserLaunchTest()
	{
		System.out.println("BROWSER LAUNCED THROUGH SELENIUM");	
	}
	@Test
	public void BrowserCloseTest()
	{
		System.out.println("BROWSER CLOSED THROUGH SELENIUM");	
	}
	
	
}
