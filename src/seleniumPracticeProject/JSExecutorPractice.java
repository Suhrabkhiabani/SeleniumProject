package seleniumPracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/index.php?route=product/product&product_id=42");
		WebElement element = driver.findElement(By.xpath(
				"//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/label[1]/input[1]"));
		element.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("alert('This First Time I am working with Alert')");
		// //Opening Alert through JavaScriptExecutor
		// js.executeScript("arguments[0].value='abcgmail.com'", element); // send keys
		// through javascriptExecutor
		driver.findElement(By.xpath("(//input[@name='option[223][]'])[1]")).click();
		//driver.findElement(By.xpath("(//input[@name='option[223][]'])[3]")).click();
		WebElement ceckBTN = driver.findElement(By.xpath("(//input[@name='option[223][]'])[3]"));
		js.executeScript("arguments[0].click()", ceckBTN);
		
		
		
		

	}

}
