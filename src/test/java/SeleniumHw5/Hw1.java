package SeleniumHw5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
        /*
        http://practice.syntaxtechs.net/javascript-alert-box-demo.php
    click on the last alert
    send keys and accept it

    Note: dont worry if the text u send doesnt appears up in the textbox
         */
        public static void main(String[] args) throws InterruptedException {

            WebDriver driver=new ChromeDriver();
            driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
            driver.manage().window().maximize();

            WebElement Btn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
            Btn.click();
            Thread.sleep(1000);
            Btn.sendKeys("Farishta");




        }
    }


