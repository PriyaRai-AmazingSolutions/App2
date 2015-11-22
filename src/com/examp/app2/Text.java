package com.examp.app2;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;


public class Text extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text1);
		final Button bt=(Button) findViewById(R.id.button1);
		final ToggleButton tbpas=(ToggleButton) findViewById(R.id.tbpass);
		final EditText etUser =(EditText) findViewById(R.id.etTxt);
		final EditText etpas =(EditText) findViewById(R.id.etPass);
		final TextView tvRes=(TextView) findViewById(R.id.tvRes);
	    tbpas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(tbpas.isChecked()){
					etpas.setInputType(InputType.TYPE_CLASS_TEXT |InputType.TYPE_TEXT_VARIATION_PASSWORD);
				}else{
					etpas.setInputType(InputType.TYPE_CLASS_TEXT);
				}
			}
		});
	    
	    bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String chk=etUser.getText().toString();
				tvRes.setText(chk);
				if(chk.contentEquals("left")|chk.contentEquals("Left")){
					tvRes.setGravity(Gravity.LEFT);
				}else if(chk.contentEquals("right")|chk.contentEquals("Right")){
					tvRes.setGravity(Gravity.RIGHT);
				}else if(chk.contentEquals("Center")|chk.contentEquals("center")){
					tvRes.setGravity(Gravity.CENTER);
				}else if(chk.contentEquals("blue")){
					tvRes.setTextColor(Color.BLUE);
				}else if(chk.contentEquals("WTF")){
					Random crazy=new Random();
					tvRes.setText("WTF!!!!!");
					tvRes.setTextSize(crazy.nextInt(75));
					tvRes.setTextColor(Color.rgb(crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265)));
				}else{
					tvRes.setText("Invalid");
					tvRes.setGravity(Gravity.CENTER);
				}
			}
		});
	}
 
}
