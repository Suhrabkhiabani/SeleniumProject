package SeleniumBasics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiBrowserTestingExample {

	public static void main(String[] args) throws InterruptedException {

		String driver_to_Use = "ff";
		
		WebDriver driver;
		
		if(driver_to_Use.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		} else if (driver_to_Use.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		} else if (driver_to_Use.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://tek-school.com/retail/");

		driver.findElement(By.linkText("Canon EOS 5D")).click();
		
		Select dd = new Select(driver.findElement(By.id("input-option226")));
		dd.selectByValue("15");

		WebElement quantitTXT = driver.findElement(By.id("input-quantity"));
		
		quantitTXT.clear();
		quantitTXT.sendKeys("8");
		
		driver.findElement(By.id("button-cart")).click();

	}

}
