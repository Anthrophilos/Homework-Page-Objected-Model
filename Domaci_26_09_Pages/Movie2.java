package DomaciPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Movie2 {

	WebDriver driver;
	WebElement addButton2;
	
	
	public Movie2(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getAddButton2() {
		return driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[2]/div/div/button[1]/div"));
	}
	
	public void clickAddButton2() {
		this.getAddButton2().click();
	}
	
}
