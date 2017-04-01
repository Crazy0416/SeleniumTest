package com.SeleniumTest.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minmi on 2017-03-24.
 */
public class Main {
    public static void main(String args[])
    {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        driver =new FirefoxDriver();

        driver.get("https://playoverwatch.com/ko-kr/game/patch-notes/pc/");

        List<WebElement> posts  = driver.findElements(By.className("patch-notes-body"));
        List<String> postsContents = new ArrayList<String>();

        for(WebElement e : posts)
        {
            String tmp = e.getText();
            postsContents.add(tmp);
        }
        for(String e : postsContents)
        {
            System.out.println("Page title is : " + e);
        }
        //Close the browser
        driver.quit();

    }
}
