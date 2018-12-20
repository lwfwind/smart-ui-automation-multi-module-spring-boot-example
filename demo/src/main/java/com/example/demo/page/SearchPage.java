package com.example.demo.page;

import com.ui.automation.framework.Inject.annotation.Page;
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
    @FindBy(id = "su")
    private WebElement searchBtn;

    public void searchFor(String text) {
        driver.get(url);
        searchTestBox.sendKeys(text);
        searchBtn.click();
    }

    public void verifyResult() {
        Assert.assertTrue(driver.getTitle().contains("百度搜索"), driver.getTitle());
    }

}
