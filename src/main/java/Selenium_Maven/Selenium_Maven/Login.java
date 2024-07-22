package Selenium_Maven.Selenium_Maven;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\latha\\Softwares\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/");
		System.out.println("title"+driver.getTitle());
	}

}
