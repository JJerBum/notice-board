package com.example.noticeboard.question;

import com.example.noticeboard.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    // 🤩 아니 자동으로 이렇게 쓰면 구현해준다고 미쳤냐
    Question findBySubject(String subject);
    Question findBySubjectAndContent(String subject, String content);
    List<Question> findBySubjectLike(String subject);
}