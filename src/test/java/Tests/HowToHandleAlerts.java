package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Alert;

public class HowToHandleAlerts {
     public static void main(String[] args) throws InterruptedException {
          ChromeOptions options = new ChromeOptions();
          WebDriver driver = new ChromeDriver(options);
          driver.manage().window().maximize();

          driver.get("https://the-internet.herokuapp.com/javascript_alerts");

          // handle normal alert
          driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
          Thread.sleep(5000);
          Alert myAlert = driver.switchTo().alert();
          System.out.println(myAlert.getText());
          myAlert.accept();

          // handle conformation alert
          driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
          Thread.sleep(5000);
          driver.switchTo().alert().dismiss();

          //prompt alert - input box
          driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
          Alert myObj = driver.switchTo().alert();
          myObj.sendKeys("hello");
          myObj.accept();

          // Close the browser
          driver.quit();
     }
}
