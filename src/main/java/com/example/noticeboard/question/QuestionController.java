package com.example.noticeboard.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionController {
    // Get Mapping으로 인해 다른 클래스에서 참조 해야 함으로 public 이다.
    @GetMapping("/question/list")
    public String list() {
        return "question_list";
    }
}
