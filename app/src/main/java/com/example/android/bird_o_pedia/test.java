package com.example.android.bird_o_pedia;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class test extends AppCompatActivity {

    private MediaPlayer Chirp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Intent i= getIntent();
        String name_of_bird = i.getStringExtra("individual_birds");
        Toast.makeText(this, name_of_bird, Toast.LENGTH_SHORT).show();
        int bird_call= i.getIntExtra("bird_call", 0);
        int image_res= i.getIntExtra("image-res", 0);
        String test= i.getStringExtra("Test");
        Toast.makeText(test.this, test, Toast.LENGTH_SHORT).show();
        String description= i.getStringExtra("description");
        String name_of_bird_scientific= i.getStringExtra("scientific_bird");
        TextView bird_name_final_english = (TextView) findViewById(R.id.bird_name_final_english);


        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Angelic Peace.ttf");

        bird_name_final_english.setTypeface(custom_font);




        bird_name_final_english.setText(name_of_bird);
        TextView bird_name_final_scientific = (TextView) findViewById(R.id.bird_name_final_scientific);
        bird_name_final_scientific.setText(name_of_bird_scientific);
        ImageView bird_image_file = (ImageView) findViewById(R.id.bird_image_final);
        bird_image_file.setImageResource(image_res);
        TextView bird_description_final = (TextView) findViewById(R.id.brief_description);
        bird_description_final.setText(description);

        Chirp = MediaPlayer.create(this, bird_call);
        Button playButton = (Button) findViewById(R.id.bird_call);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Chirp.start();
            }
        });

    }
}
