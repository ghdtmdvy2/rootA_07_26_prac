package com.ll.exam.article;

import com.ll.exam.Rq;
import com.ll.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    Rq rq;

    public ArticleController(Rq rq){
        this.rq = rq;
    }
    public void showList(Rq rq){
        List<ArticleDto> articleDtos = new ArrayList<>();
        articleDtos.add(new ArticleDto("3","내용3","리스트3"));
        articleDtos.add(new ArticleDto("2","내용2","리스트2"));
        articleDtos.add(new ArticleDto("1","내용1","리스트1"));
        rq.setAttr("articleDtos",articleDtos);
        rq.view("/url/article/list/free");
    }
}
