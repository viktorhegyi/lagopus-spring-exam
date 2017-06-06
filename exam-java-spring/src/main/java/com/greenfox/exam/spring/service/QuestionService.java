package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.model.QuestionList;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-06-06.
 */
@Component
public class QuestionService {

  @Autowired
  QuestionRepository questionRepository;

  @Autowired
  QuestionList questionList;

  public QuestionList randomQuestions() {
    questionList.setQuestionList(questionRepository.findOne(1L));
    return questionList;
  }
}
