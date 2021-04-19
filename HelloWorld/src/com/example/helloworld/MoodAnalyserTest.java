package com.example.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {
  @Test
  public void testMoodAnalysis() throws Exception{
    MoodAnalyser moodAnalysernew = new MoodAnalyser();
    String mood = moodAnalysernew.analyseMood("This is a message");
    assertEquals(mood, "Bad");
  }
  
  @Test
  void name() {
  }
}
