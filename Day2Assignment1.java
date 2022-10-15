package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2Assignment1 {
	
	public static void main(String[] args){
	WebDriverManager.chromedriver().setup();	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement createnew=driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));    
    createnew.click();
    WebElement firstName = driver.findElement(By.name("firstname"));    
    firstName.sendKeys("Tamileniyan");
    WebElement lastName = driver.findElement(By.name("lastname"));    
    lastName.sendKeys("Shanmugam");
    WebElement mobileNumber=driver.findElement(By.xpath("//input[@name='reg_email__']"));
    mobileNumber.sendKeys("9884889718");
    WebElement createPassword=driver.findElement(By.xpath("//input[@id='password_step_input']"));
    createPassword.sendKeys("Tamil@123");
    WebElement day = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
    Select dateSelect = new Select(day);
    dateSelect.selectByVisibleText("8");
    WebElement month = driver.findElement(By.xpath("//select[@title = 'Month']"));
    Select monthSelect = new Select(month);
    monthSelect.selectByVisibleText("Nov");
    WebElement year=driver.findElement(By.xpath("//select[@name = 'birthday_year']"));    
    Select yearSelect=new Select(year);
    yearSelect.selectByVisibleText("1988");
    WebElement gender=driver.findElement(By.xpath("//input[@name = 'sex'][1]"));   
    gender.click();
    }	

}
