package com.greenfox.exam.spring.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-06-06.
 */
@Component
public class QuestionList {

  private List<Question> questions;

  public QuestionList(List<Question> questionList) {
    this.questions = questionList;
  }

  public QuestionList() {
  }

  public List<Question> getQuestionList() {
    return questions;
  }

  public void setQuestionList(Question question) {
    questions.add(question);
  }
}
