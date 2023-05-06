package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class age_calculator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	    driver.get("https://selenium-apps.doselect.in/age-calculator/");
	      driver.findElement(By.id("birth_date")).sendKeys("12-01-1998");
	      driver.findElement(By.id("calculate")).click();
	      driver.findElement(By.xpath("//input[@id=\"birth_date\"]")).sendKeys("26-02-2000");
	      driver.findElement(By.xpath("//div[@id=\"calculate\"]")).click();
	Thread.sleep(2000);
	}

}
