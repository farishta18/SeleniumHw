package SeleniumHw3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) {
        WebDriver driver=  new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();

        WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");


        WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
       login.click();

    }

}
/*
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
 */