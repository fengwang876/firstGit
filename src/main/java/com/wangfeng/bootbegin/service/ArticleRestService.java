package com.wangfeng.bootbegin.service;

import com.wangfeng.bootbegin.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ArticleRestService {

    public String saveArticle(Article artilce){
        log.info("saveArticle:{}",artilce);
        return "测试";
    }
}
