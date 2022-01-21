import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumAPI2 {

	public static void main(String[] args) {
		String myValue = "{\r\n"
				+ "  \"userId\": 1,\r\n"
				+ "  \"id\": 1,\r\n"
				+ "  \"title\": \"delectus aut autem\",\r\n"
				+ "  \"completed\": false\r\n"
				+ "}";

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jsonplaceholder.typicode.com/todos/1");
		Assert.assertEquals(driver.findElement(By.cssSelector("pre")).getText(), myValue);

	}

}