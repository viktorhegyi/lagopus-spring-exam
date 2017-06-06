package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.model.Answer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Viktor on 2017-06-06.
 */
public interface AnswerRepository extends CrudRepository<Answer, Long> {

}
