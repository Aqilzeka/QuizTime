package com.aqil.quiztime;

public class QuestionLibrary {

    private String mQuestion[] = {
            "Hansi bitki meyvedir?",
            "Agac _____ uste biter",
            "6 + 4 * 2 = ?",
            "100000 / 2 = ?"
    };


    private String mChoice[][]={
            {"banan", "ciyelek", "lale" , "agac"},
            {"budaq", "kok", "torpaq", "yarpaq"},
            {"17", "21", "20", "14"},
            {"8000", "50000", "500000", "5000"}
    };

    private String mCorrectAnswer[]= {"banan","kok","14","50000"};



    public String  getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0
    }
}
