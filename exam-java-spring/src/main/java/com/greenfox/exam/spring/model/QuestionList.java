package com.greenfox.exam.spring.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-06-06.
 */
@Component
public class QuestionList {

  private Long id;
  private List<Question> questions;

  public void setQuestionList(Question question) {
    this.id = 1L;
    questions = new ArrayList<>();
    questions.add(question);
  }

  public QuestionList(Long id, List<Question> questions) {
    this.id = id;
    this.questions = questions;
  }

  public QuestionList() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }
}
