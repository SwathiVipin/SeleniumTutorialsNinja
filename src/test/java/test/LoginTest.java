package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.BaseClass;

public class LoginTest extends BaseClass {

	

	@Test
	public void Test() throws IOException
	{
		WebDriver driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
}
