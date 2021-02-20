package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownComboExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		selectOptionFromDropDown("choice 3", driver);
	}

	
	
	
	public static void selectOptionFromDropDown(String option, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement e = driver.findElement(By.xpath("//*[@id='comboTree848762ArrowBtn']//span"));
		
		
		js.executeScript("arguments[0].click();", e);
		driver.findElement(By.xpath(
				"//*[@id='comboTree848762DropDownContainer']//ul//li//span[contains(text(),'" + option + "')]//input"))
				.click();

	}

}
