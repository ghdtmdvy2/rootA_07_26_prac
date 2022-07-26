package com.ll.exam.member;

import com.ll.exam.Rq;

public class MemberController {
    Rq rq;
    public MemberController(Rq rq){
        this.rq = rq;
    }
    public void showList(){
        rq.appendBody("member");
    }

    public void showList(Rq rq) {
    }
}
