package end_user;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Tag_Name {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\web driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		String mm = driver.getTitle();
		System.out.println(mm);

		List<WebElement> myOptionName = driver.findElements(By.tagName("option"));

		for (int i = 1; i < myOptionName.size(); i++) {

			System.out.println(myOptionName.get(i).getText());

		}

	}

}
