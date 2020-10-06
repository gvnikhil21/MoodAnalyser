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
			assertEquals("Null mood! Enter valid mood", e.getMessage());
		}
	}

	@Test
	public void givenMessae_WhenNull_ShouldThrowExceptionTypeNull() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			String mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void givenMessage_whenEmpty_ShouldThrowExceptionTypeEmpty() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			String mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}
