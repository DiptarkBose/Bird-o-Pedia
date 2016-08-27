package com.example.android.bird_o_pedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MadhyaPradesh extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madhya_pradesh);

        String[] TypeOfBirds = {"Select the location", "Wading/Swimming in water", "Perched on a tree", "On land", "Flying high above"};
        final Spinner spinnerMadhyaPradesh = (Spinner) findViewById(R.id.spinner_mp);
        ArrayAdapter<String> spinner_adapter = new ArrayAdapter<String>(this, R.layout.spinner_list_item, TypeOfBirds);

        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMadhyaPradesh.setAdapter(spinner_adapter);

        Intent i=getIntent();
        final String name=i.getStringExtra("name");
        Toast.makeText(this,name,Toast.LENGTH_LONG).show();

        spinnerMadhyaPradesh.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View arg1,
                                       int position, long arg3) {
                if (position == 1) {
                    Intent mp_Water = new Intent();
                    mp_Water.setClass(MadhyaPradesh.this, mpWater.class);
                    mp_Water.putExtra("State", name);
                    mp_Water.putExtra("Location", position);
                    startActivity(mp_Water);
                }
                if (position == 2) {
                    Intent mp_Water = new Intent();
                    mp_Water.setClass(MadhyaPradesh.this, mpWater.class);
                    mp_Water.putExtra("State", name);
                    mp_Water.putExtra("Location", position);
                    startActivity(mp_Water);
                }
                if (position == 3) {
                    Intent mp_Water = new Intent();
                    mp_Water.setClass(MadhyaPradesh.this, mpWater.class);
                    mp_Water.putExtra("State", name);
                    mp_Water.putExtra("Location", position);
                    startActivity(mp_Water);
                }
                if (position == 4) {
                    Intent mp_Water = new Intent();
                    mp_Water.setClass(MadhyaPradesh.this, mpWater.class);
                    mp_Water.putExtra("Location", position);
                    mp_Water.putExtra("State", name);
                    startActivity(mp_Water);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });

    }
}
