package SeleniumHw;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
Note: use name or id as locators


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Jack");
        driver.findElement(By.id("customer.lastName")).sendKeys("Jakson");
        driver.findElement(By.id("customer.address.street")).sendKeys("132, My Street, Kingston, New York 12401");
        driver.findElement(By.name("customer.address.city")).sendKeys("Kingston");
        driver.findElement(By.name("customer.address.state")).sendKeys("New York");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12401");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("432-354-7689");
        driver.findElement(By.id("customer.ssn")).sendKeys("051-02-1312");
        driver.findElement(By.name("customer.username")).sendKeys("JackJaks");
        driver.findElement(By.name("customer.password")).sendKeys("Pass@12");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Pass@12");
        Thread.sleep(2000);
        driver.quit();

    }
}*/
/*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
Note: use name or id as locators
*/
/*
    public static void main(String[] args) {
//        instance
        WebDriver driver = new ChromeDriver();
//        facebook.com
        driver.get("https://www.facebook.com/");
//        maximize the windows
        driver.manage().window().maximize();

//        send some text in the email
//        find the element                .  send some text
        driver.findElement(By.id("email")).sendKeys("moazam@gmail.com");

//          send some text to the password field
        driver.findElement(By.name("pass")).sendKeys("abracadbara");


//         print the url on console
        String url = driver.getCurrentUrl();
        System.out.println(url);

//        print the title on the console
        String title = driver.getTitle();
        System.out.println(title);
//        confirm that the title is "Facebook – log in or sign up"
        if (title.equals("Facebook – log in or sign up")) {
            System.out.println("the title is correct");
        } else {
            System.out.println("the title is incorrect");
        }
//        close
        driver.quit();

    }
}
 */