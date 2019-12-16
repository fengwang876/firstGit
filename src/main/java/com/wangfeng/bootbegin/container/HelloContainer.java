package com.wangfeng.bootbegin.container;

import com.wangfeng.bootbegin.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloContainer {
    @RequestMapping("/hello")
    public Article hello(){

/*        Article article = new Article(1L, "Jeffery");

        article.setAuthor("NoJeffery");*/

        Article article1 = Article.builder()
                .id(3L)
                .author("莫言")
                .build();
        log.info("测试一下"+article1);
        return article1;
    }
}
