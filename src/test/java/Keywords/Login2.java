package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login2 {
	WebDriver driver;

	public Login2(WebDriver driver) {
		this.driver = driver;
	}

	public void verifying_LOGIN_Page_Displayed() {

		Assert.assertEquals("http://10.0.31.161:9292/login", driver.getCurrentUrl());

	}

	public void test_for_login2() {
		
		driver.findElement(By.linkText("Form Authentication")).click();
		verifying_LOGIN_Page_Displayed();
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector("#login > button")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"flash\"]")).isDisplayed(), "secure area is not displayed");
		String securemsg = js.executeScript("return document.querySelector(('#content > div > h2')).textContent;").toString();
		Assert.assertTrue(securemsg.contains("Secure Area"), "Page is not displayed correctly");
		js.executeScript("document.querySelector('a.button.secondary.radius').click()");
		verifying_LOGIN_Page_Displayed();
		
		

	}
}
