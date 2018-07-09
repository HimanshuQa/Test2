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

	public void move_mouse() throws InterruptedException, AWTException {
		initiaiseElements();
		intent.click();
		Thread.sleep(2000);

		WebElement home = driver.findElement(By.linkText("Go to Home"));
		
//		Actions action = new Actions(driver);
//		action.moveToElement(home).build().perform();
		try {
		    // These coordinates are screen coordinates
		    int xCoord = 500;
		    int yCoord =  100;

		    // Move the cursor
		    Robot robot = new Robot();
		    robot.mouseMove(xCoord, yCoord);
		} catch (AWTException e) {
		}
		
		Thread.sleep(2000);
		
		
	}
	
}
