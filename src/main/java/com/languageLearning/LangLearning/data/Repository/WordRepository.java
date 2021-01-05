package com.languageLearning.LangLearning.data.Repository;

import com.languageLearning.LangLearning.data.Entity.Word;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends CrudRepository <Word, Long> {

}
