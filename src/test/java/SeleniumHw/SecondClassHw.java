package SeleniumHw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

/*
HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account
 */
public class SecondClassHw {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       WebElement element= driver.findElement(By.xpath("//a[text()='Create new account']"));
        Thread.sleep(2000);
        element.click();

        WebElement firstName=driver.findElement(By.xpath("//input[ @name = 'firstname']"));
        firstName.sendKeys("Farishta");

        WebElement lastName = driver.findElement(By.xpath("//input[@name = 'lastname']"));
        lastName.sendKeys("Shinwari");

        WebElement contactNumber = driver.findElement(By.xpath("//input[contains(@name,'reg')]"));
        contactNumber.sendKeys("7033553775");

        WebElement password = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
        password.sendKeys("Continue$987");

        WebElement Birthmonth = driver.findElement(By.xpath("//select[@id = 'month']"));
        Birthmonth.sendKeys("April");
        WebElement day = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
        day.sendKeys("04");

        WebElement year = driver.findElement(By.xpath("//select[@name = 'birthday_year']"));
        year.sendKeys("2003");

        WebElement genderOfThePerson = driver.findElement(By.xpath("//label[text() = 'Female']"));
        genderOfThePerson.click();

        WebElement signUp = driver.findElement(By.xpath("//button[text() = 'Sign Up']"));
        signUp.click();

    //    WebElement close = driver.findElement(By.xpath("//img[@src= 'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']"));
        Thread.sleep(2000);
     //   close.click();

        driver.quit();

    }

}
