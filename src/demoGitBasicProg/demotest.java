package demoGitBasicProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class demotest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Manish/Downloads/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
