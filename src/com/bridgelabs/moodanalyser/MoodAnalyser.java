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
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			System.out.println("My mood is " + mood);
		} catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}

	// analyse sad or happy mood
	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.length() == 0)
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,
						"Empty mood! Enter valid mood");
			else if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,
					"Null mood! Enter valid mood");
		}
	}
}