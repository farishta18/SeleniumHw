package SeleniumHw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
HW2:
navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
enter the username "Tester"
enter the password "test"
get the title of the webPage and confirm that it is  "Web Orders Login"
------------------__------__**happy coding ***
 */
public class Hw2 {

    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver(); {
      driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
          driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
             String title=driver.getTitle();
               System.out.println(title);
               if (title.equals("Web Orders Login")){
                   System.out.println("The title is correct");
               }else{
                   System.out.println("The title is incorrect");
               }
        }
    }
}
