package maven.End2EndProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPage {
WebDriver driver = null;
	@BeforeTest
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	@Parameters({"username","password"})
	public void test1(String uname,String pwd) {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys(("username"));
		driver.findElement(By.name("password")).sendKeys(("password"));
		driver.findElement(By.name("login")).sendKeys((Keys.RETURN));
	}
}
