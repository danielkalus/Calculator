package com.example.calculator.test;

import org.junit.Test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.calculator.MainActivity;
import com.example.calculator.R;
import com.robotium.solo.Solo;

public class AdditionTest extends ActivityInstrumentationTestCase2<MainActivity>  {

	private Solo solo;
	
	public AdditionTest() {
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
	public void testeAddition()
	{
		solo.clickOnButton("3");
		solo.clickOnButton("+");
		solo.clickOnButton("4");
		solo.clickOnButton("=");
		solo.sleep(1000);
		TextView ergebnis = (TextView) solo.getView(R.id.result_id);
		assertEquals("7",ergebnis.getText().toString());
	}
	


}
