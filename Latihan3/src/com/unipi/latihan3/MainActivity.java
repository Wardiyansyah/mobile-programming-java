package com.unipi.latihan3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
//        Deklarasi objek
        final EditText txtNilai1 = (EditText) findViewById(R.id.txtNilai1);
        final EditText txtNilai2 = (EditText) findViewById(R.id.txtNilai2);
        final EditText txtHasil = (EditText) findViewById(R.id.txtHasil);
        
        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        Button btnClear = (Button) findViewById(R.id.btnClear);
        
        
        btnPlus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int nilai1 = Integer.parseInt(txtNilai1.getText().toString());
				int nilai2 = Integer.parseInt(txtNilai2.getText().toString());
				
				int hasil = nilai1 + nilai2;
				
				txtHasil.setText(String.valueOf(hasil));
			}
		});
        
        btnClear.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				txtNilai1.setText("");
				txtNilai2.setText("");
				txtHasil.setText("");
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
