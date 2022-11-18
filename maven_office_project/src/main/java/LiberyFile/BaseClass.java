package LiberyFile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class BaseClass {

	static WebDriver driver;

	public static WebDriver Launchbrowserall(String url) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo03052022\\OneDrive\\Documents\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	return driver;
	
	}
	
	
	public static WebDriver firefox(String url) throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo03052022\\OneDrive\\Documents\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		    driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			return driver;
			
			}
	 public static void TakesScreenShot() throws IOException {
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String str = RandomString.make(5);
			File destination=new File("C:\\Users\\lenovo03052022\\OneDrive\\Desktop\\eclispe screen shot test case\\result_"+str+".png");
			FileHandler.copy(source, destination);
	}
	 public static WebDriver IEBrowser(String url) throws InterruptedException {
			
			System.setProperty("webdriver.ie.driver","C:\\Users\\lenovo03052022\\OneDrive\\Documents\\IEDriverServer_Win32_4.3.0\\IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			return driver;
			
			}
	 
	  
	 public static void WaitOne() {
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		}
	 
		
}
