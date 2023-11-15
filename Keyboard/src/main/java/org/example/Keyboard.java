package org.example;

public class Keyboard {
    private String english = "qwertyuiopasdfghjklzxcvbnm";

    public String getEnglish() {
        return english;
    }

    public char getLeftEnglishChar(char ch) {

        int index = english.indexOf(ch);

        if (index == 0) {
            index = english.length();
        }
        index--;
        return english.charAt(index);
    }
}
