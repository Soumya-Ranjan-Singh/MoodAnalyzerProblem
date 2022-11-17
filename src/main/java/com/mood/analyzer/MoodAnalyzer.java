package com.mood.analyzer;

public class MoodAnalyzer {

    public String analyseMood(String message) {
        if (message.contains("Happy") || message.contains("Any"))
            return "Happy";
        else
            return "Sad";
    }
}
