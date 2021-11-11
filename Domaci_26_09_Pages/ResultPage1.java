package DomaciPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage1 {


	WebDriver driver;
	WebElement result;
	
	public ResultPage1(WebDriver driver) {
		super();
		
		this.driver = driver;
	
	}
	
	public WebElement getResult() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[1]/td[2]/a"));
	}

	public void result() {
		this.getResult().click();
		
	}

}
