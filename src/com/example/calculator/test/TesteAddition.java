package com.example.calculator.test;

import android.test.ActivityInstrumentationTestCase2;

import com.example.calculator.MainActivity;
import com.robotium.solo.Solo;

public class TesteAddition extends ActivityInstrumentationTestCase2<MainActivity>  {

	private Solo solo;
	
	public TesteAddition() {
		super(MainActivity.class);
		
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		solo = new Solo(getInstrumentation(),getActivity());
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void 

}
