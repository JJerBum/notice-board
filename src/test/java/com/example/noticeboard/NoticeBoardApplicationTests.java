package com.example.noticeboard;

import com.example.noticeboard.question.Question;
import com.example.noticeboard.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class NoticeBoardApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		Question q1 = new Question();
		q1.setSubject("sbb가 무엇인가요?");
		q1.setContent("sbb에 대해서 알고 싶습니다.");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);

		Question q2 = new Question();
		q1.setSubject("스프링부트 모델 질문입니다.");
		q1.setContent("id는 자동으로 생성되나요?");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
	}
}


