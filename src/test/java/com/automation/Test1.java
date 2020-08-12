package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        driver.get("http://google.com");
        driver.get("http://ebay.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.close();

    }
}
