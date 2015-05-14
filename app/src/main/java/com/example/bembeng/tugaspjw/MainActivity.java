package com.example.bembeng.tugaspjw;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    Button butHasil;
    TextView hasilHitung;
    double hargaAkhir, hargaSebelum, totalDiskon;
    EditText hargaAwal, jumlahDiskon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hargaAwal=(EditText)findViewById(R.id.HargaAwal);
        jumlahDiskon=(EditText)findViewById(R.id.JumlahDiskon);
        hasilHitung=(TextView)findViewById(R.id.hargaAkhir);
        butHasil=(Button)findViewById(R.id.Hitung);
        butHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hargaSebelum = Double.parseDouble(hargaAwal.getText().toString());
                totalDiskon = Double.parseDouble(jumlahDiskon.getText().toString());
                hargaAkhir = hargaSebelum*(totalDiskon/100);
                hasilHitung.setText(String.valueOf(hargaAkhir));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
