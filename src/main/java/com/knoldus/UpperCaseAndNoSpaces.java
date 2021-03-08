package com.knoldus;

import java.util.function.Function;

public class UpperCaseAndNoSpaces {

    public int countWords(String string){
        if(string==null || string.isEmpty())
            return 0;
        String[] words=string.split("\\s+");
        return words.length;
        }


   public String removeSpaces(String string){
       if(countWords(string)==7){
        StringOperations stringOperation=sentence ->sentence.replaceAll("\\s","").toUpperCase();
        return stringOperation.noWhiteSpace(string);
    }
        return "Sentence has less or more than 7 words";
}
}