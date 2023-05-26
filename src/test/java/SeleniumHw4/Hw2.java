package SeleniumHw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
hw2:
goto facebook.com
 click on create account
and select the your  date of birth using select class
*/
public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        WebElement createAccount = driver.findElement(By.xpath("//a[@rel='async']"));
        createAccount.click();
        Thread.sleep(2000);

        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        day.click();
        Select sel1 = new Select(day);
        sel1.selectByVisibleText("5");
        Thread.sleep(1000);

        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        month.click();
        Select sel2 = new Select(month);
        sel2.selectByVisibleText("Apr");
        Thread.sleep(1000);

        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        year.click();
        Select sel3 = new Select(year);
        sel3.selectByVisibleText("2004");
        driver.quit();
    }
}