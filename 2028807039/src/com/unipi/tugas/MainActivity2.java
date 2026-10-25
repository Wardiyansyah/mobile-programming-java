package com.unipi.tugas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity2 extends Activity {

	double biayaSmt=0,total=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		
		final EditText txtSmt = (EditText) findViewById(R.id.txtSmt);
		final RadioButton pagi = (RadioButton) findViewById(R.id.optPagi);
		final RadioButton malam = (RadioButton) findViewById(R.id.optMalam);
		final EditText txtTotal = (EditText) findViewById(R.id.txtTotal);
		final Button btnHitung = (Button) findViewById(R.id.btnHitung);
		
		
		btnHitung.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String smt = txtSmt.getText().toString();
				
				
				if (smt.equals("1")) {
					biayaSmt = 5000000;
				} else if (smt.equals("2")) {
					biayaSmt = 4750000;
				} else if (smt.equals("3")) {
					biayaSmt = 4500000;
				} else if (smt.equals("4")) {
					biayaSmt = 4250000;
				} else if (smt.equals("5")) {
					biayaSmt = 4000000;
				} else if (smt.equals("6")) {
					biayaSmt = 3750000;
				} else if (smt.equals("7")) {
					biayaSmt = 3500000;
				} else if (smt.equals("8")) {
					biayaSmt = 3250000;
				}
				
				if(pagi.isChecked()) {
					total = biayaSmt;
					txtTotal.setText(String.valueOf(total));
				} else if (malam.isChecked()) {
					total = biayaSmt * 1.25;
					txtTotal.setText(String.valueOf(total));				
				} else {
					android.widget.Toast.makeText(getApplicationContext(), "Kelas harus dipilih", Toast.LENGTH_SHORT).show();
				}
				

			}
		});
		
	} 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}

}
