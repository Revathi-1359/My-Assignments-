package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ByIdOrName;

public class LaunchBrowser {

    public static void main(String[] args) {
        //To handle the browser Notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options);
        // Load the URL
        driver.get("https://leaftaps.com/opentaps/control/main");
        //Maximize the screen
        driver.manage().window().maximize();
        //get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getTitle());
        //Enter the username and use sendkeys() for passing any input text
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //Enter the Password
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        //Click Login Button
        driver.findElement(By.className("decorativeSubmit")).click();
        //click crmsfa
        driver.findElement(By.partialLinkText("CRM")).click();
        //Click on Accounts Tab
        driver.findElement(By.linkText("Accounts")).click();
        //Click on Create Account Button
        driver.findElement(By.linkText("Create Account")).click();
        //Enter an Account name
        driver.findElement(By.id("accountName")).sendKeys("Revathi V");
        //Enter Description
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        //Enter No of Employees
        driver.findElement(By.name("numberEmployees")).sendKeys("20");
        //Enter a Site name
        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
        // Click the create account button
        driver.findElement(By.className("smallSubmit")).click();
        driver.close();

    }

}




