package com.example.android.miwok;

import java.util.ArrayList;

/**
 * Created by Shivam Namdev on 03-02-2017.
 */

public class Word extends ArrayList {
    private String englishWord;

    private String paraDescp;

    public Word(String cString, String pString)
    {
        englishWord = cString;
        paraDescp = pString;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getParaDescp() {
        return paraDescp;
    }

    public void setEnglishWord(String englishWord) { this.englishWord = englishWord;}

    public void setParaDescp(String paraDescp) { this.paraDescp = paraDescp;}

}
