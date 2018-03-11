package com.qa.utils;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class JunitListener extends RunListener {

	// Called before any tests have been run.

	public void testRunStarted(Description description)  {

		System.out.println("Test cases to execute : " + description.testCount());

	}

	// Called when all tests have finished

	public void testRunFinished(Result result)  {

		System.out.println("Test cases executed : " + result.getRunCount());

	}


	// Called when an atomic test is about to be started.

	public void testStarted(Description description)  {

		System.out.println("Execution Started : " + description.getMethodName());

	}

	// Called when an atomic test has finished, whether the test succeeds or fails.

	public void testFinished(Description description)  {

		System.out.println("Execution Finished : " + description.getMethodName());

	}

	// Called when an atomic test fails.

	public void testFailure(Failure failure)  {

		System.out.println("Execution Failure : " + failure.getException());

	}

	// Called when a test will not be run, generally because a test method is annotated with Ignore.

	public void testIgnored(Description description)  {

		System.out.println("Execution Ignored : " + description.getMethodName());

	}



	// Called when an atomic test flags that it assumes a condition that is false

	/* public void testAssumptionFailure(Failure failure){

		System.out.println("Assumption Failure : " + failure.getMessage());

	}*/

}
