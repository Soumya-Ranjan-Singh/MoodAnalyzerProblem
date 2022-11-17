package com.mood.tester;

import com.mood.analyzer.MoodAnalyzer;
import org.junit.jupiter.api.Test;

public class MoodTester {

    MoodAnalyzer obj = new MoodAnalyzer();

    @Test
    public void testMood() {
        System.out.println(obj.analyseMood("Happy"));
    }
}
