package Keywords;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ExitIntent {

	WebDriver driver;

	@FindBy(linkText = "Exit Intent")
	private WebElement intent;

	public ExitIntent(WebDriver web) {
		this.driver = web;
	}
	

	public void initiaiseElements() {
		PageFactory.initElements(this.driver, this);
	}

	public void isDisplayed(){
		
		Boolean check = driver.findElement(By.xpath("//*[@id='content']/div[1]/h3")).getText().contains("Exit Intent") 
				&& driver.getCurrentUrl().equals("http://10.0.31.161:9292/exit_intent");
		
		Assert.assertTrue(check,"exit intent is not displayed");
		
	}
	
	public void move_mouse() throws InterruptedException, AWTException {
		initiaiseElements();
		intent.click();

		Thread.sleep(2000);
		isDisplayed();
	    Robot robot = new Robot();
	    Actions action = new Actions(driver);
		WebElement home = driver.findElement(By.linkText("Go to Home"));
		
		int xCoord = 500;
		robot.mouseMove(xCoord, 800);
		
		robot.mouseMove(xCoord, 100);
		
		
		Assert.assertEquals(driver.findElement(By.id("ouibounce-modal")).getCssValue("display"),"block","Check prompt is displayed or not");
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div.modal-title> h3")).getText(),"THIS IS A MODAL WINDOW","Check prompt is displayed or not");
		
	    robot.mouseMove(500, 500);
	    action.click().perform();
	    
		Assert.assertEquals(driver.findElement(By.id("ouibounce-modal")).getCssValue("display"),"none","Check prompt is displayed or not");
		
		
	}
	
}
