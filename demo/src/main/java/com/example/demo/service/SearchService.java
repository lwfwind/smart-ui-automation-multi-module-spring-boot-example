package com.example.demo.service;

import com.example.demo.page.SearchPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
    @Autowired
    private SearchPage searchPage;

    public void search(String content) {
        searchPage.searchFor(content);
        searchPage.verifyResult();
    }
}
