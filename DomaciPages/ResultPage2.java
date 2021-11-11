package DomaciPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage2 {

	
	WebDriver driver;
	WebElement result2;

	public ResultPage2(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getResult2() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[1]/td[2]/a"));
	}
	
	public void result2() {
		this.getResult2().click();
		
	}
	
}
