package mahzooz_assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.http.Cookie;

public class mahzooz_login {
	private static final long Durationofseconds = 0;
	WebDriver driver;
	String url = "https://www.mahzooz.ae/en/login";

	@BeforeTest
	public void tc() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(enabled = true, priority = 0)
	public void addCookie() throws InterruptedException {
		WebElement Cookie = driver.findElement(By.linkText("I Accept"));
		Cookie.click();
		driver.navigate().refresh();
		Thread.sleep(5000);
	}

	@Test(enabled = true, priority = 1)
	public void signin() throws InterruptedException {
		WebElement t = driver.findElement(By.linkText("Log In With Username"));
		t.click();
		WebElement r = driver.findElement(By.xpath("//input[@name='username']"));
		r.click();
		r.sendKeys("sureshVV99");
		Thread.sleep(2000);
		WebElement web = driver.findElement(By.xpath("//input[@name='passwd_name']"));
		web.click();
		web.sendKeys("Amrutha@99");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();", login);
		Thread.sleep(7000);
	}

//@Test(enabled = true,priority = 1)
	public void dropdown() throws InterruptedException {
		WebElement we = driver
				.findElement(By.xpath("//div[@class='selectize-input items full has-options has-items']"));
		we.click();
		WebElement wt = driver.findElement(By.xpath("//div[@data-value='91']"));
		wt.click();
		Thread.sleep(2000);
		WebElement et = driver.findElement(By.xpath("//input[@name='phone']"));
		et.click();
		et.sendKeys("8179628092");
		WebElement k = driver.findElement(By.xpath("//input[@name='passwd_phone']"));
		k.click();
		k.sendKeys("Amrutha@99");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();", login);
		Thread.sleep(5000);
	}
	@Test(enabled = true, priority = 2)

	public void buy() throws InterruptedException {
		driver.findElement(By.linkText("Buy Now")).click();
		driver.findElement(By.xpath("//div[@id='increase']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("b0n1")).click();
		driver.findElement(By.id("b0n8")).click();
		driver.findElement(By.id("b0n14")).click();
		driver.findElement(By.xpath("//div[@id='b0n9']")).click();
		driver.findElement(By.xpath("//div[@id='b0n15']")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement login = driver.findElement(By.xpath("//button[@id='button_next']"));
		j.executeScript("arguments[0].click();", login);
		Thread.sleep(5000);
	}

	@Test(enabled = true, priority = 3)
	public void second_ticket() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='b0n2']")).click();
		driver.findElement(By.xpath("//div[@id='b0n7']")).click();
		driver.findElement(By.xpath("//div[@id='b0n9']")).click();
		driver.findElement(By.xpath("//div[@id='b0n12']")).click();
		driver.findElement(By.xpath("//div[@id='b0n14']")).click();
		driver.findElement(By.xpath("//div[@id='b0n10']")).click();
		Thread.sleep(5000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement Addtocart = driver.findElement(By.xpath("//button[@id='button_next']"));
		je.executeScript("arguments[0].click();", Addtocart);	
		Thread.sleep(5000);
	}
@Test(enabled = true, priority = 4)
public void Add_to_cart() throws InterruptedException {
	driver.findElement(By.className("remodal-close")).click();
	Thread.sleep(5000);
}

@Test(enabled = true, priority = 5)
	public void logout() throws InterruptedException {
		WebElement t = driver.findElement(By.xpath("//a[@title='My Account']"));
		t.click();
		Thread.sleep(7000);
		WebElement y = driver.findElement(By.linkText("Sign Out"));
		y.click();
		Thread.sleep(5000);
}
}