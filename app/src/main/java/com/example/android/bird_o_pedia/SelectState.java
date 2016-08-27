package com.example.android.bird_o_pedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SelectState extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_state);

       final String[] States = {"Select a place", "Bandhavgarh National Park", "Kanha National Park", "Satpura National Park", "Sanjay National Park", "Madhav National Park", "Van Vihar National Park", "Mandla Plant Fossils National Park", "Panna National Park", "Pench National Park"};
        final Spinner spinnerState = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> spinner_adapter = new ArrayAdapter<String>(this, R.layout.spinner_list_item, States);

        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerState.setAdapter(spinner_adapter);
        spinnerState.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View arg1,
                                       int position, long arg3)

            {
                if(position!=0) {

                    Intent i1 = new Intent();
                    String name = States[position];
                    int pos = position;
                    i1.putExtra("name", name);
                    //i1.putExtra("value", pos);
                    i1.setClass(SelectState.this, MadhyaPradesh.class);
                    startActivity(i1);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
    }
}
