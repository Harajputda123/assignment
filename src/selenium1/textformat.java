package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class textformat {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	    driver.get("https://selenium-apps.doselect.in/change-text/");
	      
	    driver.findElement(By.id("bigger")).click();
	       driver.findElement(By.id("smaller")).click();
	       driver.findElement(By.id("reset")).click();
	       driver.findElement(By.xpath("//a[@id=\"bigger\"]")).click();
	       driver.findElement(By.xpath("//a[@id=\"smaller\"]")).click();
	       driver.findElement(By.xpath("//a[@id=\"reset\"]")).click();
	   Thread.sleep(1000);
	}

}
