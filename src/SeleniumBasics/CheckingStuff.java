package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckingStuff {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/alerts");
//		driver.get("http://tek-school.com/retail/");
		
	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 15);
//		js.executeScript("prompt('testing is fun')");
		driver.findElement(By.xpath("//*[@id='promtButton']")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("test");
		Thread.sleep(3000);
		a.accept();
		

		driver.close();
	}
	
}
