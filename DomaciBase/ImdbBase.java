package DomaciBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import DomaciPages.ImdbPage;
import DomaciPages.Movie1;
import DomaciPages.Movie2;
import DomaciPages.ResultPage1;
import DomaciPages.ResultPage2;
import DomaciPages.SearchPage;
import DomaciPages.SearchPage2;
import DomaciPages.SignInPage;
import DomaciPages.Watchlist;

public class ImdbBase {

	public WebDriver driver;
	public WebDriverWait wdwait;
	public ImdbPage imdbPage;
	public SignInPage signInPage;
	public SearchPage SearchPage;
	public ResultPage1 ResultPage1;
	public Movie1 Movie1;
	public SearchPage2 SearchPage2;
	public ResultPage2 ResultPage2;
	public Movie2 Movie2;
	public Watchlist Watchlist;

	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
		wdwait = new WebDriverWait(driver,	10);
		imdbPage = new ImdbPage(driver, wdwait);
		signInPage = new SignInPage(driver, wdwait);
		SearchPage = new SearchPage(driver);
		ResultPage1 = new ResultPage1(driver);
		Movie1 = new Movie1(driver);
		SearchPage2 = new SearchPage2(driver);
		ResultPage2 = new ResultPage2(driver);
		Movie2 = new Movie2(driver);
		Watchlist = new Watchlist(driver);
	}

	@AfterClass
	public void tearDown() {
		// driver.close();
		// driver.quit();

	}

}
