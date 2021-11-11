package DomaciTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import DomaciBase.ImdbBase;

public class ImdbTest extends ImdbBase {

	@BeforeMethod

	public void pageSetUp() {

		driver.manage().window().maximize();
		driver.navigate().to("https://www.imdb.com/");
	}

	@Test(priority = 10)

	public void ImdbPage() {

		imdbPage.clickSignInButton();

	}

	@Test(priority = 20)

	public void signIn() throws InterruptedException {

		signInPage.clickButton();
		signInPage.insertEmail("gamingOut@tutanota.com");
		signInPage.insertPassword("qazwsx123");
		signInPage.clickSignInButton();

	}

	@Test(priority = 30)
	public void searchMovie() {
		SearchPage.insertSearchBox("Malignant");

	}

	@Test(priority = 40)

	public void resultMovie() {

		ResultPage1.result();
	}

	@Test(priority = 50)

	public void movie1() {

		Movie1.clickAddButton();
		Movie1.clickAddButton();
	}

	@Test(priority = 60)

	public void searchPage2() {

		SearchPage2.insertSearchBox2("Solace");
	}

	@Test(priority = 70)

	public void resultPage2() {

		ResultPage2.result2();
	}

	@Test(priority = 80)

	public void addButton2() {
		Movie2.clickAddButton2();

	}

	@Test(priority = 90)
	public void watchlistResult() {
		Watchlist.getMaligant();
		Watchlist.getSolace();

	}

	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();

	}
}
