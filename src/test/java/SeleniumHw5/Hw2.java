package SeleniumHw5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
HW2:
goto https://chercher.tech/practice/frames

click on check box
then select bay cat from drop down
then enter text in text box
 */
public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame2");
        WebElement checkBox=driver.findElement(By.xpath("//select[@id='animals']"));
        checkBox.click();
        Select sel=new Select(checkBox);
        sel.selectByVisibleText("Baby Cat");
        Thread.sleep(1000);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");

      WebElement textBox=driver.findElement(By.xpath("//input"));
      textBox.click();
      textBox.sendKeys("Baby Cats");

    }
}
