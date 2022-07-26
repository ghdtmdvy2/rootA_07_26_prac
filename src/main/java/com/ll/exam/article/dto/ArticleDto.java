package com.ll.exam.article.dto;

public class ArticleDto {
    private String id;
    private String title;
    private String list;

    public ArticleDto(String id, String title, String list) {
        this.id = id;
        this.title = title;
        this.list = list;
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", list='" + list + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }
}
