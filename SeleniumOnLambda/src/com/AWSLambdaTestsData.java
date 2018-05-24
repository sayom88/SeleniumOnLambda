package com;

public class AWSLambdaTestsData {
	
	private String jarS3Location;
	private String testToRun;
	private String s3LocationToStoreOutput;
	private String testServerURL;
	
	public String getJarS3Location(){
		return jarS3Location;
	}
	
	public AWSLambdaTestsData withJarS3Location(String s3Location) {
		this.jarS3Location = s3Location;
		return this;
	}
	public String getTestToRun() {
		return testToRun;
	}
	public AWSLambdaTestsData withTestToRun(String testToRun) {
		this.testToRun = testToRun;
		return this;
	}
	public String getS3LocationToStoreOutput() {
		return s3LocationToStoreOutput;
	}
	public AWSLambdaTestsData withS3LocationToStoreOutput(String s3LocationToStoreOutput) {
		this.s3LocationToStoreOutput = s3LocationToStoreOutput;
		return this;
	}

	public String getTestServerURL() {
		return testServerURL;
	}

	public AWSLambdaTestsData withTestServerURL(String testServerURL) {
		this.testServerURL = testServerURL;
		return this;
	}

}
