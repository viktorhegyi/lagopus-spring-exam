package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.model.AnswerList;
import com.greenfox.exam.spring.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-06-06.
 */
@Component
public class AnswerService {

  @Autowired
  AnswerRepository answerRepository;

  @Autowired
  AnswerList answerList;

  public AnswerList getAnswerList() {
    return answerList;
  }

  public void setAnswerList(AnswerList answerList) {
    this.answerList = answerList;
  }

}
