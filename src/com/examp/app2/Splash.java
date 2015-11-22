package com.examp.app2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{
    MediaPlayer mysong;
	@Override
	protected void onCreate(Bundle nehaT) {
		// TODO Auto-generated method stub
		super.onCreate(nehaT);
		setContentView(R.layout.splash_act);
		mysong= new MediaPlayer().create(Splash.this,R.raw.songa);
		mysong.start();
		Thread tim=new Thread(){
			public void run(){
				try{
	               sleep(5000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openMain= new Intent("com.examp.app2.MENU");
					startActivity(openMain);
				}
			}
		};
		tim.start();
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
		mysong.release();
	}
  
}
