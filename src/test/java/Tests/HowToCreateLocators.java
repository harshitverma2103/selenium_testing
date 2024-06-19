package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToCreateLocators {
     public static void main(String[] args) {

          WebDriver driver = new ChromeDriver();

          driver.get("https://demo.opencart.com/");
          driver.manage().window().maximize();

          // name
          driver.findElement(By.name("search")).sendKeys("MacBook");
          // id
          boolean logoResult = driver.findElement(By.id("logo")).isDisplayed();
          if (logoResult == true) {
               System.out.println("pass");
          } else {
               System.out.println("fail");
          }

          // linktext & partialLinkText
          driver.findElement(By.linkText("Tablets")).click();
          driver.findElement(By.partialLinkText("Table")).click();

          // xpath with single attribute

          driver.findElement(By.xpath("//input[@placeholder='search']")).sendKeys("MacBook");

          // xpath for multiple attribute

          driver.findElement(By.xpath("//input[@name='search'][@placeholder='search']")).sendKeys("Tshirts");
          driver.quit();
     }
}
