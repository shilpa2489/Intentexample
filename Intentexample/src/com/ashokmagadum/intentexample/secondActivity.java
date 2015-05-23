package com.ashokmagadum.intentexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class secondActivity extends Activity {
    Button btnEnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        
        btnEnd = (Button) findViewById(R.id.btnEnd);
        btnEnd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
    }


    
}
