package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.model.AnswerList;
import com.greenfox.exam.spring.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Viktor on 2017-06-06.
 */
public class AnswerService {

  @Autowired
  AnswerRepository answerRepository;

  @Autowired
  AnswerList answerList;

}
