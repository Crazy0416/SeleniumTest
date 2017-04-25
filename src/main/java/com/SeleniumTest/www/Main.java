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
        //List<WebElement> post2  = driver.findElements(By.cssSelector("h2"));
        List<String> postsContents = new ArrayList<String>();
/*
        for(WebElement e : post2)
        {
            System.out.println(e.getCssValue("h2"));
            String tmp = e.getText();
            System.out.println("1 " + tmp);
        }
        */
        int i = 0;
        for(WebElement e : posts)
        {
            String tmp = e.getText();
            List<WebElement> post2 = e.findElements(By.cssSelector("h2"));
            for(WebElement k : post2)
            {
                System.out.println("h2 : " + i + k.getText());
            }
            postsContents.add(tmp);
            i++;
        }
        for(String e : postsContents)
        {
            System.out.println("Page title is : " + e);
        }
        //Close the browser
        driver.quit();

    }
}
