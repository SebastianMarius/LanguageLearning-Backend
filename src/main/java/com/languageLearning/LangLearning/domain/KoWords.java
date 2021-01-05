package com.languageLearning.LangLearning.domain;


import com.languageLearning.LangLearning.data.Entity.Word;

public class KoWords  {

    private long kowordId;
    private String koword;
    private String kowordTranslation;
    private String korfirstSentence;
    private String kosecondSentence;
    private String kothirdSentence;


    public long getKowordId() {
        return kowordId;
    }

    public void setKowordId(long kowordId) {
        this.kowordId = kowordId;
    }

    public String getKoword() {
        return koword;
    }

    public void setKoword(String koword) {
        this.koword = koword;
    }

    public String getKowordTranslation() {
        return kowordTranslation;
    }

    public void setKowordTranslation(String kowordTranslation) {
        this.kowordTranslation = kowordTranslation;
    }

    public String getKorfirstSentence() {
        return korfirstSentence;
    }

    public void setKorfirstSentence(String korfirstSentence) {
        this.korfirstSentence = korfirstSentence;
    }

    public String getKosecondSentence() {
        return kosecondSentence;
    }

    public void setKosecondSentence(String kosecondSentence) {
        this.kosecondSentence = kosecondSentence;
    }

    public String getKothirdSentence() {
        return kothirdSentence;
    }

    public void setKothirdSentence(String kothirdSentence) {
        this.kothirdSentence = kothirdSentence;
    }
}
