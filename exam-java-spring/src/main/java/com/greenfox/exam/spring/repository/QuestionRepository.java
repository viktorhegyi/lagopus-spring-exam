package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.model.Question;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Viktor on 2017-06-06.
 */
public interface QuestionRepository extends CrudRepository<Question, Long> {


}
