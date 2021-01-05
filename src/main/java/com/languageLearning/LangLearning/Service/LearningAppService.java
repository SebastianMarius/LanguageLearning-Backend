package com.languageLearning.LangLearning.Service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.languageLearning.LangLearning.data.Entity.Word;
import com.languageLearning.LangLearning.data.Repository.WordRepository;
import com.languageLearning.LangLearning.domain.KoWords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class LearningAppService {

        @Autowired
        private  WordRepository wordRepository;



        public KoWords getSentencesByWord(String wordParameter){



           Map <String, KoWords> koWordsMap = new HashMap();

            Iterable <Word> words = this.wordRepository.findAll();

            words.forEach(word1 ->{
                KoWords koWords = new KoWords();
                koWords.setKowordId(word1.getWordID());
                koWords.setKoword(word1.getKoWord());
                koWords.setKowordTranslation(word1.getWordTranslation());
                koWords.setKorfirstSentence(word1.getFirstSentence());
                koWords.setKosecondSentence(word1.getSecoundSentence());
                koWords.setKothirdSentence(word1.getThirdSentence());
                koWordsMap.put(word1.getKoWord(),koWords);




            } );

                   return koWordsMap.get(wordParameter);


        }




    public KoWords getBeginnerLevelRandomWords(){

            Iterable <Word> wordIterable = this.wordRepository.findAll();

            Map <Long, KoWords> integerKoWordsMap= new HashMap();

            wordIterable.forEach( wordul -> {

                    KoWords koWords = new KoWords();
                    koWords.setKowordId(wordul.getWordID());
                    koWords.setKoword(wordul.getKoWord());
                    koWords.setKowordTranslation(wordul.getWordTranslation());
                    koWords.setKorfirstSentence(wordul.getFirstSentence());
                    koWords.setKosecondSentence(wordul.getSecoundSentence());
                    koWords.setKothirdSentence(wordul.getThirdSentence());
                    integerKoWordsMap.put(wordul.getWordID(), koWords);

            } );

                        Random random = new Random();
                      int randomId = random.nextInt(2);
                      randomId++;

                      long randomIdLong= (long) randomId;





                    return integerKoWordsMap.get(randomIdLong);


        }


    }




