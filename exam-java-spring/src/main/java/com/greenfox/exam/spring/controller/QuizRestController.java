package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.QuestionList;
import com.greenfox.exam.spring.repository.QuestionRepository;
import com.greenfox.exam.spring.service.QuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Viktor on 2017-06-06.
 */
@RestController
public class QuizRestController {

  @Autowired
  QuestionService questionService;

  @GetMapping("/questions")
  public QuestionList getRandomQuestions() {
    return questionService.randomQuestions();
  }

}
