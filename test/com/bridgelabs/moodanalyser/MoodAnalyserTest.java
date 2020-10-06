package com.bridgelabs.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}

}
