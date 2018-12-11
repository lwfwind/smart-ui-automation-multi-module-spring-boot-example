package com.example.demo.page;

import com.qa.framework.Inject.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Value;
import org.testng.Assert;

@Page
public class SearchPage {

    private WebDriver driver;
    @Value("${webPath}")
    private String url;
    @FindBy(id = "kw")
    private WebElement searchTestBox;

    public void searchFor(String text) {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        searchTestBox.sendKeys(text);
        searchTestBox.submit();
    }

    public void verifyResult() {
        Assert.assertTrue(driver.getTitle().contains("百度搜索"), driver.getTitle());
    }

}
