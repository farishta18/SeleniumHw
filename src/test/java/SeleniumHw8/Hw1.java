package SeleniumHw8;
import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
/*
hw:
goto syntax hrms
login
click on recruitment
select a date on the calanader
 */
public class Hw1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        WebElement recruitment= driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitment.click();

        WebElement calanader= driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
        calanader.click();


        WebElement calenderMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        selectFromDropdown(calenderMonth, "Apr");


        WebElement date = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        selectFromDropdown(date, "2010");

        List<WebElement> Day = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

            for (WebElement element : Day) {
                if (element.getText().equals("4")){
                    element.click();
                    break;
                }
        }

    }

}

