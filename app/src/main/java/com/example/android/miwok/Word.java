package com.example.android.miwok;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;

/**
 * Created by Shivam Namdev on 03-02-2017.
 */

public class Word extends ArrayList {
    private String englishWord;
    private String paraDescp;
    private int id =0;
    private static int i =0;

    public Word(String cString, String pString)
    {
        i++;
        id = i;
        englishWord = cString;
        paraDescp = pString;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getParaDescp() {
        return paraDescp;
    }

    public int getId() { return id; }

    public void setEnglishWord(String englishWord) { this.englishWord = englishWord;}

    public void setParaDescp(String paraDescp) { this.paraDescp = paraDescp;}

    public static <Word> List<Word> asList(Word array) {
        return new ArrayList<Word>((Collection<? extends Word>) array);
    }


}
