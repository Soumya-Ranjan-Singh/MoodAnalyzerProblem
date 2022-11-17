package com.mood.tester;

import com.mood.analyzer.MoodAnalyzer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodTester {

    MoodAnalyzer obj = new MoodAnalyzer();

    @Test
    public void testMood() {
        assertEquals("Happy" , obj.analyseMood("I am in Happy mood"));
        assertEquals("Sad" , obj.analyseMood("I am in Sad mood"));
        assertEquals("Happy" , obj.analyseMood("I am in Any mood"));
    }
}
