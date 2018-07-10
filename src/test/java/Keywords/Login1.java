package Keywords;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login1 {

	WebDriver driver;

	public Login1(WebDriver driver) {
		this.driver = driver;
	}

	public void verifying_LOGIN_Page_Displayed() {

		Assert.assertEquals("http://10.0.31.161:9292/login", driver.getCurrentUrl());

	}

	public void verifying_Invalid_error_Displayed() {
		driver.findElement(By.linkText("Form Authentication")).click();
		verifying_LOGIN_Page_Displayed();
		driver.findElement(By.id("username")).sendKeys("kchbhi");
		driver.findElement(By.id("password")).sendKeys("Kchbhi");
		driver.findElement(By.cssSelector("#login > button")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"flash\"]")).isDisplayed(), "error is not displayed");
		String errormsg = js.executeScript("return document.querySelector(('#flash')).textContent.trim();").toString();
		Assert.assertTrue(errormsg.contains("Your username is invalid!"), "error message is not displayed correctly");
	}
}
