package com.mood.analyzer;

public class MoodAnalyzer {

    public String analyseMood(String message) {
        if (message == "Happy")
            return "Happy";
        else
            return "Sad";
    }
}
