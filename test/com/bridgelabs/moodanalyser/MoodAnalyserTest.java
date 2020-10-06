package com.bridgelabs.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			assertEquals("SAD", mood);
		} catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenMessage_WhenNull_ShouldThrowMoodAnalysisException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			Assert.assertEquals(MoodAnalysisException.class, moodAnalyser.analyseMood());
		} catch (MoodAnalysisException e) {
			assertEquals("NULL", e.getMessage());
		}
	}

}
