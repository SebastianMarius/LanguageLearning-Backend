package com.languageLearning.LangLearning.Controller;

import com.languageLearning.LangLearning.Service.LearningAppService;
import com.languageLearning.LangLearning.data.Entity.Word;
import com.languageLearning.LangLearning.data.Repository.WordRepository;
import com.languageLearning.LangLearning.domain.KoWords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/words")
public class WordController {

    @Autowired
    private WordRepository wordRepository;

    @Autowired
    LearningAppService learningAppService;



/*
    @GetMapping
    public  Iterable <Word> getWords(){


       return  this.learningAppService.getSentencesByWord();

         return this.wordRepository.findAll();

  */


    /*

    //ULTIMU SAVE POINT DACA CRAPA CEVA


    @GetMapping
    @ResponseBody
    public KoWords getWords(){


        //  return this.learningAppService.getSentencesByWord("남자");
        System.out.println(learningAppService.getSentencesByWord("남자"));
         return this.learningAppService.getSentencesByWord("남자");

        //IF IT WORKS PLS DON T TOUCH IT
      }}
    */

    @GetMapping("/showSentences")
    @ResponseBody
    public KoWords getWords(@RequestParam String word){


        //  return this.learningAppService.getSentencesByWord("남자");
//        System.out.println(learningAppService.getSentencesByWord(word));
        return this.learningAppService.getSentencesByWord(word);

        //IF IT WORKS PLS DON T TOUCH IT
    }

    @GetMapping("/randomSentenceBeginner")
    @ResponseBody

    public KoWords getWordsBeginner(){



        return this.learningAppService.getBeginnerLevelRandomWords();


    }


}