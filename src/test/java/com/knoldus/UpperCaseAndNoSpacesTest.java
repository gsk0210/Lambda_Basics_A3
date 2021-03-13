package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseAndNoSpacesTest {

    UpperCaseAndNoSpaces upperCaseAndNoSpaces=new UpperCaseAndNoSpaces();

    @Test
    void removeSpaces1() {
        assertAll("Possible Sentences",
                ()->assertEquals("JAVAISANOBJECTORIENTEDPROGRAMMINGLANGUAGE",upperCaseAndNoSpaces.concatenateString("Java","is","an","object","oriented","programming","language")),
                ()->assertEquals("Sentence has less or more than 7 words",upperCaseAndNoSpaces.concatenateString("Just","a","try")),
                ()->assertEquals("Sentence has less or more than 7 words",upperCaseAndNoSpaces.concatenateString("The","road","to","success","is","always","under","construction")),
                ()->assertEquals("Sentence has less or more than 7 words",upperCaseAndNoSpaces.concatenateString("")));


    }

}