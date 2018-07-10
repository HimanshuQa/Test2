package Keywords;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//import com.qait.automation.Tatocautomation.Errorpage;
//import com.qait.automation.Tatocautomation.FrameDungeon;

public class Basicauth {

	//
	// Errorpage error;
	// FrameDungeon frame;
	WebDriver web;

	@FindBy(linkText = "Basic Auth")
	private WebElement basicauth;

	public Basicauth(WebDriver web) {
		this.web = web;
	}

	public void initiaiseElements() {
		PageFactory.initElements(this.web, this);
	}

	public void click_on_redbox() throws InterruptedException, AWTException {
		initiaiseElements();
		Robot robo = new Robot();
		basicauth.click();	
		robo.mouseMove(500, 200);;

		roboEvent(robo);
	}
	
	
	public void roboEvent(Robot robo){

		System.out.println("sadasdasdasddadadmidmin");
		robo.mousePress(InputEvent.BUTTON1_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_MASK);
		
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_D);		
		robo.keyRelease(KeyEvent.VK_D);
		robo.keyPress(KeyEvent.VK_M);
		robo.keyRelease(KeyEvent.VK_M);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyRelease(KeyEvent.VK_N);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_D);
		robo.keyRelease(KeyEvent.VK_D);
		robo.keyPress(KeyEvent.VK_M);
		robo.keyRelease(KeyEvent.VK_M);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyRelease(KeyEvent.VK_N);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}
	//
	// public void click_on_greenbox() {
	// openPage();
	//
	// Assert.assertTrue(green_box.isDisplayed(), "greenbox not displayed");
	// green_box.click();
	// frame = new FrameDungeon(this.web);
	// Assert.assertTrue(frame.isDisplayed());
	// }
}
