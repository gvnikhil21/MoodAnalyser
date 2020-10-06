package com.bridgelabs.moodanalyser;

public class MoodAnalyser {
	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to Mood Analyser!");
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMoode("I am in Happy mood");
		System.out.println("My mood is " + mood);
	}

	// analyse sad or happy mood
	public String analyseMoode(String message) {
		return message.contains("Happy") ? "HAPPY" : "SAD";
	}
}
