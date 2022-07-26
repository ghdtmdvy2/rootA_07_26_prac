package com.ll.exam;

import com.ll.exam.Rq;
import com.ll.exam.article.ArticleController;
import com.ll.exam.member.MemberController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/url/*")
public class DispatchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Rq rq = new Rq(req,resp);
        MemberController memberController = new MemberController(rq);
        ArticleController articleController = new ArticleController(rq);
        String url = req.getRequestURI();
        switch (url){
            case "/url/article/list/free":
                articleController.showList(rq);
                break;
            case "/url/merber/login":
                memberController.showList(rq);
        }
    }
}
