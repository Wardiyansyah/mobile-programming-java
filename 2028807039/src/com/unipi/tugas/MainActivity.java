package com.unipi.tugas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText txtUsn = (EditText) findViewById(R.id.txtUsn);
        final EditText txtPass = (EditText) findViewById(R.id.txtPass);
        final Button btnLogin = (Button) findViewById(R.id.btnLogin);
        final Button btnCancel = (Button) findViewById(R.id.btnCancel);
        
        btnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String usn = txtUsn.getText().toString();
				String pass = txtPass.getText().toString();
				
				if (usn.equals("admin") && pass.equals("123456")) {
					Intent explicit = new Intent(MainActivity.this, MainActivity2.class);
					startActivity(explicit);
				} else {
					android.widget.Toast.makeText(getApplicationContext(), "username/password tidak dikenal", Toast.LENGTH_SHORT).show();
				}
			}
		});
        
        btnCancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				txtUsn.setText("");
				txtPass.setText("");
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
