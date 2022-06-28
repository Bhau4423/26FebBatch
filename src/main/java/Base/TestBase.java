package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public void Initalization() {
		System.setProperty("webdriver.chrome.driver",	"chromedriver");
		 driver	=	new	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(25,	TimeUnit.SECONDS);
		//updating
	}

}
