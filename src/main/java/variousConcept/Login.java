package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		loginPath();
		posTestCase();
		tearDown();
		
		loginPath();
		negTestCase();
		tearDown();
		
	}	
	public static void loginPath()
	{
			
		//NOTE- Any type of path can be used in path .
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit\\Selenium\\hr\\NewDriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "NewDriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "NewDriver/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./NewDriver/chromedriver.exe");
		
		//If we are using setProperty it will give error .
	    driver = new ChromeDriver();
		
		//Clean Cookies
		driver.manage().deleteAllCookies();
		
		//To make driver folder to access the path
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		
		//For maximize a window
		driver.manage().window().maximize();
		
		//Apply Implicitly wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
		
	public static void posTestCase()
	{
		//Identify username and insert value in it
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		//Identify password and insert value in it
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		//identify signin button and click
		driver.findElement(By.name("login")).click();
		
	}	
	
	public static void negTestCase()
	{
		//Identify username and insert value in it
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		//Identify password and insert value in it
		driver.findElement(By.id("password")).sendKeys("abc123gdaj");
		
		//idebtify signin button and click
		driver.findElement(By.name("login")).click();
		
	}	
		
	public static void tearDown()
	{
		//CloseBrowser-----------
		//driver.close();

	}
}

