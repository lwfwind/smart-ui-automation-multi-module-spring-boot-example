package com.example.demo.testcase;

import com.example.demo.datamodel.TestCaseData;
import com.example.demo.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class SearchWithServiceTest extends BaseTestCase {
    @Autowired
    private SearchService searchService;

    @Test(dataProviderClass = TestCaseData.class, dataProvider = "searchData", description = "搜索测试")
    public void pageFactoryTest(String content) {
        searchService.search(content);
    }

    @Test(dataProviderClass = TestCaseData.class, dataProvider = "searchData", description = "搜索测试")
    public void pageFactoryTest2(String content) {
        searchService.search(content);
    }
}
