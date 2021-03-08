package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseAndNoSpacesTest {

    UpperCaseAndNoSpaces upperCaseAndNoSpaces=new UpperCaseAndNoSpaces();

    @Test
    void removeSpaces1() {
        assertAll("Possible Sentences",
                ()->assertEquals("JAVAISANOBJECTORIENTEDPROGRAMMINGLANGUAGE",upperCaseAndNoSpaces.removeSpaces("Java is an object oriented programming language")),
                ()->assertEquals("Sentence has less or more than 7 words",upperCaseAndNoSpaces.removeSpaces("Just a try")),
                ()->assertEquals("Sentence has less or more than 7 words",upperCaseAndNoSpaces.removeSpaces("The road to success is always under construction")),
                ()->assertEquals("Sentence has less or more than 7 words",upperCaseAndNoSpaces.removeSpaces("")));


    }


}