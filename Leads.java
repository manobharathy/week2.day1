package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leads {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("My company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manobharathy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Eganathan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kavi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Technical");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("For learning selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bharathy1011@gmail.com");
		WebElement drop = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown = new Select(drop);
	    dropdown.selectByVisibleText("Central African Republic");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("Page title : "+ title );
		driver.close();
	}

}
