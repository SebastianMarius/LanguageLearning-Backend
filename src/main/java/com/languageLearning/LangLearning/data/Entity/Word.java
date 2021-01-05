package com.languageLearning.LangLearning.data.Entity;

import javax.persistence.*;

@Entity
@Table (name = "WORD")
public class Word {
    @Id
    @Column(name = "WORD_ID")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long wordID;
    @Column (name = "KO_WORD")
    private String koWord;
    @Column (name = "WORD_TRANSLATION")
    private String wordTranslation;
    @Column (name = "FIRST_SENTENCE")
    private String firstSentence;
    @Column (name = "SECOND_SENTENCE")
    private String secoundSentence;
    @Column (name = "THIRD_SENTENCE")
    private String thirdSentence;

//test git
    public String getKoWord() {
        return koWord;
    }

    public void setKoWord(String koWord) {
        this.koWord = koWord;
    }

    public String getSecoundSentence() {
        return secoundSentence;
    }

    public void setSecoundSentence(String secoundSentence) {
        this.secoundSentence = secoundSentence;
    }

    public long getWordID() {
        return wordID;
    }

    public void setWordID(long wordID) {
        this.wordID = wordID;
    }

    public String getWordTranslation() {
        return wordTranslation;
    }

    public void setWordTranslation(String wordTranslation) {
        this.wordTranslation = wordTranslation;
    }

    public String getFirstSentence() {
        return firstSentence;
    }

    public void setFirstSentence(String firstSentence) {
        this.firstSentence = firstSentence;
    }

    public String getSecondSentence() {
        return secoundSentence;
    }

    public void setSecondSentence(String secoundSentence) {
        this.secoundSentence = secoundSentence;
    }

    public String getThirdSentence() {
        return thirdSentence;
    }

    public void setThirdSentence(String thirdSentence) {
        this.thirdSentence = thirdSentence;
    }
}
