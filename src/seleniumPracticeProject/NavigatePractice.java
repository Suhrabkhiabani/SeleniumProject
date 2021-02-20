package seleniumPracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(200);

		driver.navigate().forward();
		Thread.sleep(200);

//driver.manage().deleteAllCookies(); This will delete all the cookies including password and other saved pages

		String ActualPagaTitle = driver.getTitle();
		System.out.println("This is the Title of the Page: " + ActualPagaTitle);

		String curentPageURL = driver.getCurrentUrl();
		System.out.println("This is the current page URL" + curentPageURL);

		driver.navigate().to("https://drive.google.com/drive/folders/0AOUyv6XXFGNxUk9PVA");
		Thread.sleep(200);

		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(200);
		driver.navigate().back();

		// driver.navigate().refresh();
		// driver.findElement(By.id(null));

		// driver.close();
		// driver.quit();

	}

}
