package SeleniumHw7;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
/*
@here HW:
goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
login
click on PIM


from the table choose any ID
and print out the row number of that id

please make sure that ur code is dynamic enough to cater if another row gets delted , it still prints the row correctly
    print the row number of the row that has the id 56247A
        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

//        look for 56247A
        for(int i=0;i<allIDs.size();i++){
            String id = allIDs.get(i).getText();
            if(id.equals("56258A")){
                System.out.println("the id is on row number "+(i+1));
//                WebElement row = driver.findElement(By.xpath(" //table/tbody/tr[" + (i + 1) + "]"));
//                System.out.println(row.getText());

            }

 */

public class Hw1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();
        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

        List<WebElement> ides = driver.findElements(By.xpath("//table/tbody/tr[8]/td[2]"));

        for (int i = 0; i<ides.size(); i++) {
            String id = ides.get(i).getText();
            if (id.equals("56440A")){
                System.out.println("the id is on row number "+(i+1));

            }

        }
    }
}