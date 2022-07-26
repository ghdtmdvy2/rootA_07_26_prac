<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.ll.exam.article.dto.ArticleDto" %>

<%
    List<ArticleDto> articleDtos = (List<ArticleDto>)request.getAttribute("articleDtos");
%>

<% for( ArticleDto articleDto : articleDtos){%>
    <%=(articleDto.getId()) %>
<%}
%>
