package com.unipi.latihan7;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	String[] arrNamaBuah = {
			"Durian",
			"Mangga",
			"Semangka",
			"Rambutan",
			"Jeruk",
			"Jambu",
			"Manggis"
	};
	ListView lstNamaBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, arrNamaBuah);
        lstNamaBuah = (ListView) findViewById(R.id.lstNamaBuah);
        lstNamaBuah.setAdapter(adapter);
        lstNamaBuah.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				int intPilih = arg2;
				Toast.makeText(getBaseContext(), "List yang dipilih: "+arrNamaBuah[intPilih], Toast.LENGTH_SHORT).show();
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
