package seleniumPracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeClass {


	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

//driver.manage().deleteAllCookies(); This will delete all the cookies including password and other saved pages

		String ActualPagaTitle = driver.getTitle();
		System.out.println("This is the URL of the website" + ActualPagaTitle);

		String curentPageURL = driver.getCurrentUrl();

		System.out.println("This is the current page URL" + curentPageURL);

		//driver.findElement(By.id(null));

		//driver.close();
		//driver.quit();

	}

}
