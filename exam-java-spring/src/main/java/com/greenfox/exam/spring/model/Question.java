package com.greenfox.exam.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Viktor on 2017-06-06.
 */
@Entity
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String question;

  public Question(String question) {
    this.question = question;
  }

  public Question() {
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }
}
