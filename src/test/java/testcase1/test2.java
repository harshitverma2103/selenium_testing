package testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
     public static void main(String[] args) {

          WebDriver driver = new ChromeDriver();

          driver.get("https://demo.opencart.com/");
          driver.manage().window().maximize();

          // name
          // driver.findElement(By.name("search")).sendKeys("MacBook");
          // id
          boolean logoResult = driver.findElement(By.id("logo")).isDisplayed();
          if (logoResult == true) {
               System.out.println("pass");
          } else {
               System.out.println("fail");
          }
          driver.quit();
     }
}
