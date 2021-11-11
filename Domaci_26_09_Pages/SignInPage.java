package DomaciPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

	WebDriver driver;
	WebElement button;
	WebElement email;
	WebElement password;
	WebElement signInButton;
	WebDriverWait wdwait;

	public SignInPage(WebDriver driver, WebDriverWait wdwait2) {
		super();

		this.driver = driver;

	}

	public WebElement getButton() {

		return driver.findElement(By.cssSelector(".auth-sprite.imdb-logo.retina"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("ap_email"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("ap_password"));
	}

	public WebElement getSignInButton() {
		return driver.findElement(By.id("signInSubmit"));
	}

	public void clickButton() {
		this.getButton().click();

	}

	public void insertEmail(String text) {
		this.getEmail().clear();
		this.getEmail().sendKeys(text);

	}

	public void insertPassword(String text) {
		this.getPassword().clear();
		this.getPassword().sendKeys(text);
	}

	public void clickSignInButton() {
		this.getSignInButton().click();

	}

}
