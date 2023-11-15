package org.example;

public class Arrows {

    private String leftArrow = "<--<<";
    private String rightArrow = ">>-->";

    public int countArrows(String text) {
        return countArrows(text, leftArrow) +
                countArrows(text, rightArrow);
//        return countArrowsNotAdvanced(text);
    }

    private int countArrows(String text, String arrow) {
        int count = 0;
        int index = text.indexOf(arrow);
        while (index > -1) {
            count++;
            index += arrow.length();
            index = text.indexOf(arrow, index);
        }
        return count;
    }

    private int countArrowsNotAdvanced(String text) {
        final int ARROW_LEN = leftArrow.length();
        int count = 0;
        int index = 0;
        while ((index + ARROW_LEN) <= text.length()) {
            String substring = text.substring(index, index + ARROW_LEN);
            if (substring.equals(leftArrow) || substring.equals(rightArrow)) {
                count++;
                index += ARROW_LEN;
            } else {
                index++;
            }
        }
        return count;
    }

    public int countArrowsPossiblyAdvanced(String text) {
        int count = 0;
        int index = 0;

        while (index < text.length()) {
            char ch = text.charAt(index);
            if ( (index + 5) <= text.length() && (
                    ch == '>' &&
                    text.charAt(index + 1) == '>' &&
                    text.charAt(index + 2) == '-' &&
                    text.charAt(index + 3) == '-' &&
                    text.charAt(index + 4) == '>'
                ||
                    ch == '<' &&
                    text.charAt(index + 1) == '-' &&
                    text.charAt(index + 2) == '-' &&
                    text.charAt(index + 3) == '<' &&
                    text.charAt(index + 4) == '<')
            ) {
                count++;
                index += 5;
            } else {
                index++;
            }
        }
        return count;
    }
}
