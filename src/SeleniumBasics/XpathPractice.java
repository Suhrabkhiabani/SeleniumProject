package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathPractice {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

//		driver.get("https://www.aa.com/homePage.do");
		driver.get("https://tekschool.us/");
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Join Now')]"))).build().perform();
		a.contextClick(driver.findElement(By.xpath("//*[@type='email']"))).build().perform();
		
//		WebElement homeBtn = driver.findElement(By.xpath("//a[contains(@title, 'om')]"));
//		WebElement aboutBtn = driver.findElement(By.xpath("//a[contains(@title, 'Ab')]"));
//
//		List<WebElement> btns = driver.findElements(By.xpath("//a[contains(@class, 'btn')]"));
//		
//		System.out.println(btns.size());
//		for (WebElement e : btns) {
//			System.out.println(e.getText());
//		}
		
//		WebElement contactBtn = driver.findElement(By.cssSelector("li#menu-item-331>a"));
//		List<WebElement> featureList = driver.findElements(By.cssSelector("ul.features-list>li>span"));
//		
//		for (int i = 0; i < featureList.size(); i++) {
//			if(featureList.get(i).getText().trim().toLowerCase().contains(("integration"))){
//				featureList.get(i).click();
//			}
//			
//		}
		
	}
}
