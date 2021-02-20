package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JAVABasics {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

//		driver.get("https://www.aa.com/homePage.do");
		driver.navigate().to("https://www.aa.com/homePage.do");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement dep = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
		dep.click();
		dep.clear();
		dep.sendKeys("wash");
		Actions aa = new Actions(driver);
		
		
		
		List<WebElement> myList = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		System.out.println(myList.size());
		for (WebElement element : myList) {
			try {
				if (element.getText().trim().contains("WAS")) {
				// element.sendKeys(Keys.ENTER);
				System.out.println(element.getText());
				js.executeScript("arguments[0].click();", element);
				}
			} catch (StaleElementReferenceException e) {

			}

		}
		
		
	}
}
