package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.model.Question;
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

  public QuestionList getQuestionList() {
    return questionList;
  }

  public void setQuestionList(QuestionList questionList) {
    this.questionList = questionList;
  }

  public Question randomQuestion() {
    long random = (int)((Math.random() * 7) + 1);
    return questionRepository.findOne(random);
  }

}
