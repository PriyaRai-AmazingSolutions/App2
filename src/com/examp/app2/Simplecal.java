package com.examp.app2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.appcompat.R.styleable;
import android.text.Editable;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView.BufferType;

public class Simplecal extends Activity implements OnClickListener {

	Button add, sub, one, two, three, four, equl;
	EditText Disp;
	int op1, op2, tot;
	String optr;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.simplecalc);
		add = (Button) findViewById(R.id.bAd);
		sub = (Button) findViewById(R.id.bSu);
		equl = (Button) findViewById(R.id.bEql);
		one = (Button) findViewById(R.id.bOne);
		two = (Button) findViewById(R.id.bTwo);
		three = (Button) findViewById(R.id.bThree);
		four = (Button) findViewById(R.id.bFour);
		Disp = (EditText) findViewById(R.id.editText1);
		try {
			one.setOnClickListener(this);
			two.setOnClickListener(this);
			three.setOnClickListener(this);
			four.setOnClickListener(this);
			add.setOnClickListener(this);
			sub.setOnClickListener(this);
			equl.setOnClickListener(this);
		} catch (Exception e) {
		}
	}

	public void operation() {
		if (optr.equals("+")) {
			op2 = Integer.parseInt(Disp.getText().toString());
			Disp.setText("");
			op1 = op1 + op2;
			Disp.setText("Result : " + Integer.toString(op1));
		} else if (optr.equals("-")) {
			op2 = Integer.parseInt(Disp.getText().toString());
			Disp.setText("");
			op1 = op1 - op2;
			Disp.setText("Result : " + Integer.toString(op1));
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Editable str = Disp.getText();
		switch (v.getId()) {
		case R.id.bOne:
			if (op2 != 0) {
				op2 = 0;
				Disp.setText("");
			}
			str = str.append(one.getText());
			Disp.setText(str);
			break;
		case R.id.bTwo:
			if (op2 != 0) {
				op2 = 0;
				Disp.setText("");
			}
			str = str.append(two.getText());
			Disp.setText(str);
			break;
		case R.id.bThree:
			if (op2 != 0) {
				op2 = 0;
				Disp.setText("");
			}
			str = str.append(three.getText());
			Disp.setText(str);
			break;
		case R.id.bFour:
			if (op2 != 0) {
				op2 = 0;
				Disp.setText("");
			}
			str = str.append(four.getText());
			Disp.setText(str);
			break;
		case R.id.bAd:
			optr = "+";
			if (op1 == 0) {
				op1 = Integer.parseInt(Disp.getText().toString());
				Disp.setText("");
			} else if (op2 != 0) {
				op2 = 0;
				Disp.setText("");
			} else {
				op2 = Integer.parseInt(Disp.getText().toString());
				Disp.setText("");
				op1 = op1 + op2;
				tot = op1;
				Disp.setText("Result:" + Integer.toString(op1));
			}
			break;
		case R.id.bSu:
			optr = "+";
			if (op1 == 0) {
				op1 = Integer.parseInt(Disp.getText().toString());
				Disp.setText("");
			} else if (op2 != 0) {
				op2 = 0;
				Disp.setText("");
			} else {
				op2 = Integer.parseInt(Disp.getText().toString());
				Disp.setText("");
				op1 = op1 - op2;
				Disp.setText("Result:" + Integer.toString(op1));
			}
			break;
		case R.id.bEql:
			// Disp.setText("Result : " + Integer.toString(op1));
			
			if (!optr.equals(null)) {
				if (op2 != 0) {
					if (optr.equals("+")) {
						Disp.setText("");
						Disp.setText("Result:" + Integer.toString(op1));
					} else if (optr.equals("-")) {
						Disp.setText("");
						Disp.setText("Result:" + Integer.toString(op1));
					}
				} else {
					operation();
				}
			}
			
			break;
		}
	}

}
