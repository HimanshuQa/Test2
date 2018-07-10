package Test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Keywords.Basicauth;
import Keywords.Brokenimage;
import Keywords.ExitIntent;
import Keywords.Hovers;
import Keywords.Login1;
import Keywords.Login2;

public class NewTest {

	WebDriver driver;
	Basicauth auth;
	Brokenimage image;
	ExitIntent eintent;
	Login1 login1;
	Login2 login2;
	Hovers hovers;
//	//
//	 @Test
//	 public void f() throws InterruptedException, AWTException {
//	 auth = new Basicauth(driver);
//	 auth.click_on_redbox();
//	 }

//	@Test
//	public void validate_image() throws InterruptedException {
//
//		System.out.println("=============================Validate Image===============================");
//		image = new Brokenimage(driver);
//		image.validateInvalidImages();
//
//	}
//
	@Test
	public void check_for_exitIntent() throws InterruptedException, AWTException {

		System.out.println("==============================Check for exitintent================================");
		eintent = new ExitIntent(driver);
		eintent.move_mouse();

	}

	@Test
	public void check_for_login1() throws InterruptedException, AWTException {

		System.out.println("==============================Check for Login1================================");
		login1 = new Login1(driver);
		login1.verifying_Invalid_error_Displayed();

	}	
	
	@Test
	public void check_for_login2() throws InterruptedException, AWTException {

		System.out.println("==============================Check for Login2================================");
		login2 = new Login2(driver);
		login2.test_for_login2();

	}	
	
	@Test
	public void check_for_hovers() throws InterruptedException, AWTException {

		System.out.println("==============================Check for hover================================");
		hovers = new Hovers(driver);
		hovers.test_hover();

	}	
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/home/himanshuchaudhary/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://10.0.31.161:9292/");

		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {
		driver.get("http://10.0.31.161:9292/");

	}

	@AfterClass
	public void afterTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
