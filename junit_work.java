package RestAssuredPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junit_work {
	WebDriver driver;
@Before
public void before()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shikh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https:/demo.guru99.com/test/newtours/");
}

@Test
public void test()
{
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("submit")).click();
}

@After
public void after()
{
	driver.close();
}
}
