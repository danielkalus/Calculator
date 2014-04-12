package com.example.calculator.test;

import org.junit.Test;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculator.MainActivity;
import com.example.calculator.R;
import com.robotium.solo.Solo;

public class SubtraktionTest extends ActivityInstrumentationTestCase2<MainActivity>  {

	private Solo solo;
	
	public SubtraktionTest() {
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
	public void testeSubtraktion()
	{
	
		View btn4 = solo.getView(R.id.Btn4_id);
		View btn3 = solo.getView(R.id.Btn3_id);
		View btnEqual = solo.getView(R.id.Btnequal_id);
		View btnMinus = solo.getView(R.id.Btnminus_id);
	
		solo.clickOnView(btn4);
		solo.clickOnView(btnMinus);
		solo.clickOnView(btn3);
		solo.clickOnView(btnEqual);
		
		solo.sleep(1000);
		TextView ergebnis = (TextView) solo.getView(R.id.result_id);
		assertEquals("1",ergebnis.getText().toString());
	}
	


}
