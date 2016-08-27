package com.example.android.bird_o_pedia;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class mpWater extends AppCompatActivity {
    private SilhouetteAdapter adapter;
    private List<SilhouetteDescription> birdList = new ArrayList<>();
   // private List<SilhouetteDescription> filteredList=new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp_water);

        // add the custom view to the action bar

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        //recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        Intent i =getIntent();
        final int val= i.getIntExtra("Location", 0);

        //Madhya Pradesh List
            if(val==1) {
                prepareMPWaterinfo();
                adapter = new SilhouetteAdapter(birdList, this);
            }
            if(val==2)
            {
                prepareMPTreesinfo();
                adapter = new SilhouetteAdapter(birdList, this);
            }
            if(val==3)
            {
                prepareMPGroundinfo();
                adapter = new SilhouetteAdapter(birdList, this);
            }
            if(val==4)
            {
                prepareMPSkyinfo();
                adapter = new SilhouetteAdapter(birdList, this);
            }



        recyclerView.setAdapter(adapter);




        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                SilhouetteDescription species = birdList.get(position);


            if(val==1) {
                if (position == 0) //Ducks
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 1) //Geese
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 2) //Teals
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 3) //Pochards
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 4) //Flamingoes
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 5) //Storks
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 6) //Adjutants
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 7) //Pelicans
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 8) //Ibis
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }
                if (position == 9) //Spoonbill
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 10) //Stilt
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 11) //Snipe
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 12) //Jacanas
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 13) //Skimmer
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 14) //Gull
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 15) //Turn
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 15) //Turn
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 16) //Grebes
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 17) //Shelducks
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 18) //Rails
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 19) //Pintails
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 20) //Coot
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 21) //Cranes
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 22) //Bitterns
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 23) //Herons
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 24) //Egrets
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 25) //Cormorants
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 26) //Godwits
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }

                if (position == 27) //Sandpipers
                {
                    Intent intent = new Intent(mpWater.this, DucksInMp.class);
                    SilhouetteDescription obj = birdList.get(position);
                    intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                    startActivity(intent);
                }


            }

                if(val==2) {
                    if (position == 0) //Ducks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 1) //Geese
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 2) //Teals
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 3) //Pochards
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 4) //Flamingoes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 5) //Storks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 6) //Adjutants
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 7) //Pelicans
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 8) //Ibis
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }
                    if (position == 9) //Spoonbill
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 10) //Stilt
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 11) //Snipe
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 12) //Jacanas
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 13) //Skimmer
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 14) //Gull
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 15) //Turn
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 15) //Turn
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 16) //Grebes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 17) //Shelducks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 18) //Rails
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 19) //Pintails
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 20) //Coot
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 21) //Cranes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 22) //Bitterns
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 23) //Herons
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 24) //Egrets
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 25) //Cormorants
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 26) //Godwits
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 27) //Sandpipers
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 28) //Bitterns
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 29) //Herons
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 30) //Egrets
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 31) //Cormorants
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 32) //Godwits
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 33) //Sandpipers
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 34) //Ducks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 35) //Geese
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 36) //Teals
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 37) //Pochards
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 38) //Flamingoes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 39) //Storks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position ==40) //Adjutants
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 41) //Pelicans
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 42) //Ibis
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }
                    if (position == 43) //Spoonbill
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 44) //Stilt
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 45) //Snipe
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 46) //Jacanas
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 47) //Skimmer
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 48) //Gull
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 49) //Turn
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 50) //Turn
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 51) //Grebes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 52) //Shelducks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 53) //Rails
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 54) //Pintails
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 55) //Coot
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 56) //Cranes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 57) //Bitterns
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 58) //Herons
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }


                }

                if(val==3) {
                    if (position == 0) //Ducks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 1) //Geese
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 2) //Teals
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 3) //Pochards
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 4) //Flamingoes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 5) //Storks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 6) //Adjutants
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 7) //Pelicans
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 8) //Ibis
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }
                    if (position == 9) //Spoonbill
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 10) //Stilt
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 11) //Snipe
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 12) //Jacanas
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 13) //Skimmer
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 14) //Gull
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 15) //Turn
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 15) //Turn
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 16) //Grebes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 17) //Shelducks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 18) //Rails
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 19) //Pintails
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 20) //Coot
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 21) //Cranes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 22) //Bitterns
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 23) //Herons
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 24) //Egrets
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 25) //Cormorants
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 26) //Godwits
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 27) //Sandpipers
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }


                }
                if(val==4) {
                    if (position == 0) //Ducks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 1) //Geese
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 2) //Teals
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 3) //Pochards
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 4) //Flamingoes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 5) //Storks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 6) //Adjutants
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 7) //Pelicans
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 8) //Ibis
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }
                    if (position == 9) //Spoonbill
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 10) //Stilt
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 11) //Snipe
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 12) //Jacanas
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 13) //Skimmer
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 14) //Gull
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 15) //Turn
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 15) //Turn
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 16) //Grebes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 17) //Shelducks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 18) //Rails
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 19) //Pintails
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 20) //Coot
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 21) //Cranes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 22) //Bitterns
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 23) //Herons
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 24) //Egrets
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 25) //Cormorants
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 26) //Godwits
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 27) //Sandpipers
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 28) //Geese
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 29) //Teals
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 30) //Pochards
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 31) //Flamingoes
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 32) //Storks
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 33) //Adjutants
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 34) //Pelicans
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 35) //Ibis
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }
                    if (position == 36) //Spoonbill
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 37) //Stilt
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }

                    if (position == 38) //Snipe
                    {
                        Intent intent = new Intent(mpWater.this, DucksInMp.class);
                        SilhouetteDescription obj = birdList.get(position);
                        intent.putExtra("name", obj.getNameOfTheBirdEnglish());
                        startActivity(intent);
                    }



                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


    }

    //Madhya Pradesh start

    //MP Water birds
    private void prepareMPWaterinfo() {
        //Ducks
        SilhouetteDescription Ducks = new SilhouetteDescription("Ducks", "8 types in Madhya Pradesh", R.drawable.silhouette_duck);
        birdList.add(Ducks);

        //Goose
        SilhouetteDescription Goose = new SilhouetteDescription("Geese", "4 types in Madhya Pradesh", R.drawable.silhouette_geese);
        birdList.add(Goose);

        //Teal
        SilhouetteDescription Teals = new SilhouetteDescription("Teals", "3 types in Madhya Pradesh", R.drawable.silhoutte_teal);
        birdList.add(Teals);

        //Pochards
        SilhouetteDescription Pochards = new SilhouetteDescription("Pochards", "2 types in Madhya Pradesh", R.drawable.silhoutte_pochard);
        birdList.add(Pochards);

        //Flamingoes
        SilhouetteDescription Flamingoes = new SilhouetteDescription("Flamingoes", "2 types in Madhya Pradesh", R.drawable.silhouette_flamingo);
        birdList.add(Flamingoes);

        //Stork
        SilhouetteDescription Stork = new SilhouetteDescription("Storks", "5 types in Madhya Pradesh", R.drawable.silhoeutte_stork);
        birdList.add(Stork);

        //Adjutant
        SilhouetteDescription Adjutant = new SilhouetteDescription("Adjutants", "2 types in Madhya Pradesh", R.drawable.silhouette_adjutant);
        birdList.add(Adjutant);

        //Pelican
        SilhouetteDescription Pelicans = new SilhouetteDescription("Pelicans", "3 types in Madhya Pradesh", R.drawable.silhouette_pelican);
        birdList.add(Pelicans);

        //Ibis
        SilhouetteDescription Ibis = new SilhouetteDescription("Ibis", "3 types in Madhya Pradesh", R.drawable.silhouette_ibis);
        birdList.add(Ibis);

        //Spoonbill
        SilhouetteDescription Spoonbill = new SilhouetteDescription("Spoonbill", "1 type in Madhya Pradesh", R.drawable.silhouette_spoonbill);
        birdList.add(Spoonbill);

        //Stilt
        SilhouetteDescription Stilt = new SilhouetteDescription("Stilt", "2 types in Madhya Pradesh", R.drawable.silhouette_stilt);
        birdList.add(Stilt);

        //Snipe
        SilhouetteDescription Snipe = new SilhouetteDescription("Snipe", "1 type in Madhya Pradesh", R.drawable.silhouette_snipe);
        birdList.add(Snipe);

        //Jacanas
        SilhouetteDescription Jacanas = new SilhouetteDescription("Jacanas", "2 types in Madhya Pradesh", R.drawable.silhouette_jacana);
        birdList.add(Jacanas);

        //Skimmer
        SilhouetteDescription Skimmer = new SilhouetteDescription("Skimmer", "1 type in Madhya Pradesh", R.drawable.silhouette_skimmer);
        birdList.add(Skimmer);

        //Gull
        SilhouetteDescription Gull = new SilhouetteDescription("Gull", "4 types in Madhya Pradesh", R.drawable.silhouette_gull);
        birdList.add(Gull);

        //Turn
        SilhouetteDescription Turn = new SilhouetteDescription("Turn", "7 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Turn);

        //Grebe
        SilhouetteDescription Grebes = new SilhouetteDescription("Grebes", "4 types in Madhya Pradesh", R.drawable.silhouette_gull);
        birdList.add(Grebes);

        //Shelduck
        SilhouetteDescription Shelduck = new SilhouetteDescription("Shelducks", "7 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Shelduck);


        //Crake
        SilhouetteDescription Crake = new SilhouetteDescription("Crakes", "4 types in Madhya Pradesh", R.drawable.silhouette_gull);
        birdList.add(Crake);

        //Rail
        SilhouetteDescription Rail = new SilhouetteDescription("Rails", "7 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Rail);

        //Pintail
        SilhouetteDescription Pintail = new SilhouetteDescription("Pintails", "4 types in Madhya Pradesh", R.drawable.silhouette_gull);
        birdList.add(Pintail);

        //Coot
        SilhouetteDescription Coot = new SilhouetteDescription("Coot", "1 types in Madhya Pradesh", R.drawable.silhouette_gull);
        birdList.add(Coot);

        //Crane
        SilhouetteDescription Crane = new SilhouetteDescription("Cranes", "4 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Crane);

        //Bitterns
        SilhouetteDescription Bitterns = new SilhouetteDescription("Bitterns", "5 types in Madhya Pradesh", R.drawable.silhouette_gull);
        birdList.add(Bitterns);

        //Herons
        SilhouetteDescription Herons = new SilhouetteDescription("Herons", "1 types in Madhya Pradesh", R.drawable.silhouette_gull);
        birdList.add(Herons);

        //Egret
        SilhouetteDescription Egrets = new SilhouetteDescription("Egrets", "4 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Egrets);

        //Cormorants
        SilhouetteDescription Cormorants = new SilhouetteDescription("Cormorants", "4 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Cormorants);

        //Godwit
        SilhouetteDescription Godwits = new SilhouetteDescription("Godwits", "2 types in Madhya Pradesh", R.drawable.silhouette_gull);
        birdList.add(Godwits);

        //Sandpiper
        SilhouetteDescription Sandpiper = new SilhouetteDescription("Sandpipers", "6 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Sandpiper);


        //Redshank
        SilhouetteDescription Redshank = new SilhouetteDescription("Redshanks", "2 types in Madhya Pradesh", R.drawable.silhouette_gull);
        birdList.add(Redshank);



    }

    //MP Perched on trees
    private void prepareMPTreesinfo() {
        //Coucal
        SilhouetteDescription Coucal = new SilhouetteDescription("Coucal", "1 types in Madhya Pradesh", R.drawable.silhouette_duck);
        birdList.add(Coucal);

        //Malkoha
        SilhouetteDescription Malkoha = new SilhouetteDescription("Malkohas", "3 types in Madhya Pradesh", R.drawable.silhouette_geese);
        birdList.add(Malkoha);

        //Plover
        SilhouetteDescription Plover = new SilhouetteDescription("Plovers", "7 types in Madhya Pradesh", R.drawable.silhouette_snipe);
        birdList.add(Plover);

        //Lapwing
        SilhouetteDescription Lapwing = new SilhouetteDescription("Lapwings", "7 types in Madhya Pradesh", R.drawable.silhouette_jacana);
        birdList.add(Lapwing);

        //Cuckoo
        SilhouetteDescription Cuckoo = new SilhouetteDescription("Cuckoos", "12 types in Madhya Pradesh", R.drawable.silhoeutte_stork);
        birdList.add(Cuckoo);

        //Trogan
        SilhouetteDescription Trogan = new SilhouetteDescription("Trogan", "1 type in Madhya Pradesh", R.drawable.silhouette_flamingo);
        birdList.add(Trogan);
        //Osprey
        SilhouetteDescription Osprey = new SilhouetteDescription("Osprey", "1 type in Madhya Pradesh", R.drawable.silhouette_ibis);
        birdList.add(Osprey);

        //Kite
        SilhouetteDescription Kite = new SilhouetteDescription("Kites", "3 types in Madhya Pradesh", R.drawable.silhouette_spoonbill);
        birdList.add(Kite);

        //Buzzard
        SilhouetteDescription Buzzard = new SilhouetteDescription("Buzzards", "4 types in Madhya Pradesh", R.drawable.silhouette_stilt);
        birdList.add(Buzzard);

        //Vulture
        SilhouetteDescription Vulture = new SilhouetteDescription("Vultures", "6 types in Madhya Pradesh", R.drawable.silhouette_snipe);
        birdList.add(Vulture);

        //Eagle
        SilhouetteDescription Eagle = new SilhouetteDescription("Eagles", "18 types in Madhya Pradesh", R.drawable.silhouette_jacana);
        birdList.add(Eagle);

        //Hen Harrier
        SilhouetteDescription Harrier = new SilhouetteDescription("Harriers", "1 type in Madhya Pradesh", R.drawable.silhouette_skimmer);
        birdList.add(Harrier);

        //Shikra
        SilhouetteDescription Shikra = new SilhouetteDescription("Shikra & Besra", "2 types in Madhya Pradesh", R.drawable.silhouette_gull);
        birdList.add(Shikra);

        //Sparrowhawk
        SilhouetteDescription Sparrowhawk = new SilhouetteDescription("Sparrowhawks & Goshawks", "3 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Sparrowhawk);

        //Hornbills
        SilhouetteDescription Hornbills = new SilhouetteDescription("Hornbills", "3 types in Madhya Pradesh", R.drawable.silhouette_flamingo);
        birdList.add(Hornbills);

        //Wryneck
        SilhouetteDescription Wryneck = new SilhouetteDescription("Wryneck & Piculet", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Wryneck);

        //Woodpecker
        SilhouetteDescription Woodpecker = new SilhouetteDescription("Woodpeckers", "13 types in Madhya Pradesh", R.drawable.silhouette_flamingo);
        birdList.add(Woodpecker);

        //Barbets
        SilhouetteDescription Barbets = new SilhouetteDescription("Barbets", "2 types in Madhya Pradesh", R.drawable.silhouette_flamingo);
        birdList.add(Barbets);

        //Kingfishers
        SilhouetteDescription Kingfishers = new SilhouetteDescription("Kingfishers", "6 types in Madhya Pradesh", R.drawable.silhouette_flamingo);
        birdList.add(Kingfishers);
        //Falcon
        SilhouetteDescription Falcons = new SilhouetteDescription("Falcons", "5 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Falcons);

        //Kestrels
        SilhouetteDescription Kestrels = new SilhouetteDescription("Kestrels", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Kestrels);

        //Hobby
        SilhouetteDescription Hobby = new SilhouetteDescription("Hobby", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Hobby);

        //Parakeets&Pitta
        SilhouetteDescription Parakeets = new SilhouetteDescription("Parakeets & Pitta", "6 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Parakeets);

        //Minivet
        SilhouetteDescription Minivet = new SilhouetteDescription("Minivets", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Minivet);

        //Cuckooshrike
        SilhouetteDescription Cuckooshrike = new SilhouetteDescription("Cuckooshrikes", "4 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Cuckooshrike);

        //Oriole
        SilhouetteDescription Oriole = new SilhouetteDescription("Orioles", "6 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Oriole);

        //Woodshrike
        SilhouetteDescription Woodshrike = new SilhouetteDescription("Woodshrikes", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Woodshrike);

        //Iora
        SilhouetteDescription Iora = new SilhouetteDescription("Iora", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Iora);

        //Drongo
        SilhouetteDescription Drongo = new SilhouetteDescription("Drongo", "6 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Drongo);

        //Fantail
        SilhouetteDescription Fantail = new SilhouetteDescription("Fantails", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Fantail);

        //Crows
        SilhouetteDescription Crows = new SilhouetteDescription("Crows", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Crows);

        //Treepie
        SilhouetteDescription Treepie = new SilhouetteDescription("Treepie & Jackdaws", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Treepie);
        //Shrike
        SilhouetteDescription Shrike = new SilhouetteDescription("Shrikes", "6 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Shrike);


        //Monarch
        SilhouetteDescription Monarch = new SilhouetteDescription("Monarch", "1 type in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Monarch);


        //Flowerpeckers
        SilhouetteDescription Flowerpeckers = new SilhouetteDescription("Flowerpeckers", "2 type in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Flowerpeckers);


        //Weaver
        SilhouetteDescription Weaver = new SilhouetteDescription("Weavers", "4 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Weaver);

        //Avadavat
        SilhouetteDescription Avadavat = new SilhouetteDescription("Avadavats", "2 type in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Avadavat);

        //Munia
        SilhouetteDescription Munia = new SilhouetteDescription("Munias", "4 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Munia);


        //Sparrows
        SilhouetteDescription Sparrows = new SilhouetteDescription("Sparrows", "3 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Sparrows);

        //Rosefinch
        SilhouetteDescription Rosefinch = new SilhouetteDescription("Rosefinch", "1 type in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Rosefinch);

        //Buntings
        SilhouetteDescription Buntings = new SilhouetteDescription("Buntings", "8 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Buntings);

        //Tit
        SilhouetteDescription Tit = new SilhouetteDescription("Tit", "1 type in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Tit);

        //Larks
        SilhouetteDescription Larks = new SilhouetteDescription("Larks", "12 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Larks);


        //Warblers
        SilhouetteDescription Warblers = new SilhouetteDescription("Warblers", "21 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Warblers);

        //Prinia
        SilhouetteDescription Prinia = new SilhouetteDescription("Prinia", "12 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Prinia);

        // Martin
        SilhouetteDescription Martin = new SilhouetteDescription("Martin", "7 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Martin);

        //Swallows
        SilhouetteDescription Swallows = new SilhouetteDescription("Swallows", "5 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Swallows);

        SilhouetteDescription Bulbul = new SilhouetteDescription("Bulbul", "8 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Bulbul);

        //Prinia
        SilhouetteDescription Babbler = new SilhouetteDescription("Babbler & Fulvetta", "10 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Babbler);

        //Nuthatch
        SilhouetteDescription Nuthatch = new SilhouetteDescription("Nuthatch & Salpornis", "3 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Nuthatch);

        //Starling
        SilhouetteDescription Starling = new SilhouetteDescription("Starling", "7 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Starling);

        //Myna
        SilhouetteDescription Myna = new SilhouetteDescription("Myna", "4 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Myna);

        //Thrush
        SilhouetteDescription Thrush = new SilhouetteDescription("Thrush & Indian Blackbird", "7 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Thrush);

        //Robin
        SilhouetteDescription Robin = new SilhouetteDescription("Robin", "5 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Robin);

        //Flycatcher
        SilhouetteDescription Flycatcher = new SilhouetteDescription("Flycatcher", "11 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Flycatcher);

        //Chat
        SilhouetteDescription Chat = new SilhouetteDescription("Chat", "4 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Chat);

        //Wheatear
        SilhouetteDescription Wheatear = new SilhouetteDescription("Wheatear", "6 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Wheatear);

        //Redstart
        SilhouetteDescription Redstart = new SilhouetteDescription("Redear", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Redstart);
    }

    private void prepareMPGroundinfo() {
        //Quail
        SilhouetteDescription Quail = new SilhouetteDescription("Quails", "5 types in Madhya Pradesh", R.drawable.silhouette_duck);
        birdList.add(Quail);

        //Fowls
        SilhouetteDescription Fowls = new SilhouetteDescription("Fowls", "5 types in Madhya Pradesh", R.drawable.silhouette_geese);
        birdList.add(Fowls);

        //Francolins
        SilhouetteDescription Francolins = new SilhouetteDescription("Francolins", "3 types in Madhya Pradesh", R.drawable.silhoutte_teal);
        birdList.add(Francolins);

        //Pigeons
        SilhouetteDescription Pigeon = new SilhouetteDescription("Pigeons", "6 types in Madhya Pradesh", R.drawable.silhoutte_pochard);
        birdList.add(Pigeon);

        //Egret
        SilhouetteDescription Egrets = new SilhouetteDescription("Egrets", "4 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Egrets);

        //doves
        SilhouetteDescription Doves = new SilhouetteDescription("Doves", "7 types in Madhya Pradesh", R.drawable.silhouette_flamingo);
        birdList.add(Doves);

        //Standgrouses
        SilhouetteDescription Sandgrouses = new SilhouetteDescription("Sandgrouses", "4 types in Madhya Pradesh", R.drawable.silhoeutte_stork);
        birdList.add(Sandgrouses);

        //Nightjars
        SilhouetteDescription Nightjars = new SilhouetteDescription("Nightjars", "6 types in Madhya Pradesh", R.drawable.silhouette_adjutant);
        birdList.add(Nightjars);

        //Crows
        SilhouetteDescription Crows = new SilhouetteDescription("Crows", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Crows);

        //Coucal
        SilhouetteDescription Coucal = new SilhouetteDescription("Coucal", "1 type in Madhya Pradesh", R.drawable.silhouette_pelican);
        birdList.add(Coucal);

        //Bustards
        SilhouetteDescription Bustard = new SilhouetteDescription("Bustards", "2 types in Madhya Pradesh", R.drawable.silhouette_ibis);
        birdList.add(Bustard);

        //Florican
        SilhouetteDescription Florican = new SilhouetteDescription("Floricans", "1 type in Madhya Pradesh", R.drawable.silhouette_spoonbill);
        birdList.add(Florican);

        //Thick-knee
        SilhouetteDescription Thick_knee = new SilhouetteDescription("Thick-knees", "2 types in Madhya Pradesh", R.drawable.silhouette_stilt);
        birdList.add(Thick_knee);

        //Plover
        SilhouetteDescription Plover = new SilhouetteDescription("Plovers", "8 types in Madhya Pradesh", R.drawable.silhouette_snipe);
        birdList.add(Plover);

        //Lapwing
        SilhouetteDescription Lapwing = new SilhouetteDescription("Lapwings", "7 types in Madhya Pradesh", R.drawable.silhouette_jacana);
        birdList.add(Lapwing);

        //Buttonquail
        SilhouetteDescription Buttonquail = new SilhouetteDescription("Buttonquails", "3 type in Madhya Pradesh", R.drawable.silhouette_skimmer);
        birdList.add(Buttonquail);

        //Courser
        SilhouetteDescription Courser = new SilhouetteDescription("Coursers", "4 types in Madhya Pradesh", R.drawable.silhouette_gull);
        birdList.add(Courser);

        //Sparrows
        SilhouetteDescription Sparrows = new SilhouetteDescription("Sparrows", "3 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Sparrows);

        //Pratincole
        SilhouetteDescription Pratincole = new SilhouetteDescription("Pratincoles", "7 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Pratincole);

        //Wagtails
        SilhouetteDescription Wagtails = new SilhouetteDescription("Wagtails", "5 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Wagtails);

        //Pipits
        SilhouetteDescription Pipits = new SilhouetteDescription("Pipits", "7 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Pipits);

        //Wallcreeper
        SilhouetteDescription Wallcreeper = new SilhouetteDescription("Wallcreeper", "1 type in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Wallcreeper);

    }

    private void prepareMPSkyinfo() {
        //Nightjars
        SilhouetteDescription Nightjars = new SilhouetteDescription("Nightjars", "6 types in Madhya Pradesh", R.drawable.silhouette_adjutant);
        birdList.add(Nightjars);

        //Swifts
        SilhouetteDescription Swifts = new SilhouetteDescription("Swifts", "8 types in Madhya Pradesh", R.drawable.silhouette_geese);
        birdList.add(Swifts);

        //Pigeons
        SilhouetteDescription Pigeon = new SilhouetteDescription("Pigeons", "6 types in Madhya Pradesh", R.drawable.silhoutte_pochard);
        birdList.add(Pigeon);

        //doves
        SilhouetteDescription Doves = new SilhouetteDescription("Doves", "7 types in Madhya Pradesh", R.drawable.silhouette_flamingo);
        birdList.add(Doves);

        //Trogan
        SilhouetteDescription Trogan = new SilhouetteDescription("Trogan", "1 type in Madhya Pradesh", R.drawable.silhouette_flamingo);
        birdList.add(Trogan);

        //Coucal
        SilhouetteDescription Coucal = new SilhouetteDescription("Coucals", "1 type in Madhya Pradesh", R.drawable.silhoutte_pochard);
        birdList.add(Coucal);
        //Drongo
        SilhouetteDescription Drongo = new SilhouetteDescription("Drongo", "6 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Drongo);

        //Fantail
        SilhouetteDescription Fantail = new SilhouetteDescription("Fantails", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Fantail);

        //Malkoha
        SilhouetteDescription Malkoha = new SilhouetteDescription("Malkohas", "3 types in Madhya Pradesh", R.drawable.silhouette_geese);
        birdList.add(Malkoha);

        //Cuckoo
        SilhouetteDescription Cuckoo = new SilhouetteDescription("Cuckoos", "12 types in Madhya Pradesh", R.drawable.silhoeutte_stork);
        birdList.add(Cuckoo);


        //Osprey
        SilhouetteDescription Osprey = new SilhouetteDescription("Osprey", "1 type in Madhya Pradesh", R.drawable.silhouette_ibis);
        birdList.add(Osprey);

        //Kite
        SilhouetteDescription Kite = new SilhouetteDescription("Kites", "3 types in Madhya Pradesh", R.drawable.silhouette_spoonbill);
        birdList.add(Kite);

        //Buzzard
        SilhouetteDescription Buzzard = new SilhouetteDescription("Buzzards", "4 types in Madhya Pradesh", R.drawable.silhouette_stilt);
        birdList.add(Buzzard);

        //Vulture
        SilhouetteDescription Vulture = new SilhouetteDescription("Vultures", "6 types in Madhya Pradesh", R.drawable.silhouette_snipe);
        birdList.add(Vulture);

        //Eagle
        SilhouetteDescription Eagle = new SilhouetteDescription("Eagles", "18 types in Madhya Pradesh", R.drawable.silhouette_jacana);
        birdList.add(Eagle);

        //Hen Harrier
        SilhouetteDescription Harrier = new SilhouetteDescription("Harriers", "1 type in Madhya Pradesh", R.drawable.silhouette_skimmer);
        birdList.add(Harrier);

        //Shikra
        SilhouetteDescription Shikra = new SilhouetteDescription("Shikra & Besra", "2 types in Madhya Pradesh", R.drawable.silhouette_gull);
        birdList.add(Shikra);

        //Sparrowhawk
        SilhouetteDescription Sparrowhawk = new SilhouetteDescription("Sparrowhawks & Goshawks", "3 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Sparrowhawk);

        //Weaver
        SilhouetteDescription Weaver = new SilhouetteDescription("Weavers", "4 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Weaver);

        //Avadavat
        SilhouetteDescription Avadavat = new SilhouetteDescription("Avadavats", "2 type in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Avadavat);

        //Owl
        SilhouetteDescription Owls = new SilhouetteDescription("Owls & Owlets", "20 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Owls);

        //bee-eater
        SilhouetteDescription Bee_eater = new SilhouetteDescription("Bee-eaters", "6 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Bee_eater);

        //Rollers
        SilhouetteDescription Rollers = new SilhouetteDescription("Rollers", "20 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Rollers);

        //Falcon
        SilhouetteDescription Falcons = new SilhouetteDescription("Falcons", "5 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Falcons);

        //Kestrels
        SilhouetteDescription Kestrels = new SilhouetteDescription("Kestrels", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Kestrels);

        //Hobby
        SilhouetteDescription Hobby = new SilhouetteDescription("Hobby", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Hobby);

        //Shrike
        SilhouetteDescription Shrike = new SilhouetteDescription("Shrikes", "6 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Shrike);

        //Buntings
        SilhouetteDescription Buntings = new SilhouetteDescription("Buntings", "8 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Buntings);

        //Crows
        SilhouetteDescription Crows = new SilhouetteDescription("Crows", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Crows);

        //Monarch
        SilhouetteDescription Monarch = new SilhouetteDescription("Monarch", "1 type in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Monarch);

        //Flycatcher
        SilhouetteDescription Flycatcher = new SilhouetteDescription("Flycatcher", "1 type in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Flycatcher);

        //Sunbirds
        SilhouetteDescription Sunbirds = new SilhouetteDescription("Sunbirds", "4 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Sunbirds);

        //Leafbird
        SilhouetteDescription Leafbird = new SilhouetteDescription("Leafbird & Bluebird", "4 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Leafbird);

        //Sparrows
        SilhouetteDescription Sparrows = new SilhouetteDescription("Sparrows", "3 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Sparrows);

        //Larks
        SilhouetteDescription Larks = new SilhouetteDescription("Larks", "12 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Larks);

        //Cisticola
        SilhouetteDescription Cisticola = new SilhouetteDescription("Cisticola", "2 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Cisticola);

        // Martin
        SilhouetteDescription Martin = new SilhouetteDescription("Martin", "7 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Martin);

        //Swallows
        SilhouetteDescription Swallows = new SilhouetteDescription("Swallows", "5 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Swallows);

        //Prinia
        SilhouetteDescription Prinia = new SilhouetteDescription("Prinia", "6 types in Madhya Pradesh", R.drawable.silhouette_turn);
        birdList.add(Prinia);


    }

    //Madhya Pradesh End

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private mpWater.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final mpWater.ClickListener clickListener) {
            this.clickListener = clickListener;
            gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

                @Override
                public void onLongPress(MotionEvent e) {
                    View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                    if (child != null && clickListener != null) {
                        clickListener.onLongClick(child, recyclerView.getChildPosition(child));
                    }
                }
            });
        }

        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

            View child = rv.findChildViewUnder(e.getX(), e.getY());
            if (child != null && clickListener != null && gestureDetector.onTouchEvent(e)) {
                clickListener.onClick(child, rv.getChildPosition(child));
            }
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

        }
    }

}