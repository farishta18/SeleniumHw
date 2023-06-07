package SeleniumHw6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*HW1:
goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
click on start
print the text  "welcome syntax technologies "on console */
public class Hw1 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));

        WebElement Btn= driver.findElement(By.xpath("//button[@id='startButton']"));
        Btn.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement text=driver.findElement(By.xpath("//h4[contains(text (),'Welcome Syntax Technologies')]"));
        wait.until(ExpectedConditions.visibilityOf(text));
        System.out.println(text.getText());
    }
}
/*
 String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));

        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();

        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        sendText("abracadabra",firstName);
    }
}
 */