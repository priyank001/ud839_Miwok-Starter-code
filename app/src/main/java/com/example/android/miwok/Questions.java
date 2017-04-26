package com.example.android.miwok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Priyank on 16-04-2017.
 */

public class Questions extends ArrayList {
    private String question;
    private String option1, option2, option3;
    private String ans;
    public static int result=0;
    private int id =0;
    private static int i =0;

    public Questions(String qString, String oString1, String oString2, String oString3, String oAns)
    {
        i++;
        id = i;
        question = qString;
        option1 = oString1;
        option2 = oString2;
        option3 = oString3;
        ans = oAns;
    }

    public String getquestion() {
        return question;
    }

    public String getoption1() {
        return option1;
    }

    public String getoption2() {
        return option2;
    }
    public String getoption3() {
        return option3;
    }

    public int getId() { return id; }
/*
    public void setEnglishWord(String englishWord) { this.englishWord = englishWord;}

    public void setParaDescp(String paraDescp) { this.paraDescp = paraDescp;}

    public static <Word> List<Word> asList(Word array) {
        return new ArrayList<Word>((Collection<? extends Word>) array);
    } */
}
