package com.greenfox.exam.spring.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-06-06.
 */
@Component
public class AnswerList {

  private int id;
  private List<Answer> answers;

  public AnswerList() {
    this.id = 1;
    this.answers = new ArrayList<>();
  }

  public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }

  public String answerFromList(int place) {
    Answer answer = answers.get(place);
    String answerForQuestion = answer.getAnswer();
    return answerForQuestion;
  }
}
