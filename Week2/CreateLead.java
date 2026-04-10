package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {
    public static void main(String[] args) {
        //To handle the browser Notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Guest");
        //Initilize the webdriver(ChromeDriver)
        ChromeDriver driver = new ChromeDriver(options);
        //Load the Url
        driver.get("https://leaftaps.com/opentaps/control/main");
        //Maximize the window
        driver.manage().window().maximize();
        //Enter the username
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //Enter the password
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        //Click on Login button
        driver.findElement(By.className("decorativeSubmit")).click();
        //Click on CRMSFA link
        driver.findElement(By.partialLinkText("CRM")).click();
        // Click on Leads button
        driver.findElement(By.linkText("Leads")).click();
        //Click on Create Lead Button
        driver.findElement(By.linkText("Create Lead")).click();
        //Enter the FirstName
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathi");
        //Enter the LastName
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("VenkataKrishnan");
        //Enter a Company Name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        //Enter the Title
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead1");
        //Click the create Lead button
        driver.findElement(By.className("smallSubmit")).click();
        System.out.println(driver.getTitle());
        driver.close();

    }

}







