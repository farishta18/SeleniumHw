package SeleniumHw3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.sendKeys("Farishta");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("Shinwari");

        WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("Shnwar19@gmail.com");

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys("7039990648");

        WebElement address = driver.findElement(By.cssSelector("input[placeholder='Address']"));
        address.sendKeys("Mrs Smith 813 Howard Street Oswego NY 13126");

        WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("Oswego");

        WebElement state = driver.findElement(By.cssSelector("select[name='state']"));
        Select sel = new Select(state);
        boolean mul = sel.isMultiple();
        sel.selectByVisibleText("New York");

        WebElement zipCode = driver.findElement(By.xpath("//input[contains(@name,'zip')]"));
        zipCode.sendKeys("13126");

        WebElement webSite = driver.findElement(By.xpath("//input[@name='website']"));
        webSite.sendKeys("https://www.facebook.com");
        Thread.sleep(2000);

        WebElement host = driver.findElement(By.cssSelector("input[value='yes']"));
        host.click();

        Thread.sleep(2000);

        WebElement comment = driver.findElement(By.cssSelector("textarea[name='comment']"));
        comment.sendKeys("practicing");

        WebElement send = driver.findElement(By.xpath("//button[text()='Send ']"));
        send.click();

        Thread.sleep(1000);
        driver.close();

    }
}


