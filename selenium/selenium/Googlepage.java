package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.id("email")).sendKeys("jyo");
		driver.findElement(By.name("password")).sendKeys("jyo");
		driver.findElement(By.name("confirmPassword")).sendKeys("jyo");
		driver.findElement(By.name("register")).click();
		driver.findElement(By.linkText("Flights")).click();
		
	List<WebElement>data=driver.findElements(By.tagName("option"));
	
	System.out.println(data.size());
	for(int i=0;i<data.size();i++) {
		System.out.println(data.get(i).getText());
	}
	}


	}

}
