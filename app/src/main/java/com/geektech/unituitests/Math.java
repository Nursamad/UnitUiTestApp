package com.geektech.unituitests;

public class Math {

    public String add(String a, String b) {
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        boolean isCorrect = false;

        if (a.trim().isEmpty() && b.trim().isEmpty()) {
            return "0";
        }
        if (a.isEmpty()) {
            return b;
        }
        for (char charA : charsA) {
            if (Character.isDigit(charA)){
                isCorrect = true;
            }else {
                isCorrect = false;
                break;
            }

        }
        for (char charB : charsB) {
            if (Character.isDigit(charB)){
                isCorrect = true;
            }else {
                isCorrect = false;
                break;
            }
        }
        if (!isCorrect){
            return "No correct";
        }


        return String.valueOf(Integer.parseInt(a.trim()) + Integer.parseInt(b.trim()));
    }


    public String sub(String a, String b) {
        return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
    }

    public String multiply(String a, String b) {
        return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
    }

    public String div(String a, String b) {
        if (a.contains("0") || b.contains("0")) {
            return "0";
        }

        return String.valueOf(Integer.parseInt(a) / Integer.parseInt(b));
    }

    public String reverseWords(String words) {
        if (words.contains(" ")) {

        }
        String[] splitWords = words.trim().split(" ");
        StringBuilder a;
        if (splitWords[0].equals("")) return null;
        else {
            for (int i = 0; i < splitWords.length / 2; i++) {
                String tmp = splitWords[i];
                splitWords[i] = splitWords[splitWords.length - i - 1];
                splitWords[splitWords.length - i - 1] = tmp;
            }
            a = new StringBuilder();
            for (String splitWord : splitWords) {
                a.append(splitWord).append(" ");
            }
        }
        return a.toString().trim();
    }
}
