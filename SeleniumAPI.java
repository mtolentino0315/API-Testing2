import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumAPI {

	public static void main(String[] args) {
		
		String myValue = "{}";

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jsonplaceholder.typicode.com/posts/comments?postId=1");
		Assert.assertEquals(driver.findElement(By.cssSelector("pre")).getText(), myValue);

	}

}
