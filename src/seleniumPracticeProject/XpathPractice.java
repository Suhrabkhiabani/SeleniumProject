package seleniumPracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
	
	
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("http://tek-school.com/retail/index.php?route=common/home");

	driver.findElement(By.xpath("//img[starts-with(@alt,'Canon EOS')]")).click();

//driver.manage().deleteAllCookies(); This will delete all the cookies including password and other saved pages

	

	//driver.findElement(By.id(null));

	//driver.close();
	//driver.quit();
	
}
}