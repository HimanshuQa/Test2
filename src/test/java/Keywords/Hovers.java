package Keywords;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Hovers {
	WebDriver driver;

	public Hovers(WebDriver driver) {
		this.driver = driver;
	}

	public void is_displayed() {

		Assert.assertEquals("http://10.0.31.161:9292/hovers", driver.getCurrentUrl());
		List<WebElement> list = driver.findElements(By.className("figure"));
		Assert.assertTrue(list.size() == 3, "all images does not load");
	}

	public void test_hover() {

		driver.findElement(By.linkText("Hovers")).click();
		is_displayed();
		hover_On_Image();
		move_Away_From_Image();
	}
	public void hover_On_Image() 
	{
		WebElement image1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
		Actions builder = new Actions(driver);
		builder.moveToElement(image1).build().perform();
		
		boolean status1 =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5")).isDisplayed();
		boolean status2= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a")).isDisplayed();
		Assert.assertTrue(status1);
		Assert.assertTrue(status2);
		
	}
	public void move_Away_From_Image() 
	{
		//WebElement awayfromimage1 = driver.findElement(By.linkText("Go to Home"));
		WebElement awayfromimage1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
		Actions builder = new Actions(driver);
		builder.moveToElement(awayfromimage1).build().perform();
		boolean status1 =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5")).isDisplayed();
		boolean status2= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a")).isDisplayed();
		Assert.assertFalse(status1);
		Assert.assertFalse(status2);
		
	}
}
