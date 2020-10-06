package com.bridgelabs.moodanalyser;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to Mood Analyser!");
		MoodAnalyser moodAnalyser = new MoodAnalyser("\"I am in Happy mood\"");
		String mood = moodAnalyser.analyseMood();
		System.out.println("My mood is " + mood);
	}

	// analyse sad or happy mood
	public String analyseMood() {
		return message.contains("Sad") ? "SAD" : "HAPPY";
	}
}
