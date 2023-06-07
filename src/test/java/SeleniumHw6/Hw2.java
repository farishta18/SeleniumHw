package SeleniumHw6;


import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;

/*@here
goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
click on get new user
print the firstname of user*/
public class Hw2 extends CommonMethods {
    public static void main(String[] args) {

       String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
       String browser="chrome";
       openBrowserAndLaunchApplication(url, browser);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement newUser=driver.findElement(By.xpath("//button[contains(text(),'Get New User')]"));
        newUser.click();


        WebElement firstName=driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(firstName.getText());



    }
}
