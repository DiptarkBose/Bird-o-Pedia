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

public class DucksInMp extends AppCompatActivity {
    private BirdAdapter adapter;
    private List<BirdDescription> birdList = new ArrayList<>();
    // private List<SilhouetteDescription> filteredList=new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ducks_in_mp);

        // add the custom view to the action bar

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_ducks_list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        //recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        adapter = new BirdAdapter(birdList, this);
        recyclerView.setAdapter(adapter);
        Intent i = getIntent();
        final String speciesname = i.getStringExtra("name");
        final String Statename = i.getStringExtra("state");

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {

                //MP DUCKS
                if (speciesname.equalsIgnoreCase("Ducks")) {
                    if (position == 0) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.f_whistling_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 1) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The lesser whistling duck (Dendrocygna javanica), also known as Indian whistling duck or lesser whistling teal, is a species of whistling duck that breeds in the Indian Subcontinent and Southeast Asia. They are nocturnal feeders and during the day may be found in flocks around lakes and wet paddy fields. They can perch on trees and sometimes build their nest in the hollow of a tree. This brown and long-necked duck has broad wings that are visible in flight and produces a loud two-note wheezy call. It has a chestnut rump, differentiating it from its larger relative, the fulvous whistling duck, which has a creamy white rump." +
                                "This is a largely resident species distributed widely across lowland wetlands of the Indian Subcontinent and Southeast Asia. The species ranges across India, Nepal, Sri Lanka, Malaysia, Singapore, Indonesia, Myanmar, Thailand and Vietnam. They also occur on islands in the region including the Andamans, Nicobars and Maldives.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.l_whistling_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }
                    if (position == 2) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.tufted_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }
                    if (position == 3) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.falcated_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }
                    if (position == 4) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.pink_headed_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }
                    if (position == 5) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.comb_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 6) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.ferrugnios_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 7) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.indian_spot_billed_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }
                }

                if (speciesname.equalsIgnoreCase("Geese")) {
                    if (position == 0) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.f_whistling_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 1) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The lesser whistling duck (Dendrocygna javanica), also known as Indian whistling duck or lesser whistling teal, is a species of whistling duck that breeds in the Indian Subcontinent and Southeast Asia. They are nocturnal feeders and during the day may be found in flocks around lakes and wet paddy fields. They can perch on trees and sometimes build their nest in the hollow of a tree. This brown and long-necked duck has broad wings that are visible in flight and produces a loud two-note wheezy call. It has a chestnut rump, differentiating it from its larger relative, the fulvous whistling duck, which has a creamy white rump." +
                                "This is a largely resident species distributed widely across lowland wetlands of the Indian Subcontinent and Southeast Asia. The species ranges across India, Nepal, Sri Lanka, Malaysia, Singapore, Indonesia, Myanmar, Thailand and Vietnam. They also occur on islands in the region including the Andamans, Nicobars and Maldives.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.l_whistling_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }
                    if (position == 2) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.tufted_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }
                    if (position == 3) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.falcated_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }
                    if (position == 4) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.pink_headed_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }
                    if (position == 5) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.comb_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 6) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.ferrugnios_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 7) {
                        String str = "Dendrocygna bicolor";
                        int bird_call = R.raw.fulvous_whistling_duck;
                        String description = "The fulvous whistling duck or fulvous tree duck (Dendrocygna bicolor) is a whistling duck that breeds across the world's tropical regions in much of Mexico and South America, the West Indies, the southern US, sub-Saharan Africa and the Indian subcontinent. It has mainly reddish brown plumage, long legs and a long grey bill, and shows a distinctive white band across its black tail in flight. Like other members of its ancient lineage, it has a whistling call which is given in flight or on the ground. The preferred habitat is shallow lakes, paddy fields or other wetlands with plentiful vegetation.\n" +
                                "\n" +
                                "The nest, built from plant material and unlined, is placed among dense vegetation or in a tree hole. The typical clutch is around ten whitish eggs. The breeding adults, which pair for life, take turns to incubate, and the eggs hatch in 24–29 days. The downy grey ducklings leave the nest within a day or so of hatching, but the parents continue to protect them until they fledge around nine weeks later.\n" +
                                "\n" +
                                "The fulvous whistling duck feeds in wetlands by day or night on seeds and other parts of plants. It is sometimes regarded as a pest of rice cultivation, and is also shot for food in parts of its range. Despite hunting, poisoning by pesticides and natural predation by mammals, birds and reptiles, the large numbers and huge range of this duck mean that it is classified as Least Concern by the International Union for Conservation of Nature (IUCN).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.indian_spot_billed_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }



                }
                if (speciesname.equalsIgnoreCase("Coucal")) {
                    if (position == 0) {
                        String str = "Centropus sinensis";
                        int bird_call = R.raw.g_cou;
                        String description = "The greater coucal or crow pheasant (Centropus sinensis), is a large non-parasitic member of the cuckoo order of birds, the Cuculiformes. A widespread resident in Asia, from India, east to south China, Nepal and Indonesia, it is divided into several subspecies, some being treated as full species. They are large, crow-like with a long tail and coppery brown wings and found in wide range of habitats from jungle to cultivation and urban gardens. \nThey are weak fliers, and are often seen clambering about in vegetation or walking on the ground as they forage for insects, eggs and nestlings of other birds. \n" +
                                "They have a familiar deep resonant call which is associated with omens in many parts of its range." + "\nThis is a large species of cuckoo at 48 cm. The head is black, upper mantle and underside are black glossed with purple. The back and wings are chestnut brown. There are no pale shaft streaks on the coverts. The eyes are ruby red. Juveniles are duller black with spots on the crown and there are whitish bars on the underside and tail. There are several geographic races and some of these populations are sometimes treated as full species. Earlier treatments included the brown coucal (C. (s.) andamanensis) under this name. Rasmussen & Anderton (2005) suggest that the race parroti may be a full species – the southern coucal which is found in peninsular India (northern boundary unclear). The race intermedius of the Assam and Bangladesh region is smaller than the nominate race found in the sub-Himalayan zone. Songs of the races are said to vary considerably. \n" +
                                "Race parroti of southern India has a black head and the underparts glossed blue and has the forehead, face and throat more brownish.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.gr_co);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }


                }

                if (speciesname.equalsIgnoreCase("Malkohas")) {
                    if (position == 0) {
                        String str = "Phaenicophaeus leschenaultii";
                        int bird_call = R.raw.si_malk;
                        String description = "The sirkeer malkoha or sirkeer cuckoo (Phaenicophaeus leschenaultii), is a member of the cuckoo order of birds, the Cuculiformes, which also includes the roadrunners, the anis, and the hoatzin. \n" +
                                "It is a resident bird in the Indian subcontinent.\n"+ "All of the sub-Himalayan Indian subcontinent, Bangladesh, Sri Lanka; patchy in Pakistan and Rajasthan. \nSometimes considered as three races, varying in colouration.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.si_malk);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 1) {
                        String str = "Phaenicophaeus viridirostris";
                        int bird_call = R.raw.si_malk;
                        String description = "The blue-faced malkoha (Phaenicophaeus viridirostris) is a member of the cuckoo order of birds, the Cuculiformes, which also includes the roadrunners, the anis, and the hoatzin.\n" +
                                "\n" +
                                "It is restricted to Sri Lanka and southern India. The blue-faced malkoha is a bird of open forests and scrub jungle. It nests in a thorn bush, the typical clutch being two, sometimes three, eggs.\n" +
                                "\n" +
                                "This is a largish species at 39 cm. Its back and head are dark green, and the uppertail is green edged with white. The throat and belly are lighter green. There is a large blue patch around the eye and the bill is green. Sexes are similar, but juveniles are duller and barred above.This is commonly seen in plathottam,india.So plathottam is famous for malkohas.\n" +
                                "\n" +
                                "The blue-faced malkoha takes a variety of insects, caterpillars and small vertebrates. It occasionally eats berries.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.bl_malk);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 2) {
                        String str = "Phaenicophaeus tristis";
                        int bird_call = R.raw.g_malk;
                        String description = "The green-billed malkoha (Phaenicophaeus tristis) is a species of non-parasitic cuckoo found throughout South and Southeast Asia. The birds are waxy bluish black with a long graduated tail with white tips to the tail feathers. \n" +
                                "The bill is prominent and curved. These birds are found in dry scrub and thin forests.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.gr_malk);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }


                }

                if (speciesname.equalsIgnoreCase("Plovers")) {
                    if (position == 0) {
                        String str = "Pluvialis squatarola";
                        int bird_call = R.raw.g_plo;
                        String description = " The grey plover (Pluvialis squatarola), known as the black-bellied plover in North America, is a medium-sized plover breeding in Arctic regions. It is a long-distance migrant, with a nearly worldwide coastal distribution when not breeding.\n" +
                                "The genus name is Latin and means relating to rain, from pluvia, \"rain\". It was believed that golden plovers flocked when rain was imminent. The species name squatarola is a Latinised version of Sgatarola, a Venetian name for some kind of plover. \nThey are 27–30 cm (11–12 in) long with a wingspan of 71–83 cm (28–33 in) and a weight of 190–280 g (6.7–9.9 oz) (up to 345 g (12.2 oz) in preparation for migration). In spring and summer (late April or May to August), the adults are spotted black and white on the back and wings. The face and neck are black with a white border; they have a black breast and belly and a white rump. The tail is white with black barring. The bill and legs are black. They moult to winter plumage in mid August to early September and retain this until April; this being a fairly plain grey above, with a grey-speckled breast and white belly. The juvenile and first-winter plumages, held by young birds from fledging until about one year old, are similar to the adult winter plumage but with the back feathers blacker with creamy white edging. In all plumages, the inner flanks and axillary feathers at the base of the underwing are black, a feature which readily distinguishes it from the other three Pluvialis species in flight. " +
                                "On the ground, it can also be told from the other Pluvialis species by its larger (24–34 mm (0.94–1.34 in)), heavier bill.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.gr_plo);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 1) {
                        String str = "Pluvialis fulva";
                        int bird_call = R.raw.p_plo;
                        String description = "The Pacific golden plover (Pluvialis fulva) is a medium-sized plover. The genus name is Latin and means relating to rain, from pluvia, \"rain\". It was believed that golden plovers flocked when rain was imminent. The species name fulva is Latin and refers to a tawny colour.[2]\n" +
                                "\n" +
                                "The 23–26 cm long breeding adult is spotted gold and black on the crown, and back on the wings. Its face and neck are black with a white border, and it has a black breast and a dark rump. The legs are black. In winter, the black is lost and the plover then has a yellowish face and breast, and white underparts.\n" +
                                "\n" +
                                "It is similar to two other golden plovers: the Eurasian and American plovers. The Pacific golden plover is smaller, slimmer and relatively longer-legged than the European golden plover, Pluvialis apricaria, which also has white axillary (armpit) feathers. Overall, the Pacific golden plover is found to be more similar to the American golden plover, Pluvialis dominica, with which it was once considered conspecific as \"lesser golden plover\".[3] The Pacific golden plover is slimmer than the American species, has a shorter primary projection, longer legs, and is usually found to have more yellow on the back.\n" +
                                "\n" +
                                "This wader forages for food on tundra, fields, beaches and tidal flats, usually by sight. It eats insects and crustaceans and some berries.\n" +
                                "\n" +
                                "The breeding habitat of Pacific golden plover is the Arctic tundra from northernmost Asia into western Alaska. It nests on the ground in a dry open area.\n" +
                                "\n" +
                                "It is migratory and winters in south Asia and Australasia. A few winter in California and Hawaii, USA. In Hawaii, the bird is known as the kōlea. It is very rare vagrant to western Europe. They return to the same wintering territory each year, which allowed scientists in Hawaii to attach tiny light level geolocator devices to the birds and then retrieve them the following year in the same location. This research revealed that these birds make the 4800 km non-stop flight between Alaska and Hawaii in 3–4 days.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.gol_plo);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 2) {
                        String str = "Charadrius hiaticula";
                        int bird_call = R.raw.co_r_plo;
                        String description = "The common ringed plover or ringed plover (Charadrius hiaticula) is a small plover that breeds in Arctic Eurasia. \n" +
                                "The genus name Charadrius is a Late Latin word for a yellowish bird mentioned in the fourth-century Vulgate. It derives from Ancient Greek kharadrios a bird found in ravines and river valleys (kharadra, \"ravine\"). The specific hiaticula is Latin and has a similar meaning to the Greek term, coming from hiatus, (colere, to dwell)";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.ri_plo);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 3) {
                        String str = "Charadrius placidus";
                        int bird_call = R.raw.lo_plo;
                        String description = "The long-billed plover (Charadrius placidus) is a species of bird in the Charadriidae family. It is found in Bangladesh, Bhutan, Brunei, Cambodia, China, Hong Kong, India, Indonesia, Japan, North Korea, South Korea, Laos, Malaysia, Mongolia, Myanmar, Nepal, Russia, Sri Lanka, Taiwan, Thailand, and Vietnam.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.l_b_plo);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 4) {
                        String str = "Charadrius dubius";
                        int bird_call = R.raw.l_r_plo;
                        String description = "The little ringed plover (Charadrius dubius) is a small plover. The genus name Charadrius is a Late Latin word for a yellowish bird mentioned in the fourth-century Vulgate. It derives from Ancient Greek kharadrios a bird found in river valleys (kharadra, \"ravine\"). \n" +
                                "The specific dubius is Latin for doubtful, since Sonnerat, writing in 1776, thought this bird " +
                                "might be just a variant of common ringed plover.\n" +
                                "Adults have a grey-brown back and wings, a white belly and a white breast with one black neckband. They have a brown cap, a white forehead, a black mask around the eyes with white above and a short dark bill. The legs are flesh-coloured and the toes are all webbed.\n" +
                                "\n" +
                                "This species differs from the larger ringed plover in leg colour, the head pattern, and the presence of a clear yellow eye-ring.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.li_r_plo);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 5) {
                        String str = "Charadrius alexandrinus";
                        int bird_call = R.raw.k_plo;
                        String description = "The Kentish plover (Charadrius alexandrinus) is a small wader in the plover bird family. The genus name Charadrius is a Late Latin word for a yellowish bird mentioned in the fourth-century Vulgate. It derives from Ancient Greek kharadrios a bird found in ravines and river valleys (kharadra, \"ravine\"). \n" +
                                "The specific alexandrinus is Latin and refers to Alexandria.\n" +
                                "Despite its name, this species no longer breeds in Kent, or even Great Britain. It breeds in a wide range, from southern Europe to Japan and in Ecuador, Peru, Chile, the southern United States and the Caribbean.\n" +
                                "The North American Committee of the American Ornithologists' Union and the IOC World Bird List have voted on or before July 2011 to split the American forms into a new species snowy plover, however, no other committee has voted to change taxonomy yet. In that light, the American forms can now be found under a separate species listing snowy plover,\n" +
                                "The Kentish plover is 15–17 cm long. It is smaller, paler, longer-legged and thinner-billed than ringed plover or semipalmated plover. Its breast band is never complete, and usually just appears as dark lateral patches on the sides of the breast. The Kentish plover's upperparts are greyish brown and the underparts white in all plumages. The breast markings are black in summer adults, otherwise brown. Breeding males of some races have a black forehead bar and a black mask through the eye. The legs are black. In flight, the flight feathers are blackish with a strong white wing bar. The flight call is a sharp bip.\n" +

                                "This species breeds on sandy coasts and brackish inland lakes, and is uncommon on fresh water. It nests in a ground scrape and lays three to five eggs.\n" +
                                "\n" +
                                "The breeding birds in warmer countries are largely sedentary, but northern and inland populations are migratory, wintering south to the tropics.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.ke_plo);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 6) {
                        String str = "Charadrius dubius";
                        int bird_call = R.raw.l_r_plo;
                        String description = "The little ringed plover (Charadrius dubius) is a small plover. The genus name Charadrius is a Late Latin word for a yellowish bird mentioned in the fourth-century Vulgate. It derives from Ancient Greek kharadrios a bird found in river valleys (kharadra, \"ravine\"). \n" +
                                "The specific dubius is Latin for doubtful, since Sonnerat, writing in 1776, thought this bird " +
                                "might be just a variant of common ringed plover.\n" +
                                "Adults have a grey-brown back and wings, a white belly and a white breast with one black neckband. They have a brown cap, a white forehead, a black mask around the eyes with white above and a short dark bill. The legs are flesh-coloured and the toes are all webbed.\n" +
                                "\n" +
                                "This species differs from the larger ringed plover in leg colour, the head pattern, and the presence of a clear yellow eye-ring.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.li_r_plo);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 7) {
                        String str = "Charadrius alexandrinus";
                        int bird_call = R.raw.k_plo;
                        String description = "The Kentish plover (Charadrius alexandrinus) is a small wader in the plover bird family. The genus name Charadrius is a Late Latin word for a yellowish bird mentioned in the fourth-century Vulgate. It derives from Ancient Greek kharadrios a bird found in ravines and river valleys (kharadra, \"ravine\"). \n" +
                                "The specific alexandrinus is Latin and refers to Alexandria.\n" +
                                "Despite its name, this species no longer breeds in Kent, or even Great Britain. It breeds in a wide range, from southern Europe to Japan and in Ecuador, Peru, Chile, the southern United States and the Caribbean.\n" +
                                "The North American Committee of the American Ornithologists' Union and the IOC World Bird List have voted on or before July 2011 to split the American forms into a new species snowy plover, however, no other committee has voted to change taxonomy yet. In that light, the American forms can now be found under a separate species listing snowy plover,\n" +
                                "The Kentish plover is 15–17 cm long. It is smaller, paler, longer-legged and thinner-billed than ringed plover or semipalmated plover. Its breast band is never complete, and usually just appears as dark lateral patches on the sides of the breast. The Kentish plover's upperparts are greyish brown and the underparts white in all plumages. The breast markings are black in summer adults, otherwise brown. Breeding males of some races have a black forehead bar and a black mask through the eye. The legs are black. In flight, the flight feathers are blackish with a strong white wing bar. The flight call is a sharp bip.\n" +

                                "This species breeds on sandy coasts and brackish inland lakes, and is uncommon on fresh water. It nests in a ground scrape and lays three to five eggs.\n" +
                                "\n" +
                                "The breeding birds in warmer countries are largely sedentary, but northern and inland populations are migratory, wintering south to the tropics.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.ke_plo);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 8) {
                        String str = "Charadrius mongolus";
                        int bird_call = R.raw.l_s_plo;
                        String description = "The lesser sand plover (Charadrius mongolus) is a small wader in the plover family of birds. The spelling is commonly given as lesser sandplover, but the official British Ornithologists' Union spelling is \"lesser sand plover\". The genus name Charadrius is a Late Latin word for a yellowish bird mentioned in the fourth-century Vulgate. It derives from Ancient Greek kharadrios a bird found in ravines and river valleys (kharadra, \"ravine\").\n" +
                                " The specific mongolus is Latin and refers to Mongolia which at the time of naming referred to a larger area than the present country.\n" +
                                "There are five races, and the large east Asian forms, C. m. mongolus and C. m. stegmanni, are sometimes given specific status as Mongolian plovers, Charadrius mongolus.[3] If the taxonomic split is accepted, lesser sand plover as then defined becomes Charadrius atrifrons, including the three races atrifrons, pamirensis and schaeferi.\n" +
                                "\n" +
                                "It breeds above the tree line in the Himalayas and discontinuously across to bare coastal plains in north-eastern Siberia, with the Mongolian plover in the eastern part of the range; it has also bred in Alaska. It nests in a bare ground scrape, laying three eggs. This species is strongly migratory, wintering on sandy beaches in east Africa, south Asia and Australasia. It is a very rare vagrant in western Europe, but of the three individuals recorded in Great Britain up to 2003, one was a Mongolian plover.\n" +
                                "\n" +
                                "This chunky plover is long-legged and long-billed. Breeding males have grey backs and white underparts. The breast, forehead and nape are chestnut, and there is a black eye mask. The female is duller, and winter and juvenile birds lack the chestnut, apart from a hint of rufous on the head. Legs are dark and the bill black.\n" +
                                "\n" +
                                "In all plumages, this species is very similar to the greater sand plover, Charadrius leschenaultii. Separating the species may be straightforward in mixed wintering flocks on an Indian beach, where the difference in size and structure is obvious; it is more difficult to identify a lone vagrant to western Europe, where both species are very rare. The problem is compounded in that the Middle Eastern race of greater sand plover is the most similar to the lesser. The lesser usually has darker legs, a white forehead, and a more even white wing bar than the greater.\n" +
                                "\n" +
                                "The lesser sand plover's feeds on insects, crustaceans and annelid worms, which are obtained by a run-and-pause technique, rather than the steady probing of some other wader groups. This species takes fewer steps and shorter pauses than the greater sand plover when feeding.\n" +
                                "\n" +
                                "The flight call is a hard trill.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.le_sa_plo);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 9) {
                        String str = "Charadrius leschenaultii";
                        int bird_call = R.raw.gr_sa_plo;
                        String description = "The greater sand plover (Charadrius leschenaultii) is a small wader in the plover family of birds. The spelling is commonly given as \"greater sandplover\" or \"greater sand-plover\", but the official British Ornithologists' Union spelling is \"Greater Sand Plover\".[2] The genus name Charadrius is a Late Latin word for a yellowish bird mentioned in the fourth-century Vulgate. It derives from Ancient Greek kharadrios a bird found in ravines and river valleys (kharadra, \"ravine\"). \n" +
                                "The specific leschenaultii commemorates the French botanist Jean Baptiste Leschenault de la Tour.\n" +
                                "It breeds in the semi-deserts of Turkey and eastwards through Central Asia. It nests in a bare ground scrape. This species is strongly migratory, wintering on sandy beaches in east Africa, south Asia and Australasia. It is a rare vagrant in western Europe, where it has been recorded as far west as Great Britain, France and Iceland. It has been spotted twice in North America, the most recent being on May 14, 2009, in Jacksonville, Florida.\n" +
                                "This chunky plover is long-legged and thick-billed. Breeding males have grey backs and white underparts. The breast, forehead and nape are chestnut, and there is a black eye mask. The female is duller, and winter and juvenile birds lack the chestnut, apart from a hint of rufous on the head. Legs are greenish and the bill black.\n" +
                                "\n" +
                                "In all plumages, it is very similar to lesser sand plover, Charadrius mongolus. Separating the species may be straightforward in mixed wintering flocks on an Indian beach, where the difference in size and structure is obvious; it is another thing altogether to identify a lone vagrant to western Europe, where both species are very rare. The problem is compounded in that the Middle Eastern race of the greater sand plover is the most similar to the lesser species.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.gr_sa_plo);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }
                }

                if (speciesname.equalsIgnoreCase("Lapwings")) {
                    if (position == 0) {
                        String str = "Vanellus vanellus";
                        int bird_call = R.raw.no_la;
                        String description = "The northern lapwing (Vanellus vanellus), also known as the peewit, pewit, tuit or tew-it (imitative of its cry), green plover (emphasising the colour of the plumage) or (in the British Isles) just lapwing (which refers to its peculiar, erratic way of flying), is a bird in the lapwing family. It is common through temperate Eurasia.\n" +
                                "\n" +
                                "It is highly migratory over most of its extensive range, wintering further south as far as north Africa, northern India, Pakistan, and parts of China. It migrates mainly by day, often in large flocks. Lowland breeders in westernmost areas of Europe are resident. It occasionally is a vagrant to North America, especially after storms, as in the Canadian sightings after storms in December 1927 and in January 1966.[2]\n" +
                                "\n" +
                                "It is a wader which breeds on cultivated land and other short vegetation habitats. 3–4 eggs are laid in a ground scrape. The nest and young are defended noisily and aggressively against all intruders, up to and including horses and cattle.\n" +
                                "\n" +
                                "In winter, it forms huge flocks on open land, particularly arable land and mud-flats.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.nor_lap);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 1) {
                        String str = "Vanellus duvaucelii";
                        int bird_call = R.raw.ri_la;
                        String description = "The river lapwing (Vanellus duvaucelii) is a lapwing species which breeds from the Indian Subcontinent eastwards to Southeast Asia. \n" +
                                "It range includes much of northern and northeastern India, stretching towards Myanmar, to Cambodia, Thailand and Vietnam. It appears to be entirely sedentary. Formerly also called spur-winged lapwing, this name is better reserved for one of the \"spur-winged plovers\" of old, Vanellus spinosus of Africa, whose scientific name it literally translates. The masked lapwing of Australasia was at one time also called \"spur-winged plover\", completing the name confusion - particularly as none of these is a plover in the strict sense.\n" +
                                "\n" +
                                "This species resembles the closely related spur-winged lapwing of Africa, and has sometimes been considered conspecific. The species name commemorates Alfred Duvaucel.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.riv_lap);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 2) {
                        String str = "Vanellus malabaricus";
                        int bird_call = R.raw.y_la;
                        String description = "(The yellow-wattled lapwing (Vanellus malabaricus) is a lapwing that is endemic to the Indian Subcontinent. It is found mainly on the dry plains of peninsular India and has a sharp call and is capable of fast flight. Although they do not migrate, they are known to make seasonal movements in response to rains.\n" +
                                " They are dull grey brown with a black cap, yellow legs and a triangular wattle at the base of the beak. Like other lapwings and plovers, they are ground birds and their nest is a mere collection of tiny pebbles within which their well camouflaged eggs are laid. \n" +
                                "The chicks are nidifugous, leaving the nest shortly after hatching and following their parents to forage for food.)";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.ye_lap);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 3) {
                        String str = "Vanellus cinereus";
                        int bird_call = R.raw.wh_la;
                        String description = "The grey-headed lapwing (Vanellus cinereus) is a lapwing species which breeds in northeast China and Japan. The mainland population winters in northern Southeast Asia from northeastern India to Cambodia. The Japanese population winters, at least partially, in southern Honshū.\n" +
                                "\n" +
                                "This species has occurred as a vagrant in Russia, the Philippines, Indonesia and New South Wales, Australia.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.gr_lap);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 4) {
                        String str = "Vanellus indicus";
                        int bird_call = R.raw.re_la;
                        String description = "The red-wattled lapwing (Vanellus indicus) is a lapwing or large plover, a wader in the family Charadriidae. \n" +
                                "It has characteristic loud alarm calls which are variously rendered as did he do it or pity to do it leading to colloquial names like the did-he-do-it bird.Red-wattled lapwings are large waders, about 35 cm long. The wings and back are light brown with a purple sheen, but head and chest and front part of neck are black. Prominently white patch runs between these two colours, from belly and tail, flanking the neck to the sides of crown. Short tail is tipped black. A red fleshy wattle in front of each eye, black-tipped red bill, and the long legs are yellow. \n" +
                                "In flight, prominent white wing bars formed by the white on the secondary coverts.Usually seen in pairs or small groups not far from water but may form large flocks in the non-breeding season (winter).";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.re_lap);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 5) {
                        String str = "Vanellus gregariu";
                        int bird_call = R.raw.so_la;
                        String description = "The sociable lapwing or sociable plover (Vanellus gregarius) is a critically endangered wader in the lapwing family of birds. The genus name is Medieval Latin for a lapwing and derives from vannus a winnowing fan.\n" +
                                " The specific gregarius is Latin for \"sociable\" from grex, gregis, \"flock\".\n" +
                                "This medium-sized lapwing has longish black legs and a short black bill. Summer adults have grey backs and breast, dark belly and white undertail. The head has a striking pattern, with a black crown and eyestripe, the latter being bordered above and below with white. The upper neck is ochre. Its longish black legs, white tail with a black terminal band and distinctive brown, white and grey wings make it almost unmistakable in flight. Length is 27–30 cm (11–12 in). The call is a harsh kereck.\n" +
                                "\n" +
                                "Winter adults have a less distinct head pattern, slightly browner back and breast, and white belly. Young birds have a scaly back and only traces of the head pattern.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.so_lap);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }

                    if (position == 6) {
                        String str = "Vanellus leucurus";
                        int bird_call = R.raw.wh_la;
                        String description = "The white-tailed lapwing or white-tailed plover (Vanellus leucurus) is a wader in the lapwing genus. The genus name Vanellus is Medieval Latin for a lapwing and derives from vannus a winnowing fan. The specific leucurus is from Ancient Greek leukouros, \"white-tailed\".[2]\n" +
                                "\n" +
                                "This medium-sized lapwing is long-legged and fairly long-billed. It is the only lapwing likely to be seen in other than very shallow water, where it picks insects and other small prey mainly from the surface.\n" +
                                "\n" +
                                "Adults are slim erect birds with a brown back and foreneck, paler face and grey breast. Its long yellow legs, pure white tail and distinctive brown, white and black wings make this species unmistakable. Young birds have a scaly back, and may show some brown in the tail.\n" +
                                "\n" +
                                "The breeding season call is a peewit, similar to northern lapwing.\n" +
                                "\n" +
                                "It breeds semi-colonially on inland marshes in Iraq, Iran and southern Russia. Four eggs are laid in a ground nest. The Iraqi and Iranian breeders are mainly residents, but Russian birds migrate south in winter to the Indian Subcontinent, the Middle East and north east Africa. It is a very rare vagrant in western Europe, the first example in Britain being found at Packington, Warwickshire on 12 July 1975.\n" +
                                "\n" +
                                "The white-tailed lapwing is one of the species to which the Agreement on the Conservation of African-Eurasian Migratory Waterbirds (AEWA) applies.";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.wh_lap);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }


                    if (speciesname.equalsIgnoreCase("Cuckoos")) {
                        if (position == 0) {
                            String str = "Clamator jacobinus";
                            int bird_call = R.raw.j_cuc;
                            String description = "The Jacobin cuckoo, pied cuckoo, or pied crested cuckoo (Clamator jacobinus) is a member of the cuckoo order of birds that is found in Africa and Asia. \n" +
                                    "It is partially migratory and in India, it has been considered a harbinger of the monsoon rains due to the timing of its arrival.\n" +
                                    " It has been associated with a bird in Indian mythology and poetry, known as the chatak (Sanskrit: चातक) represented as a bird with a beak on its head that waits for rains to quench its thirst.\n" +
                                    "This medium-sized, slim black and white cuckoo with a crest is distinctive. The white wing patch on the black wing and the pattern make it unmistakable even in flight. They are very vocal during the breeding season. \n" +
                                    "The call is a ringing series of whistling notes \"piu-piu\" with the calls of the nominate form more rapid and slightly mellower.In India the subspecies serratus (Sparrman, 1786) is a summer breeding visitor to northern India and is believed to migrate to southern Africa. This is larger and longer winged than the nominate subspecies found in the southern peninsular region and Sri Lanka is said to be a local migrant.[6] No ringing evidence exists to support the actual migration to Africa.";
                            Intent intent = new Intent(DucksInMp.this, test.class);
                            BirdDescription obj = birdList.get(position);
                            intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                            intent.putExtra("image-res", R.drawable.j_cuc);
                            intent.putExtra("scientific_bird", str);
                            intent.putExtra("bird_call", bird_call);
                            intent.putExtra("description", description);
                            startActivity(intent);
                        }

                        if (position == 1) {
                            String str = "Clamator coromandus";
                            int bird_call = R.raw.c_w_cuc;
                            String description = "The chestnut-winged cuckoo or red-winged crested cuckoo (Clamator coromandus) is a cuckoo found in Southeast Asia and parts of South Asia. It has dark glossy upperparts, a black head with long crest chestnut wings, a long graduated glossy black tail, rufous throat dusky underside and a narrow white nuchal half collar. \n" +
                                    "They breed along the Himalayas and migrate south in winter to Sri Lanka, southern India and tropical Southeast Asia including parts of Indonesia, Thailand and the Philippines. It is about 47 cm long.\n" +
                                    "This dark and crested cuckoo has chestnut wings, a glossy black crest and a graduated tail (the feathers shortening in steps from the center outwards) whose terminal edges are white and inconspicuous unlike the white tips of the Jacobin cuckoo which is found in parts of its range. The black capping on the head is broken from black of the back by a white collar that extends to the sides of the neck. The lower parts are rufous turning to dark grey towards the vent.\n" +
                                    "Young birds are dusky with a scaly appearance to the wing feathers.";
                            Intent intent = new Intent(DucksInMp.this, test.class);
                            BirdDescription obj = birdList.get(position);
                            intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                            intent.putExtra("image-res", R.drawable.c_w_cuc);
                            intent.putExtra("scientific_bird", str);
                            intent.putExtra("bird_call", bird_call);
                            intent.putExtra("description", description);
                            startActivity(intent);
                        }

                        if (position == 2) {
                            String str = "Charadrius hiaticula";
                            int bird_call = R.raw.b_b_cuc;
                            String description = "The banded bay cuckoo or bay-banded cuckoo (Cacomantis sonneratii) is a species of small cuckoo found in the Indian subcontinent and Southeast Asia. Like others in the genus they have a round nostril. They are usually founded in well wooded areas mainly in the lower hills. Males sing from exposed branches during the breeding season, which can vary with region.\n" +
                                    " They are distinctive both in their calls as well as plumage with a white eyebrowed appearance and the rufous upperparts with regular dark bands and the whitish underside with fine striations.\n" +
                                    "The adults are bright rufous or bay on the head and back and are broadly barred with dark brown. The bill is long and slightly curved. A whitish supercilium is distinctive above a dark eye-line. The wing is darker and tail is graduated with a dark brown centre. The tail has a subterminal black band and white tips to the feathers. The sexes are alike. The iris is yellow and the bill is black while the base of the lower mandible is greenish grey. The tarsi are grey.";
                            Intent intent = new Intent(DucksInMp.this, test.class);
                            BirdDescription obj = birdList.get(position);
                            intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                            intent.putExtra("image-res", R.drawable.ban_cuc);
                            intent.putExtra("scientific_bird", str);
                            intent.putExtra("bird_call", bird_call);
                            intent.putExtra("description", description);
                            startActivity(intent);
                        }

                        if (position == 3) {
                            String str = "Cacomantis merulinus";
                            int bird_call = R.raw.pl_cuc;
                            String description = "The plaintive cuckoo (Cacomantis merulinus) is a species of bird belonging to the genus Cacomantis in the cuckoo family Cuculidae. \n" +
                                    "It is native to Asia, from India and China to Indonesia. It is a fairly small cuckoo, 21-23.5 centimetres long. The adult male is grey-brown above and orange below with a grey head, throat and upper breast. There are white tips to the tail feathers. The legs and feet are yellow, the eye is red and the bill is black above and yellow below. The adult female is sometimes similar to the male but often occurs in a \"hepatic\" morph. This form is reddish-brown above with dark bars. The underparts are paler with fainter barring. There is a pale stripe over the eye and the tail has dark bars along its whole length. Juvenile birds are similar to hepatic females but are paler and have dark streaks rather than bars on the crown and throat.\n" +
                                    "\n" +
                                    "The male has several plaintive whistling calls. These include an ascending series of three-note phrases and a series of 11 or 12 descending notes.\n" +
                                    "There are four subspecies. The nominate form C. m. merulinus is found in the Philippines where it is common on many of the larger islands. C. m. querulus is the most widespread form, occurring in north-east India, Bangladesh, southern China, Indonesia, Myanmar, Thailand, Cambodia, Laos and Vietnam. It is a summer visitor to most of its Chinese range, migrating south for the winter. C. m. threnodes is found in the Malay Peninsula, Sumatra and Borneo while C. m. lanceolatus occurs in Java, Bali and Sulawesi.\n" +
                                    "\n" +
                                    "The grey-bellied cuckoo (C. passerinus) was formerly classified as a subspecies of the plaintive cuckoo but is now often treated as a separate species.";
                            Intent intent = new Intent(DucksInMp.this, test.class);
                            BirdDescription obj = birdList.get(position);
                            intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                            intent.putExtra("image-res", R.drawable.pl_cuc);
                            intent.putExtra("scientific_bird", str);
                            intent.putExtra("bird_call", bird_call);
                            intent.putExtra("description", description);
                            startActivity(intent);
                        }

                        if (position == 4) {
                            String str = "Cacomantis passerinus";
                            int bird_call = R.raw.g_cuc;
                            String description = "The grey-bellied cuckoo or the Indian plaintive cuckoo (Cacomantis passerinus) is a cuckoo with widespread occurrence throughout Asia.\n" +
                                    "The grey-bellied cuckoo is one of the smaller cuckoos, at a total length of about 23 cm. Adults are mainly grey with a white lower belly and undertail. There is a white patch on the wings. \n" +
                                    "Some females are dark-barred reddish brown above with an unbarred tail and have strongly dark-barred whitish underparts. The juvenile resembles the female but is of a duller grey.";
                            Intent intent = new Intent(DucksInMp.this, test.class);
                            BirdDescription obj = birdList.get(position);
                            intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                            intent.putExtra("image-res", R.drawable.g_cuc);
                            intent.putExtra("scientific_bird", str);
                            intent.putExtra("bird_call", bird_call);
                            intent.putExtra("description", description);
                            startActivity(intent);
                        }

                        if (position == 5) {
                            String str = "Surniculus dicruroides";
                            int bird_call = R.raw.d_cuc;
                            String description = "The fork-tailed drongo-cuckoo (Surniculus dicruroides) is a species of cuckoo that resembles a black drongo. It is found resident mainly in peninsular India in hill forests although some specimens are known from the Himalayan foothills. It can be easily distinguished by its straight beak and the white barred vent.\n" +
                                    "It has a deeply forked tail often having a white spot on the back of the head. The song has been described as a series of 5 or 6 whistling \"pip-pip-pip-pip-pip-\" notes rising in pitch with each \"pip\".\n" +
                                    "It is a brood parasite on small babblers. It is not known how or whether the drongo-like appearance benefits this species but it is suspected that it aids in brood-parasitism just as hawk-cuckoos appear like hawks.";
                            Intent intent = new Intent(DucksInMp.this, test.class);
                            BirdDescription obj = birdList.get(position);
                            intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                            intent.putExtra("image-res", R.drawable.dr_cuc);
                            intent.putExtra("scientific_bird", str);
                            intent.putExtra("bird_call", bird_call);
                            intent.putExtra("description", description);
                            startActivity(intent);
                        }

                        if (position == 6) {
                            String str = "Hierococcyx sparverioides";
                            int bird_call = R.raw.l_h_cuc;
                            String description = "The large hawk-cuckoo (Hierococcyx sparverioides) is a species of cuckoo in the Cuculidae family. It is found in Bangladesh, Bhutan, Cambodia, China, India, Indonesia, Laos, Malaysia, Myanmar, Nepal, Pakistan, the Philippines, Singapore, Taiwan, Thailand, and Vietnam. \n" +
                                    "Found as a vagrant on Christmas Island. The subspecies H. s. bocki of the Malay Peninsula, Sumatra and Borneo is usually considered a separate species, the dark hawk-cuckoo.\n" +
                                    "Its natural habitats are temperate forests and subtropical or tropical mangrove forests.";
                            Intent intent = new Intent(DucksInMp.this, test.class);
                            BirdDescription obj = birdList.get(position);
                            intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                            intent.putExtra("image-res", R.drawable.l_h_cuc);
                            intent.putExtra("scientific_bird", str);
                            intent.putExtra("bird_call", bird_call);
                            intent.putExtra("description", description);
                            startActivity(intent);
                        }

                        if (position == 7) {
                            String str = "Hierococcyx varius";
                            int bird_call = R.raw.c_h_cuc;
                            String description = "The common hawk-cuckoo (Hierococcyx varius), popularly known as the brainfever bird, is a medium-sized cuckoo resident in the Indian subcontinent. It bears a close resemblance to the Shikra, even in its style of flying and landing on a perch. The resemblance to hawks gives this group the generic name of hawk-cuckoo and like many other cuckoos these are brood parasites, laying their eggs in nests of babblers. \n" +
                                    "During their breeding season in summer males produce loud, repetitive three note calls that are well-rendered as brain-fever, the second note being longer and higher pitched. These notes rise to a crescendo before ending abruptly and repeat after a few minutes; the calling may go on through the day, well after dusk and before dawn.";
                            Intent intent = new Intent(DucksInMp.this, test.class);
                            BirdDescription obj = birdList.get(position);
                            intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                            intent.putExtra("image-res", R.drawable.c_h_cuc);
                            intent.putExtra("scientific_bird", str);
                            intent.putExtra("bird_call", bird_call);
                            intent.putExtra("description", description);
                            startActivity(intent);
                        }

                        if (position == 8) {
                            String str = "Cuculus micropterus";
                            int bird_call = R.raw.i_cuc;
                            String description = "The Indian cuckoo (Cuculus micropterus) is a member of the cuckoo order of birds, the Cuculiformes, that is found in the Indian subcontinent and Southeast Asia. It ranges from India, Bangladesh, Bhutan, Nepal and Sri Lanka east to Indonesia and north to China and Russia. \n" +
                                    "It is a solitary and shy bird, found in forests and open woodland at up to 3,600 m. This is a medium-sized cuckoo with both sexes alike. It has grey upperparts while the underside has broad black barring. The tail is barred with a broad subterminal dark band and a white tip. Young birds have white markings on the crown and white chin and throat contrasting with a dark face. Juveniles are browner and have broad white tips to the head and wing feathers. The eye-ring is gray to yellow (a feature shared with the common hawk-cuckoo). The iris is light brown to reddish. \n" +
                                    "The female differs from the male in being slightly paler grey on the throat and in having more brown on the breast and tail. The barring on the belly is narrower than in the male. Nestlings have an orange-red mouth and yellow flanges to the gape.\n" +
                                    "\n" +
                                    "Call of Indian cuckoo recorded at Nagerhole, April 2006\n" +
                                    "\n" +
                                    "The call is loud with four notes. They have been transcribed as \"orange-pekoe\", \"bo-ko-ta-ko\", \"crossword puzzle\" or \"one more bottle\". In Bengali, it is interpreted as \"bou-kotha-kao\", \"Bride, please speak\". In Uttarakhand and Nepal, it is rendered as \"kafal pako\", or \"the kafal fruit is ripe\", as is the case in May–June when calling increases. Very little variation is noted between regions. In the Kangra Valley of India, the call is interpreted as the soul of the dead shepherd uttering \"where is my sheep\".";
                            Intent intent = new Intent(DucksInMp.this, test.class);
                            BirdDescription obj = birdList.get(position);
                            intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                            intent.putExtra("image-res", R.drawable.i_cuc);
                            intent.putExtra("scientific_bird", str);
                            intent.putExtra("bird_call", bird_call);
                            intent.putExtra("description", description);
                            startActivity(intent);
                        }

                        if (position == 9) {
                            String str = "Cuculus canorus";
                            int bird_call = R.raw.c_cuc;
                            String description = "The common cuckoo (Cuculus canorus) (formerly European cuckoo) is a member of the cuckoo order of birds, Cuculiformes, which includes the roadrunners, the anis and the coucals.\n" +
                                    "\n" +
                                    "This species is a widespread summer migrant to Europe and Asia, and winters in Africa. It is a brood parasite, which means it lays eggs in the nests of other bird species, particularly of dunnocks, meadow pipits, and reed warblers. Although its eggs are larger than those of its hosts, the eggs in each type of host nest resemble the host's eggs. \n" +
                                    "The adult too is a mimic, in its case of the sparrowhawk; since that species is a predator, the mimicry gives the female time to lay her eggs without being seen to do so.";
                            Intent intent = new Intent(DucksInMp.this, test.class);
                            BirdDescription obj = birdList.get(position);
                            intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                            intent.putExtra("image-res", R.drawable.c_cuc);
                            intent.putExtra("scientific_bird", str);
                            intent.putExtra("bird_call", bird_call);
                            intent.putExtra("description", description);
                            startActivity(intent);
                        }

                        if (position == 10) {
                            String str = "Cuculus poliocephalus";
                            int bird_call = R.raw.l_cuc;
                            String description = "The lesser cuckoo (Cuculus poliocephalus) is a species of cuckoo in the Cuculidae family.\n" +
                                    "\n" +
                                    "It is found in Bangladesh, Bhutan, China, Democratic Republic of the Congo, Hong Kong, India, Japan, Kenya, North Korea, South Korea, Laos, Malawi, Myanmar, Nepal, Pakistan, Russia, Seychelles, Somalia, South Africa, Sri Lanka, Tanzania, Thailand, Vietnam, Zambia, and Zimbabwe.\n" +
                                    "In Japan, the bird is called hototogisu (ホトトギス?) and is frequently praised for its song, and ranked as her favorite bird by Sei Shonagon in her account of court life in Heian Japan, The Pillow Book. It is also a pivotal image in poem 81 of the Hyakunin Isshu poetry anthology.\n" +
                                    "\n" +
                                    "In Korean literature, the song of the lesser cuckoo represents the sound of sadness.";
                            Intent intent = new Intent(DucksInMp.this, test.class);
                            BirdDescription obj = birdList.get(position);
                            intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                            intent.putExtra("image-res", R.drawable.l_cuc);
                            intent.putExtra("scientific_bird", str);
                            intent.putExtra("bird_call", bird_call);
                            intent.putExtra("description", description);
                            startActivity(intent);
                        }
                    }

                    if (speciesname.equalsIgnoreCase("Trogan")) {
                        if (position == 0) {
                            String str = "Clamator jacobinus";
                            int bird_call = R.raw.j_cuc;
                            String description = "The Jacobin cuckoo, pied cuckoo, or pied crested cuckoo (Clamator jacobinus) is a member of the cuckoo order of birds that is found in Africa and Asia. \n" +
                                    "It is partially migratory and in India, it has been considered a harbinger of the monsoon rains due to the timing of its arrival.\n" +
                                    " It has been associated with a bird in Indian mythology and poetry, known as the chatak (Sanskrit: चातक) represented as a bird with a beak on its head that waits for rains to quench its thirst.\n" +
                                    "This medium-sized, slim black and white cuckoo with a crest is distinctive. The white wing patch on the black wing and the pattern make it unmistakable even in flight. They are very vocal during the breeding season. \n" +
                                    "The call is a ringing series of whistling notes \"piu-piu\" with the calls of the nominate form more rapid and slightly mellower.In India the subspecies serratus (Sparrman, 1786) is a summer breeding visitor to northern India and is believed to migrate to southern Africa. This is larger and longer winged than the nominate subspecies found in the southern peninsular region and Sri Lanka is said to be a local migrant.[6] No ringing evidence exists to support the actual migration to Africa.";
                            Intent intent = new Intent(DucksInMp.this, test.class);
                            BirdDescription obj = birdList.get(position);
                            intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                            intent.putExtra("image-res", R.drawable.j_cuc);
                            intent.putExtra("scientific_bird", str);
                            intent.putExtra("bird_call", bird_call);
                            intent.putExtra("description", description);
                            startActivity(intent);
                        }
                    }


                }

                /*if (Statename.equalsIgnoreCase("Kerala")) {
                    if ((position == 0)) {
                        Toast.makeText(DucksInMp.this, "   ", Toast.LENGTH_SHORT).show();

                         if (position == 0) {
                        String str = "Centropus sinensis";
                        int bird_call = R.raw.g_cou;
                        String description = "";
                        Intent intent = new Intent(DucksInMp.this, test.class);
                        BirdDescription obj = birdList.get(position);
                        intent.putExtra("individual_birds", obj.getNameOfTheBirdEnglish());
                        intent.putExtra("image-res", R.drawable.indian_spot_billed_duck);
                        intent.putExtra("scientific_bird", str);
                        intent.putExtra("bird_call", bird_call);
                        intent.putExtra("description", description);
                        startActivity(intent);
                    }
                    }
                }*/
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


        if (speciesname.equalsIgnoreCase("Ducks"))
            DuckList_MP();
        if (speciesname.equalsIgnoreCase("Geese"))
            GeeseList_MP();
        if (speciesname.equalsIgnoreCase("Teals"))
            TealsList_MP();
        if (speciesname.equalsIgnoreCase("Pochards"))
            PochardsList_MP();
                if (speciesname.equalsIgnoreCase("Flamingoes"))
            FlamingoesList_MP();
        if (speciesname.equalsIgnoreCase("Storks"))
            StorksList_MP();
        if (speciesname.equalsIgnoreCase("Adjutants"))
            AdjutantsList_MP();
        if (speciesname.equalsIgnoreCase("Pelicans"))
            PelicansList_MP();
        if (speciesname.equalsIgnoreCase("Ibis"))
            IbisList_MP();
        if (speciesname.equalsIgnoreCase("Spoonbill"))
            SpoonbillList_MP();
        if (speciesname.equalsIgnoreCase("Stilt"))
            StiltList_MP();
        if (speciesname.equalsIgnoreCase("Snipe"))
            SnipeList_MP();
        if (speciesname.equalsIgnoreCase("Jacanas"))
            JacanasList_MP();
        if (speciesname.equalsIgnoreCase("Skimmer"))
            SkimmerList_MP();
        if (speciesname.equalsIgnoreCase("Gull"))
            GullList_MP();
        if (speciesname.equalsIgnoreCase("Turn"))
            TernList_MP();
        if (speciesname.equalsIgnoreCase("Geese"))
            GeeseList_MP();
        if (speciesname.equalsIgnoreCase("Teals"))
            TealsList_MP();
        if (speciesname.equalsIgnoreCase("Pochards"))
            PochardsList_MP();
                if (speciesname.equalsIgnoreCase("Flamingoes"))
            FlamingoesList_MP();
        if (speciesname.equalsIgnoreCase("Storks"))
            StorksList_MP();
        if (speciesname.equalsIgnoreCase("Adjutants"))
            AdjutantsList_MP();
        if (speciesname.equalsIgnoreCase("Pelicans"))
            PelicansList_MP();
        if (speciesname.equalsIgnoreCase("Ibis"))
            IbisList_MP();
        if (speciesname.equalsIgnoreCase("Spoonbill"))
            SpoonbillList_MP();
        if (speciesname.equalsIgnoreCase("Stilt"))
            StiltList_MP();
        if (speciesname.equalsIgnoreCase("Snipe"))
            SnipeList_MP();
        if (speciesname.equalsIgnoreCase("Jacanas"))
            JacanasList_MP();
        if (speciesname.equalsIgnoreCase("Skimmer"))
            SkimmerList_MP();
        if (speciesname.equalsIgnoreCase("Gull"))
            GullList_MP();
        if (speciesname.equalsIgnoreCase("Turn"))
            TernList_MP();
        if (speciesname.equalsIgnoreCase("Quails"))
            QuailList_MP();
        if (speciesname.equalsIgnoreCase("Fowls"))
            FowlList_MP();
                if (speciesname.equalsIgnoreCase("Francolins"))
            FrancolinsList_MP();
        if (speciesname.equalsIgnoreCase("Pigeons"))
            PigeonList_MP();
                if (speciesname.equalsIgnoreCase("Francolins"))
            FrancolinsList_MP();
                if (speciesname.equalsIgnoreCase("Sandgrouses"))
            SandgrouseList_MP();
        if (speciesname.equalsIgnoreCase("Doves"))
            DoveList_MP();
        if (speciesname.equalsIgnoreCase("Nightjars"))
            NightjarList_MP();
        if (speciesname.equalsIgnoreCase("Coucal"))
            CoucalList_MP();
        if (speciesname.equalsIgnoreCase("Bustards"))
            BustardList_MP();
        if (speciesname.equalsIgnoreCase("Egrets"))
            EgretList_MP();
        if (speciesname.equalsIgnoreCase("Thick-knees"))
            ThickList_MP();
        if (speciesname.equalsIgnoreCase("Plovers"))
            PloverList_MP();
        if (speciesname.equalsIgnoreCase("Lapwings"))
            LapwingList_MP();
                if (speciesname.equalsIgnoreCase("Buttonquails"))
            ButtonquailList_MP();
        if (speciesname.equalsIgnoreCase("Coursers"))
            CourserList_MP();
        if (speciesname.equalsIgnoreCase("Sparrows"))
            SparrowList_MP();
                if (speciesname.equalsIgnoreCase("Pratincoles"))
            PratincoleList_MP();
        if (speciesname.equalsIgnoreCase("Wagtails"))
            WagtailList_MP();
        if (speciesname.equalsIgnoreCase("Pipits"))
            PipitList_MP();
        if (speciesname.equalsIgnoreCase("Crows"))
            CrowList_MP();
        if (speciesname.equalsIgnoreCase("Floricans"))
            FloricanList_MP();
        if (speciesname.equalsIgnoreCase("Malkohas"))
            MalkohaList_MP();
        if (speciesname.equalsIgnoreCase("Cuckoos"))
            CuckooList_MP();
        if (speciesname.equalsIgnoreCase("Trogan"))
            TroganList_MP();
        if (speciesname.equalsIgnoreCase("Osprey"))
            OspreyList_MP();
        if (speciesname.equalsIgnoreCase("Kites"))
            KiteList_MP();
        if (speciesname.equalsIgnoreCase("Buzzards"))
            BuzzardList_MP();
        if (speciesname.equalsIgnoreCase("Vultures"))
            VultureList_MP();
        if (speciesname.equalsIgnoreCase("Eagles"))
            EagleList_MP();
        if (speciesname.equalsIgnoreCase("Harriers"))
            HarrierList_MP();
                if (speciesname.equalsIgnoreCase("Shikra & Besra"))
            ShikraList_MP();
        if (speciesname.equalsIgnoreCase("Sparrowhawks & Goshawks"))
            SparrowhawkList_MP();
        if (speciesname.equalsIgnoreCase("Hornbills"))
            HornbillList_MP();
                if (speciesname.equalsIgnoreCase("Wryneck & Piculet"))
            WryneckList_MP();
                if (speciesname.equalsIgnoreCase("Woodpeckers"))
            WoodpeckerList_MP();
        if (speciesname.equalsIgnoreCase("Barbets"))
            BarbetsList_MP();
        if (speciesname.equalsIgnoreCase("Bee-Eaters"))
            BeeeaterList_MP();
                if (speciesname.equalsIgnoreCase("Kingfishers"))
            KingfisherList_MP();
        if (speciesname.equalsIgnoreCase("Falcons"))
            FalconList_MP();
        if (speciesname.equalsIgnoreCase("Hobby"))
            HobbyList_MP();
        if (speciesname.equalsIgnoreCase("Kestrels"))
            KestrelList_MP();
                if (speciesname.equalsIgnoreCase("Parakeets & Pitta"))
            ParakeetsList_MP();
        if (speciesname.equalsIgnoreCase("Minivets"))
            MinivetList_MP();
                if (speciesname.equalsIgnoreCase("Cuckooshrikes"))
            CuckooshrikeList_MP();
        if (speciesname.equalsIgnoreCase("Orioles"))
            OrioleList_MP();
                if (speciesname.equalsIgnoreCase("Woodshrikes"))
            WoodshrikeList_MP();
        if (speciesname.equalsIgnoreCase("Iora"))
            IoraList_MP();
        if (speciesname.equalsIgnoreCase("Drongo"))
            DrongoList_MP();
        if (speciesname.equalsIgnoreCase("Fantails"))
            FantailList_MP();
                if (speciesname.equalsIgnoreCase("Treepie & Jackdaws"))
            TreepieList_MP();
        if (speciesname.equalsIgnoreCase("Shrikes"))
            ShrikeList_MP();
        if (speciesname.equalsIgnoreCase("Monarch"))
            MonarchList_MP();
                if (speciesname.equalsIgnoreCase("Flowerpeckers"))
            FlowerpeckerList_MP();
        if (speciesname.equalsIgnoreCase("Sunbirds"))
            SunbirdList_MP();
        if (speciesname.equalsIgnoreCase("Weavers"))
            WeaverList_MP();
        if (speciesname.equalsIgnoreCase("Avadavats"))
            AvadavatList_MP();
        if (speciesname.equalsIgnoreCase("Munias"))
            MuniaList_MP();
        if (speciesname.equalsIgnoreCase("Rosefinch"))
            RosefinchList_MP();
        if (speciesname.equalsIgnoreCase("Buntings"))
            BuntingList_MP();
        if (speciesname.equalsIgnoreCase("Tit"))
            TitList_MP();
        if (speciesname.equalsIgnoreCase("Larks"))
            LarkList_MP();
                if (speciesname.equalsIgnoreCase("Cisticola"))
            CisticolakList_MP();
        if (speciesname.equalsIgnoreCase("Warblers"))
            WarblerList_MP();
        if (speciesname.equalsIgnoreCase("Prinia"))
            PriniaList_MP();
        if (speciesname.equalsIgnoreCase("Martin"))
            MartinList_MP();
        if (speciesname.equalsIgnoreCase("Swallows"))
            SwallowList_MP();
        if (speciesname.equalsIgnoreCase("Redstart"))
            RedstartList_MP();
        if (speciesname.equalsIgnoreCase("Wheatear"))
            WheatearList_MP();
        if (speciesname.equalsIgnoreCase("Chat"))
            ChatList_MP();
        if (speciesname.equalsIgnoreCase("Thrush & Indian Blackbird"))
            ThrushList_MP();
                if (speciesname.equalsIgnoreCase("Flycatcher"))
            FlycatcherList_MP();
        if (speciesname.equalsIgnoreCase("Robin"))
            RobinList_MP();
        if (speciesname.equalsIgnoreCase("Myna"))
            MynaList_MP();
                if (speciesname.equalsIgnoreCase("Nuthatch & Salpornis"))
            NutList_MP();
                if (speciesname.equalsIgnoreCase("Babbler & Fulvetta"))
            BabblerList_MP();
        if (speciesname.equalsIgnoreCase("Bulbul"))
            BulbulList_MP();
        if (speciesname.equalsIgnoreCase("Starling"))
            StarlingList_MP();



    }


    private void DuckList_MP() {
        //Fulvous Whistling Duck
        BirdDescription Fulvous_Whistling_Duck = new BirdDescription("Fulvous Whistling Duck", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Fulvous_Whistling_Duck);

        //Lesser Whistling Duck
        BirdDescription Lesser_Whistling_Duck = new BirdDescription("Lesser Whistling Duck", "8 types in Madhya Pradesh", R.drawable.l_whistling_duck);
        birdList.add(Lesser_Whistling_Duck);

        //Tufted Duck
        BirdDescription Tufted_Duck = new BirdDescription("Tufted Duck", "8 types in Madhya Pradesh", R.drawable.tufted_duck);
        birdList.add(Tufted_Duck);

        //Falcated Duck
        BirdDescription Falcated_Duck = new BirdDescription("Falcated Duck", "8 types in Madhya Pradesh", R.drawable.falcated_duck);
        birdList.add(Falcated_Duck);

        //Pink-headed Duck
        BirdDescription Pink_headed_Duck = new BirdDescription("Pink-headed Duck", "8 types in Madhya Pradesh", R.drawable.pink_headed_duck);
        birdList.add(Pink_headed_Duck);

        //Comb Duck
        BirdDescription Comb_Duck = new BirdDescription("Comb Duck", "8 types in Madhya Pradesh", R.drawable.comb_duck);
        birdList.add(Comb_Duck);

        //Ferruginous Duck
        BirdDescription Ferruginous_Duck = new BirdDescription("Ferruginous Duck", "8 types in Madhya Pradesh", R.drawable.ferrugnios_duck);
        birdList.add(Ferruginous_Duck);

        //Indian Spot-billed Duck
        BirdDescription Indian_Spot_billed_Duck = new BirdDescription("Indian Spot-billed Duck", "8 types in Madhya Pradesh", R.drawable.indian_spot_billed_duck);
        birdList.add(Indian_Spot_billed_Duck);


    }

    private void LarkList_MP() {
        //Rufous-tailed Lark
        BirdDescription Rufous_tailed_Lark = new BirdDescription("Rufous-tailed Lark", "Ammomanes phoenicura", R.drawable.rus_lark);
        birdList.add(Rufous_tailed_Lark);

        //Ashy-crowned Sparrow Lark
        BirdDescription Ashy_crowned_Sparrow_Lark = new BirdDescription("Ashy-crowned Sparrow Lark", "Eremopterix griseus", R.drawable.as_lark);
        birdList.add(Ashy_crowned_Sparrow_Lark);

        //Singing Bush Lark
        BirdDescription Singing_Bush_Lark = new BirdDescription("Singing Bush Lark", "Mirafra cantillans", R.drawable.si_lark);
        birdList.add(Singing_Bush_Lark);

        //Bengal Lark
        BirdDescription Bengal_Lark = new BirdDescription("Bengal Lark", "Mirafra assamica", R.drawable.be_lar);
        birdList.add(Bengal_Lark);

        //Indian Bush Lark
        BirdDescription Indian_Bush_Lark = new BirdDescription("Indian Bush Lark", "Mirafra erythroptera", R.drawable.ind_la);
        birdList.add(Indian_Bush_Lark);

        //Sand Lark
        BirdDescription Sand_Lark = new BirdDescription("Sand Lark", "Calandrella raytal", R.drawable.sa_la);
        birdList.add(Sand_Lark);

        //Bimaculated Lark
        BirdDescription Bimaculated_Lark = new BirdDescription("Bimaculated Lark", "Melanocorypha bimaculata", R.drawable.bi_la);
        birdList.add(Bimaculated_Lark);

        //Hume's Short-toed Lark
        BirdDescription Hume_Short_toed_Lark = new BirdDescription("Hume's Short-toed Lark", "Calandrella acutirostris", R.drawable.hu_la);
        birdList.add(Hume_Short_toed_Lark);

        //IGreater Short-toed Lark
        BirdDescription Greater_Short_toed_Lark = new BirdDescription("Greater Short-toed Lark", "Calandrella brachydactyla", R.drawable.gr_la);
        birdList.add(Greater_Short_toed_Lark);

        //Oriental Sky Lark
        BirdDescription Oriental_Sky_Lark = new BirdDescription("Oriental Sky Lark", "Alauda gulgula", R.drawable.or_la);
        birdList.add(Oriental_Sky_Lark);

        //Crested Lark
        BirdDescription Crested_Lark = new BirdDescription("Crested Lark", "Galerida cristataa", R.drawable.cr_la);
        birdList.add(Crested_Lark);

        //Sykes's Lark
        BirdDescription Sykes_Lark = new BirdDescription("Sykes's Lark", "Galerida deva", R.drawable.sk_la);
        birdList.add(Sykes_Lark);


    }

    private void WarblerList_MP() {
        //Rusty-rumped Warbler
        BirdDescription Rusty_rumped_Warbler = new BirdDescription("Rusty-rumped Warbler", "Locustella certhiola", R.drawable.ru_war);
        birdList.add(Rusty_rumped_Warbler);

        //Grasshopper Warbler
        BirdDescription Grasshopper_Warbler = new BirdDescription("Grasshopper Warbler", "Locustella naevias", R.drawable.gr_war);
        birdList.add(Grasshopper_Warbler);

        //Striated Grassbird
        BirdDescription Striated_Grassbird = new BirdDescription("Striated Grassbird", "Megalurus palustris", R.drawable.st_war);
        birdList.add(Striated_Grassbird);

        //Bristled Grass Warbler
        BirdDescription Bristled_Grass_Warbler = new BirdDescription("Bristled Grass Warbler", "Chaetornis striata", R.drawable.br_war);
        birdList.add(Bristled_Grass_Warbler);

        //Thick-billed Warbler
        BirdDescription Thick_billed_Warbler = new BirdDescription("Thick-billed Warbler", "Iduna aedon", R.drawable.th_war);
        birdList.add(Thick_billed_Warbler);

        //Booted Warbler
        BirdDescription Booted_Warbler = new BirdDescription("Booted Warbler", "Iduna caligata", R.drawable.bo_war);
        birdList.add(Booted_Warbler);

        //Sykes's Warbler
        BirdDescription Sykes_Warbler = new BirdDescription("Sykes's Warbler", "Iduna rama", R.drawable.sk_war);
        birdList.add(Sykes_Warbler);

        //Black-browed Reed Warbler
        BirdDescription Black_browed_Reed_Warbler = new BirdDescription("Black-browed Reed Warbler", "Acrocephalus bistrigiceps", R.drawable.bl_war);
        birdList.add(Black_browed_Reed_Warbler);

        //Moustached Warbler
        BirdDescription Moustached_Warbler = new BirdDescription("Moustached Warbler", "Acrocephalus melanopogona", R.drawable.mo_war);
        birdList.add(Moustached_Warbler);

        //Large-billed Reed Warbler
        BirdDescription Large_billed_Reed_Warbler = new BirdDescription("Large-billed Reed Warbler", "Acrocephalus orinus", R.drawable.la_war);
        birdList.add(Large_billed_Reed_Warbler);

        //Blyth's Reed Warbler
        BirdDescription Blyth_Reed_Warbler = new BirdDescription("Blyth's Reed Warbler", "Acrocephalus dumetorum", R.drawable.bly_war);
        birdList.add(Blyth_Reed_Warbler);

        //Paddyfield Warbler
        BirdDescription Paddyfield_Warbler = new BirdDescription("Paddyfield Warbler", "Acrocephalus agricola", R.drawable.pa_war);
        birdList.add(Paddyfield_Warbler);

        //Clamorous Reed Warbler
        BirdDescription Clamorous_Reed_Warbler = new BirdDescription("Clamorous Reed Warbler", "Acrocephalus stentoreus", R.drawable.cl_war);
        birdList.add(Clamorous_Reed_Warbler);


    }

    private void FlycatcherList_MP() {
        //Asian Brown Flycatcher
        BirdDescription Asian_Brown_Flycatcher = new BirdDescription("Asian Brown Flycatcher", "Muscicapa latirostris", R.drawable.as_fl);
        birdList.add(Asian_Brown_Flycatcher);

        //Brown-breasted Flycatcher
        BirdDescription Brown_breasted_Flycatcher = new BirdDescription("Brown-breasted Flycatcher", "Muscicapa muttui", R.drawable.br_fl);
        birdList.add(Brown_breasted_Flycatcher);

        //Rusty-tailed Flycatcher
        BirdDescription Rusty_tailed_Flycatcher = new BirdDescription("Rusty-tailed Flycatcher", "Muscicapa ruficauda", R.drawable.r_fl);
        birdList.add(Rusty_tailed_Flycatcher);

        //Tickell's Blue Flycatcher
        BirdDescription Tickell_Blue_Flycatcher = new BirdDescription("Tickell's Blue Flycatcher", "Cyornis tickelliae", R.drawable.ti_fl);
        birdList.add(Tickell_Blue_Flycatcher);

        //Blue-throated Blue Flycatcher
        BirdDescription Blue_throated_Blue_Flycatcher = new BirdDescription("Blue-throated Blue Flycatcher", "Cyornis rubeculoides", R.drawable.bl_fl);
        birdList.add(Blue_throated_Blue_Flycatcher);

        //Asian Verditer Flycatcher
        BirdDescription Asian_Verditer_Flycatcher = new BirdDescription("Asian Verditer Flycatcher", "Eumyias thalassinus", R.drawable.as_fly);
        birdList.add(Asian_Verditer_Flycatcher);

        //Red-breasted Flycatcher
        BirdDescription Red_breasted_Flycatcher = new BirdDescription("Red-breasted Flycatcher", "Ficedula parva", R.drawable.re_fl);
        birdList.add(Red_breasted_Flycatcher);

        //Taiga Flycatcher
        BirdDescription Taiga_Flycatcher = new BirdDescription("Taiga Flycatcher", "Ficedula albicilla", R.drawable.t_fl);
        birdList.add(Taiga_Flycatcher);

        //Snowy-browed Flycatcher
        BirdDescription Snowy_browed_Flycatcher = new BirdDescription("Snowy-browed Flycatcher", "Ficedula hyperythra", R.drawable.sn_fl);
        birdList.add(Snowy_browed_Flycatcher);

        //Rufous-gorgetted Flycatcher
        BirdDescription Rufous_gorgetted_Flycatcher = new BirdDescription("Rufous-gorgetted Flycatcher", "Ficedula strophiata", R.drawable.ru_fl);
        birdList.add(Rufous_gorgetted_Flycatcher);

        //Ultramarine Flycatcher
        BirdDescription Ultramarine_Flycatcher = new BirdDescription("Ultramarine Flycatcher", "Ficedula superciliaris", R.drawable.ul_fl);
        birdList.add(Ultramarine_Flycatcher);

        //Slaty-blue Flycatcher
        BirdDescription Slaty_blue_Flycatcher = new BirdDescription("Slaty-blue Flycatcher", "Ficedula tricolor", R.drawable.sl_fl);
        birdList.add(Slaty_blue_Flycatcher);



    }



    private void BuntingList_MP() {
        //Striated Bunting
        BirdDescription Striated_Bunting = new BirdDescription("Striated Bunting", "Emberiza striolata", R.drawable.st_bun);
        birdList.add(Striated_Bunting);

        //Red-headed Bunting
        BirdDescription Crested_Bunting = new BirdDescription("Crested Bunting", "Melophus lathami", R.drawable.cr_bun);
        birdList.add(Crested_Bunting);

        //Red-headed Bunting
        BirdDescription Red_headed_Bunting = new BirdDescription("Red-headed Bunting", "Emberiza bruniceps", R.drawable.rh_bun);
        birdList.add(Red_headed_Bunting);

        //Black-headed Bunting
        BirdDescription Black_headed_Bunting = new BirdDescription("Black-headed Bunting", "Emberiza melanocephala", R.drawable.bl_bun);
        birdList.add(Black_headed_Bunting);

        //Chestnut-eared Bunting
        BirdDescription Chestnut_eared_Bunting = new BirdDescription("Chestnut-eared Bunting", "Emberiza fucata", R.drawable.ch_bun);
        birdList.add(Chestnut_eared_Bunting);

        //Grey-necked Bunting
        BirdDescription Grey_necked_Bunting = new BirdDescription("Grey-necked Bunting", "Emberiza buchanani", R.drawable.gr_bun);
        birdList.add(Grey_necked_Bunting);

        //White-capped Bunting
        BirdDescription White_capped_Bunting = new BirdDescription("White-capped Bunting", "Emberiza stewarti", R.drawable.wh_bun);
        birdList.add(White_capped_Bunting);

        //Eurasian Reed Bunting
        BirdDescription Eurasian_Reed_Bunting = new BirdDescription("Eurasian Reed Bunting", "Acrocephalus scirpaceus", R.drawable.eu_bun);
        birdList.add(Eurasian_Reed_Bunting);


    }

    private void BulbulList_MP() {
        //Ashy Bulbul
        BirdDescription Ashy_Bulbul = new BirdDescription("Ashy Bulbul", "Hemixos flavala", R.drawable.as_bu);
        birdList.add(Ashy_Bulbul);

        //Black Bulbul
        BirdDescription Black_Bulbul = new BirdDescription("Black Bulbul", "Hypsipetes leucocephalus", R.drawable.b_bu);
        birdList.add(Black_Bulbul);

        //Black-crested Bulbu
        BirdDescription Black_crested_Bulbul = new BirdDescription("Black-crested Bulbul", "Pycnonotus flaviventris", R.drawable.bl_bub);
        birdList.add(Black_crested_Bulbul);

        //Red-whiskered Bulbul
        BirdDescription Red_whiskered_Bulbul = new BirdDescription("Red-whiskered Bulbul", "Pycnonotus jocosus", R.drawable.re_bu);
        birdList.add(Red_whiskered_Bulbul);

        //Himalayan Bulbul
        BirdDescription Himalayan_Bulbul = new BirdDescription("Himalayan Bulbul", "Pycnonotus leucogenys", R.drawable.hi_bu);
        birdList.add(Himalayan_Bulbul);

        //White-eared Bulbul
        BirdDescription White_eared_Bulbul = new BirdDescription("White-eared Bulbul", "Pycnonotus leucotis", R.drawable.wh_bul);
        birdList.add(White_eared_Bulbul);

        //Red-vented Bulbul
        BirdDescription Red_vented_Bulbul = new BirdDescription("Red-vented Bulbul", "Pycnonotus cafer", R.drawable.re_bul);
        birdList.add(Red_vented_Bulbul);

        //White-browed Bulbul
        BirdDescription White_browed_Bulbul = new BirdDescription("White-browed Bulbul", "Pycnonotus luteolus", R.drawable.wh_bulb);
        birdList.add(White_browed_Bulbul);


    }

    private void EagleList_MP() {
        //Short-toed Eagle
        BirdDescription Short_toed_Eagle = new BirdDescription("Short-toed Eagle", "Circaetus gallicus", R.drawable.s_eag);
        birdList.add(Short_toed_Eagle);

        //Mountain Hawk Eagle
        BirdDescription Mountain_Hawk_Eagle = new BirdDescription("Mountain Hawk Eagle", "Nisaetus nipalensis", R.drawable.m_h_eag);
        birdList.add(Mountain_Hawk_Eagle);

        //Changeable Hawk Eagle
        BirdDescription Changeable_Hawk_Eagle = new BirdDescription("Changeable Hawk Eagle", "Nisaetus cirrhatus", R.drawable.c_h_eag);
        birdList.add(Changeable_Hawk_Eagle);

        //Rufous-bellied Eagle
        BirdDescription Rufous_bellied_Eagle = new BirdDescription("Rufous-bellied Eagle", "Lophotriorchis kienerii", R.drawable.r_f_eag);
        birdList.add(Rufous_bellied_Eagle);

        //Black Eagle
        BirdDescription Black_Eagle = new BirdDescription("Black Eagle", "Ictinaetus malaiensis", R.drawable.b_eag);
        birdList.add(Black_Eagle);

        //Indian Spotted Eagle
        BirdDescription Indian_Spotted_Eagle = new BirdDescription("Indian Spotted Eagle", "Clanga hastata", R.drawable.i_s_eag);
        birdList.add(Indian_Spotted_Eagle);

        //Greater Spotted Eagle
        BirdDescription Greater_Spotted_Eagle = new BirdDescription("Greater Spotted Eagle", "Clanga clanga", R.drawable.g_s_eag);
        birdList.add(Greater_Spotted_Eagle);

        //Tawny Eagle
        BirdDescription Tawny_Eagle = new BirdDescription("Tawny Eagle", "Aquila rapax", R.drawable.t_eag);
        birdList.add(Tawny_Eagle);

        //Steppe Eagle
        BirdDescription Steppe_Eagle = new BirdDescription("Rufous-bellied Eagle", "Aquila nipalensis", R.drawable.s_eagle);
        birdList.add(Steppe_Eagle);

        //Eastern Imperial Eagle
        BirdDescription Eastern_Imperial_Eagle = new BirdDescription("Eastern Imperial Eagle", "Aquila heliaca", R.drawable.e_i_eag);
        birdList.add(Eastern_Imperial_Eagle);

        //Golden Eagle
        BirdDescription Golden_Eagle = new BirdDescription("Golden Eagle", "Aquila chrysaetos", R.drawable.g_eag);
        birdList.add(Golden_Eagle);

        //Bonelli's Eagle
        BirdDescription Bonelli_Eagle = new BirdDescription("Bonelli's Eagle", "Aquila fasciata", R.drawable.bon_eag);
        birdList.add(Bonelli_Eagle);

        //Booted Eagle
        BirdDescription Booted_Eagle = new BirdDescription("Booted Eagle", "Hieraaetus pennatus", R.drawable.boot_eag);
        birdList.add(Booted_Eagle);

    }

    private void WoodpeckerList_MP() {
        //Heart-spotted Woodpecker
        BirdDescription Heart_spotted_Woodpecker = new BirdDescription("Heart-spotted Woodpecker", "Hemicircus canente", R.drawable.h_s_wood);
        birdList.add(Heart_spotted_Woodpecker);

        //Common Flame-backed Woodpecker
        BirdDescription Common_Flame_backed_Woodpecker = new BirdDescription("Common Flame-backed Woodpecker", "Dinopium javanense", R.drawable.c_f_wood);
        birdList.add(Common_Flame_backed_Woodpecker);

        //Rufous Woodpecker
        BirdDescription Rufous_Woodpecker = new BirdDescription("Rufous Woodpecker", "Micropternus brachyurus", R.drawable.r_wood);
        birdList.add(Rufous_Woodpecker);

        //Greater Yellow-naped Woodpecker
        BirdDescription Greater_Yellow_naped_Woodpecker = new BirdDescription("Greater Yellow-naped Woodpecker", "Chrysophlegma flavinucha", R.drawable.gr_n_wood);
        birdList.add(Greater_Yellow_naped_Woodpecker);

        //Lesser Yellow-naped Woodpecker
        BirdDescription Lesser_Yellow_naped_Woodpecker = new BirdDescription("Lesser Yellow-naped Woodpecker", "(Picus chlorolophus", R.drawable.l_yel_wood);
        birdList.add(Lesser_Yellow_naped_Woodpecker);

        //Streak-throated Woodpecker
        BirdDescription Streak_throated_Woodpecker = new BirdDescription("Streak-throated Woodpecker", "Picus xanthopygaeus", R.drawable.st_wood);
        birdList.add(Streak_throated_Woodpecker);

        //White-bellied Woodpecker
        BirdDescription White_bellied_Woodpecker = new BirdDescription("White-bellied Woodpecker", "Dryocopus javensis", R.drawable.w_wood);
        birdList.add(White_bellied_Woodpecker);

        //Greater Flame-backed Woodpecker
        BirdDescription Greater_Flame_backed_Woodpecker = new BirdDescription("Greater Flame-backed Woodpecker", "Chrysocolaptes guttacristatus", R.drawable.gr_wood);
        birdList.add(Greater_Flame_backed_Woodpecker);

        //White-naped Woodpecker
        BirdDescription White_naped_Woodpecker = new BirdDescription("White-naped Woodpecker", "Chrysocolaptes festivus", R.drawable.wh_wood);
        birdList.add(White_naped_Woodpecker);

        //Brown-capped Woodpecker
        BirdDescription Brown_capped_Woodpecker = new BirdDescription("Brown-capped Woodpecker", "Dendrocopos nanus", R.drawable.b_wood);
        birdList.add(Brown_capped_Woodpecker);

        //Fulvous-breasted Woodpecker
        BirdDescription Fulvous_breasted_Woodpecker = new BirdDescription("Fulvous-breasted Woodpecker", "Dendrocopos macei", R.drawable.f_wood);
        birdList.add(Fulvous_breasted_Woodpecker);

        //Yellow-crowned Woodpecker
        BirdDescription Yellow_crowned_Woodpecker = new BirdDescription("Yellow-crowned Woodpecker", "Leiopicus mahrattensis", R.drawable.ye_wood);
        birdList.add(Yellow_crowned_Woodpecker);


    }

    private void BabblerList_MP() {
        //Indian Scimitar Babbler
        BirdDescription Indian_Scimitar_Babbler = new BirdDescription("Indian Scimitar Babbler", "Pomatorhinus horsfieldii", R.drawable.in_ba);
        birdList.add(Indian_Scimitar_Babbler);

        //Tawny-bellied Babbler
        BirdDescription Tawny_bellied_Babbler = new BirdDescription("Tawny-bellied Babbler", "Dumetia hyperythra", R.drawable.ta_ba);
        birdList.add(Tawny_bellied_Babbler);

        //Striped Tit Babbler
        BirdDescription Striped_Tit_Babbler = new BirdDescription("Striped Tit Babbler", "Macronus gularis", R.drawable.st_ba);
        birdList.add(Striped_Tit_Babbler);

        //Puff-throated Babbler
        BirdDescription Puff_throated_Babbler = new BirdDescription("Puff-throated Babbler", "Pellorneum ruficeps", R.drawable.pu_ba);
        birdList.add(Puff_throated_Babbler);

        //Brown-cheeked Nun Babbler
        BirdDescription Brown_cheeked_Nun_Babbler = new BirdDescription("Brown-cheeked Nun Babbler", "Alcippe poioicephala", R.drawable.br_ba);
        birdList.add(Brown_cheeked_Nun_Babbler);

        //Large Grey Babbler
        BirdDescription Large_Grey_Babbler = new BirdDescription("Large Grey Babbler", "Turdoides malcolmi", R.drawable.la_ba);
        birdList.add(Large_Grey_Babbler);

        //Striated Babbler
        BirdDescription Striated_Babbler = new BirdDescription("Striated Babbler", "Turdoides earlei", R.drawable.str_ba);
        birdList.add(Striated_Babbler);

        //Scrub Babbler
        BirdDescription Scrub_Babbler = new BirdDescription("Scrub Babbler", "Turdoides caudata", R.drawable.scru_ba);
        birdList.add(Scrub_Babbler);

        //ungle Babbler
        BirdDescription Jungle_Babbler = new BirdDescription("Jungle Babbler", "Turdoides striata", R.drawable.ju_ba);
        birdList.add(Jungle_Babbler);

        //Rusty-capped Fulvetta
        BirdDescription Rusty_capped_Fulvetta = new BirdDescription("Rusty-capped Fulvetta", "Alcippe dubia", R.drawable.ru_fu);
        birdList.add(Rusty_capped_Fulvetta);


    }

    private void CuckooList_MP() {
        //Jacobin Cuckoo
        BirdDescription Jacobin_Cuckoo = new BirdDescription("Jacobin Cuckoo", "Clamator jacobinus", R.drawable.j_cuc);
        birdList.add(Jacobin_Cuckoo);

        //Chestnut-winged Cuckoo
        BirdDescription Chestnut_winged_Cuckoo = new BirdDescription("Chestnut-winged Cuckoo", "Clamator coromandus", R.drawable.c_w_cuc);
        birdList.add(Chestnut_winged_Cuckoo);

        //Banded Bay Cuckoo
        BirdDescription Banded_Bay_Cuckoo = new BirdDescription("Banded Bay Cuckoo", "Cacomantis sonneratii", R.drawable.ban_cuc);
        birdList.add(Banded_Bay_Cuckoo);

        //Plaintive Cuckoo
        BirdDescription Plaintive_Cuckoo = new BirdDescription("Plaintive Cuckoo", "Cacomantis merulinus", R.drawable.pl_cuc);
        birdList.add(Plaintive_Cuckoo);

        //Grey-bellied Cuckoo
        BirdDescription Grey_bellied_Cuckoo = new BirdDescription("Grey-bellied Cuckoo", "Cacomantis passerinus", R.drawable.g_cuc);
        birdList.add(Grey_bellied_Cuckoo);

        //CDrongo Cuckoo
        BirdDescription Drongo_Cuckoo = new BirdDescription("Drongo Cuckoo", "Surniculus dicruroides", R.drawable.dr_cuc);
        birdList.add(Drongo_Cuckoo);

        //Large Hawk Cuckoo
        BirdDescription Large_Hawk_Cuckoo = new BirdDescription("Large Hawk Cuckoo", "Hierococcyx sparverioides", R.drawable.l_h_cuc);
        birdList.add(Large_Hawk_Cuckoo);

        //Common Hawk Cuckoo
        BirdDescription Common_Hawk_Cuckoo = new BirdDescription("Common Hawk Cuckoo", "Hierococcyx varius", R.drawable.c_h_cuc);
        birdList.add(Common_Hawk_Cuckoo);

        //Indian Cuckoo
        BirdDescription Indian_Cuckoo = new BirdDescription("Indian Cuckoo", "Cuculus micropterus", R.drawable.i_cuc);
        birdList.add(Indian_Cuckoo);

        //Common Cuckoo
        BirdDescription Common_Cuckoo = new BirdDescription("Common Cuckoo", "Cuculus canorus", R.drawable.c_cuc);
        birdList.add(Common_Cuckoo);

        //CLesser Cuckooo
        BirdDescription Lesser_Cuckoo = new BirdDescription("Lesser Cuckoo", "Cuculus poliocephalus", R.drawable.l_cuc);
        birdList.add(Lesser_Cuckoo);


    }

    private void WagtailList_MP() {
        //Yellow Wagtail
        BirdDescription Yellow_Wagtail = new BirdDescription("Yellow Wagtail", "Motacilla flava", R.drawable.ye_wag);
        birdList.add(Yellow_Wagtail);

        //Grey Wagtail
        BirdDescription Grey_Wagtail = new BirdDescription("Grey Wagtail", "Motacilla cinerea", R.drawable.g_wag);
        birdList.add(Grey_Wagtail);

        //Citrine Wagtail
        BirdDescription Citrine_Wagtail = new BirdDescription("Citrine Wagtail", "Motacilla citreola", R.drawable.ci_wag);
        birdList.add(Citrine_Wagtail);

        //White-browed Wagtail
        BirdDescription White_browed_Wagtail = new BirdDescription("White-browed Wagtail", "Motacilla maderaspatensis", R.drawable.wh_wag);
        birdList.add(White_browed_Wagtail);

        //White Wagtail
        BirdDescription White_Wagtail = new BirdDescription("White Wagtail", "Motacilla alba", R.drawable.wh_wag);
        birdList.add(White_Wagtail);

        //Forest Wagtail
        BirdDescription Forest_Wagtail = new BirdDescription("Forest Wagtail", "Dendronanthus indicus", R.drawable.fo_wag);
        birdList.add(Forest_Wagtail);



    }

    private void WheatearList_MP() {
        //Northern Wheatear
        BirdDescription Northern_Wheatear = new BirdDescription("Northern Wheatear", "Oenanthe oenanthe", R.drawable.no_wh);
        birdList.add(Northern_Wheatear);

        //Isabelline Wheatear
        BirdDescription Isabelline_Wheatear = new BirdDescription("Isabelline Wheatear", "Oenanthe isabellina", R.drawable.is_wh);
        birdList.add(Isabelline_Wheatear);

        //Desert Wheatear
        BirdDescription Desert_Wheatear = new BirdDescription("Desert Wheatear", "Oenanthe deserti", R.drawable.d_wh);
        birdList.add(Desert_Wheatear);

        //Pied Wheatear
        BirdDescription Pied_Wheatear = new BirdDescription("Pied Wheatear", "Oenanthe pleschanka", R.drawable.pi_wh);
        birdList.add(Pied_Wheatear);

        //Variable Wheatear
        BirdDescription Variable_Wheatear = new BirdDescription("Variable Wheatear", "Oenanthe picata", R.drawable.va_wh);
        birdList.add(Variable_Wheatear);

        //Red-tailed Wheatear
        BirdDescription Red_tailed_Wheatear = new BirdDescription("Red-tailed Wheatear", "Oenanthe chrysopygia", R.drawable.re_wh);
        birdList.add(Red_tailed_Wheatear);



    }

    private void MartinList_MP() {
        //Northern House Martin
        BirdDescription Northern_House_Martin = new BirdDescription("Northern House Martin", "elichon urbicum", R.drawable.no_mar);
        birdList.add(Northern_House_Martin);

        //Asian House Martin
        BirdDescription Asian_House_Martin = new BirdDescription("Asian House Martin", "elichon dasypus", R.drawable.as_mar);
        birdList.add(Asian_House_Martin);

        //Eurasian Crag Martin
        BirdDescription Eurasian_Crag_Martin = new BirdDescription("Eurasian Crag Martin", "Ptyonoprogne rupestris", R.drawable.eu_mar);
        birdList.add(Eurasian_Crag_Martin);

        //Dusky Crag Martin
        BirdDescription Dusky_Crag_Martin = new BirdDescription("Dusky Crag Martin", "Ptyonoprogne concolors", R.drawable.cr_mar);
        birdList.add(Dusky_Crag_Martin);

        //Plain Martin
        BirdDescription Plain_Martin = new BirdDescription("Plain Martin", "Riparia paludicola", R.drawable.pl_mar);
        birdList.add(Plain_Martin);

        //Sand Martin
        BirdDescription Sand_Martin = new BirdDescription("Sand Martin", "Riparia riparia", R.drawable.sa_mar);
        birdList.add(Sand_Martin);

        //Pale Martin
        BirdDescription Pale_Martin = new BirdDescription("Pale Martin", "Ptyonoprogne obsoleta", R.drawable.pa_mar);
        birdList.add(Pale_Martin);




    }

    private void SunbirdList_MP() {
        //Purple-rumped Sunbird
        BirdDescription Purple_rumped_Sunbird = new BirdDescription("Purple-rumped Sunbird", "Leptocoma zeylonica", R.drawable.p_r_sun);
        birdList.add(Purple_rumped_Sunbird);

        //Purple Sunbird
        BirdDescription Purple_Sunbird = new BirdDescription("Purple Sunbird", "Cinnyris asiaticus", R.drawable.p_sun);
        birdList.add(Purple_Sunbird);

        //Loten's Sunbird
        BirdDescription Loten_Sunbird = new BirdDescription("Loten's Sunbird", "Cinnyris lotenius", R.drawable.lo_sun);
        birdList.add(Loten_Sunbird);

        //Crimson Sunbird
        BirdDescription Crimson_Sunbird = new BirdDescription("Crimson Sunbird", "Aethopyga siparaja", R.drawable.cr_sun);
        birdList.add(Crimson_Sunbird);


    }

    private void MynaList_MP() {
        //Common Myna
        BirdDescription Common_Myna = new BirdDescription("Common Myna", "Acridotheres tristis", R.drawable.c_my);
        birdList.add(Common_Myna);

        //Bank_Myna
        BirdDescription Bank_Myna = new BirdDescription("Bank Myna", "Acridotheres ginginianus", R.drawable.ba_my);
        birdList.add(Bank_Myna);

        //Jungle MynaL
        BirdDescription Jungle_Myna = new BirdDescription("Jungle Myna", "Acridotheres fuscus", R.drawable.ju_my);
        birdList.add(Jungle_Myna);

        //Hill Myna
        BirdDescription Hill_Myna = new BirdDescription("Hill Myna", "Gracula religiosa", R.drawable.h_my);
        birdList.add(Hill_Myna);


    }

    private void RobinList_MP() {
        //Indian Robin
        BirdDescription Indian_Robin = new BirdDescription("Indian Robin", "Saxicoloides fulicatus", R.drawable.in_ro);
        birdList.add(Indian_Robin);

        //Oriental Magpie Robin
        BirdDescription Oriental_Magpie_Robin = new BirdDescription("Oriental Magpie Robin", "Copsychus saularis", R.drawable.or_ro);
        birdList.add(Oriental_Magpie_Robin);

        //Indian Blue Robin
        BirdDescription Indian_Blue_Robin = new BirdDescription("Indian Blue Robin", "Luscinia brunnea", R.drawable.ind_ro);
        birdList.add(Indian_Blue_Robin);

        //Blue-fronted Robin
        BirdDescription Blue_fronted_Robin = new BirdDescription("Blue-fronted Robin", "Cinclidium frontale", R.drawable.bl_ro);
        birdList.add(Blue_fronted_Robin);

        //White-tailed Robin
        BirdDescription White_tailed_Robin = new BirdDescription("White-tailed Robin", "Myiomela leucura", R.drawable.wh_ro);
        birdList.add(White_tailed_Robin);


    }

    private void ChatList_MP() {
        //Stoliczka's Bush Chat
        BirdDescription Stoliczka_Bush_Chat = new BirdDescription("Stoliczka's Bush Chat", "Saxicola macrorhynchus", R.drawable.st_ch);
        birdList.add(Stoliczka_Bush_Chat);

        //Eastern Stonechat
        BirdDescription Eastern_Stonechat = new BirdDescription("Eastern Stonechat", "Saxicola maurus", R.drawable.e_ch);
        birdList.add(Eastern_Stonechat);

        //Pied Bush Chat
        BirdDescription Pied_Bush_Chat = new BirdDescription("Pied Bush Chat", "Saxicola caprata", R.drawable.pi_ch);
        birdList.add(Pied_Bush_Chat);

        //Grey Bush Chat
        BirdDescription Grey_Bush_Chat = new BirdDescription("Grey Bush Chat", "Saxicola ferreus", R.drawable.gr_ch);
        birdList.add(Grey_Bush_Chat);

        //Brown Rock Chat
        BirdDescription Brown_Rock_Chat = new BirdDescription("Brown Rock Chat", "Cercomela fusca", R.drawable.br_ch);
        birdList.add(Brown_Rock_Chat);


    }

    private void WeaverList_MP() {
        //Black-breasted Weaver
        BirdDescription Black_breasted_Weaver = new BirdDescription("Black-breasted Weaver", "Ploceus benghalensis", R.drawable.bl_weav);
        birdList.add(Black_breasted_Weaver);

        //Streaked Weaver
        BirdDescription Streaked_Weaver = new BirdDescription("Streaked Weaver", "Ploceus manyar", R.drawable.st_weav);
        birdList.add(Streaked_Weaver);

        //Baya Weaver
        BirdDescription Baya_Weaver = new BirdDescription("Baya Weaver", "Ploceus philippinus", R.drawable.bay);
        birdList.add(Baya_Weaver);

        //Finn's Weaver
        BirdDescription Finn_Weaver = new BirdDescription("Finn's Weaver", "Ploceus megarhynchus", R.drawable.fin);
        birdList.add(Finn_Weaver);


    }

    private void ThrushList_MP() {
        //Malabar Whistling Thrush
        BirdDescription Malabar_Whistling_Thrush = new BirdDescription("Malabar Whistling Thrush", "Myophonus horsfieldii", R.drawable.ma_th);
        birdList.add(Malabar_Whistling_Thrush);

        //Blue-capped Rock Thrush
        BirdDescription Blue_capped_Rock_Thrush = new BirdDescription("Blue-capped Rock Thrush", "Monticola cinclorhynchus", R.drawable.bl_th);
        birdList.add(Blue_capped_Rock_Thrush);

        //Blue Rock Thrush
        BirdDescription Blue_Rock_Thrush = new BirdDescription("Blue Rock Thrush", "Monticola solitarius", R.drawable.bl_thr);
        birdList.add(Blue_Rock_Thrush);

        //Plain-backed Thrush
        BirdDescription Plain_backed_Thrush = new BirdDescription("Plain-backed Thrush", "Zoothera mollissima", R.drawable.pl_th);
        birdList.add(Plain_backed_Thrush);

        //Orange-headed Thrush
        BirdDescription Orange_headed_Thrush = new BirdDescription("Orange-headed Thrush", "Geokichla citrina", R.drawable.or_th);
        birdList.add(Orange_headed_Thrush);

        //Mistle Thrush
        BirdDescription Mistle_Thrush = new BirdDescription("Mistle Thrush", "Turdus viscivorus", R.drawable.mi_th);
        birdList.add(Mistle_Thrush);

        //Tickell's Thrush
        BirdDescription Tickell_Thrush = new BirdDescription("Tickell's Thrush", "Turdus unicolor", R.drawable.ti_th);
        birdList.add(Tickell_Thrush);

        //Eyebrowed Thrush
        BirdDescription Eyebrowed_Thrush = new BirdDescription("Eyebrowed Thrush", "Turdus obscurus", R.drawable.e_th);
        birdList.add(Eyebrowed_Thrush);

        //Red-throated Thrush
        BirdDescription Red_throated_Thrush = new BirdDescription("Red-throated Thrush", "Turdus ruficollis", R.drawable.re_th);
        birdList.add(Red_throated_Thrush);

        //Indian Blackbird
        BirdDescription Indian_Blackbird = new BirdDescription("Indian Blackbird", "Turdus simillimus", R.drawable.in_bl);
        birdList.add(Indian_Blackbird);



    }

    private void SwallowList_MP() {
        //Streak-throated Swallow
        BirdDescription Streak_throated_Swallow = new BirdDescription("Streak-throated Swallow", "Petrochelidon fluvicolas", R.drawable.st_sw);
        birdList.add(Streak_throated_Swallow);

        //Red-rumped Swallow
        BirdDescription Red_rumped_Swallow = new BirdDescription("Red-rumped Swallow", "Cecropis daurica", R.drawable.re_sw);
        birdList.add(Red_rumped_Swallow);

        //Striated Swallow
        BirdDescription Striated_Swallow = new BirdDescription("Striated Swallow", "Cecropis striolata", R.drawable.str_sw);
        birdList.add(Striated_Swallow);

        //Wire-tailed Swallow
        BirdDescription Wire_tailed_Swallow = new BirdDescription("Wire-tailed Swallow", "Hirundo smithii", R.drawable.wi_sw);
        birdList.add(Wire_tailed_Swallow);

        //Barn Swallow
        BirdDescription Barn_Swallow = new BirdDescription("Barn Swallow", "Hirundo rustica", R.drawable.ba_sw);
        birdList.add(Barn_Swallow);


    }

    private void TitList_MP() {
        //Fire-capped Tit
        BirdDescription Fire_capped_Tit = new BirdDescription("Fire-capped Tit", "Cephalopyrus flammiceps", R.drawable.fi_tit);
        birdList.add(Fire_capped_Tit);

        //Cinereous Tit
        BirdDescription Cinereous_Tit = new BirdDescription("Cinereous Tit", "Parus cinereusr", R.drawable.cin_tit);
        birdList.add(Cinereous_Tit);

        //White-naped Tit
        BirdDescription White_naped_Tit = new BirdDescription("White-naped Tit", "Parus nuchalis", R.drawable.wh_tit);
        birdList.add(White_naped_Tit);

        //Black-lored Tit
        BirdDescription Black_lored_Tit = new BirdDescription("Black-lored Tit", "Parus xanthogenys", R.drawable.bl_tit);
        birdList.add(Black_lored_Tit);

        //Yellow-cheeked Tit
        BirdDescription Yellow_cheeked_Tit = new BirdDescription("Yellow-cheeked Tit", "Parus spilonotus", R.drawable.ye_tit);
        birdList.add(Yellow_cheeked_Tit);


    }

    private void PriniaList_MP() {
        //Rufous-fronted Prinia
        BirdDescription Rufous_fronted_Prinia = new BirdDescription("Rufous-fronted Prinia", "Prinia buchanani", R.drawable.ru_pri);
        birdList.add(Rufous_fronted_Prinia);

        //Grey-breasted Prinia
        BirdDescription Grey_breasted_Prinia = new BirdDescription("Grey-breasted Prinia", "Parus cinereusr", R.drawable.cin_tit);
        birdList.add(Grey_breasted_Prinia);

        //Graceful Prinia
        BirdDescription Graceful_Prinia = new BirdDescription("Graceful Prinia", "Prinia gracilis", R.drawable.gr_pri);
        birdList.add(Graceful_Prinia);

        //Jungle Prinia
        BirdDescription Jungle_Prinia = new BirdDescription("Jungle Prinia", "Prinia sylvatica", R.drawable.ju_pri);
        birdList.add(Jungle_Prinia);

        //Ashy Prinia
        BirdDescription Ashy_Prinia = new BirdDescription("Ashy Prinia", "Prinia socialis", R.drawable.as_pri);
        birdList.add(Ashy_Prinia);

        //Plain Prinia
        BirdDescription Plain_Prinia = new BirdDescription("Plain Prinia", "Prinia inornata", R.drawable.pl_pri);
        birdList.add(Plain_Prinia);


    }

    private void ShrikeList_MP() {
        //Brown Shrike
        BirdDescription Brown_Shrike = new BirdDescription("Brown Shrike", "Lanius cristatus", R.drawable.br_shr);
        birdList.add(Brown_Shrike);

        //Isabelline Shrike
        BirdDescription Isabelline_Shrike = new BirdDescription("Isabelline Shrike", "Lanius isabellinus", R.drawable.is_shr);
        birdList.add(Isabelline_Shrike);

        //Bay-backed Shrike
        BirdDescription Bay_backed_Shrike = new BirdDescription("Bay-backed Shrike", "Lanius vittatus", R.drawable.ba_shr);
        birdList.add(Bay_backed_Shrike);

        //Long-tailed Shrike
        BirdDescription Long_tailed_Shrike = new BirdDescription("Long-tailed Shrike", "Lanius schach", R.drawable.l_shr);
        birdList.add(Long_tailed_Shrike);

        //rey-backed Shrike
        BirdDescription Grey_backed_Shrike = new BirdDescription("Grey-backed Shrike", "Lanius tephronotus", R.drawable.g_shr);
        birdList.add(Grey_backed_Shrike);

        //Great Grey Shrike
        BirdDescription Great_Grey_Shrike = new BirdDescription("Great Grey Shrike", "Lanius excubitor", R.drawable.gr_shr);
        birdList.add(Great_Grey_Shrike);

    }

    private void DrongoList_MP() {
        //Black Drongo
        BirdDescription Black_Drongo = new BirdDescription("Black Drongo", "Dicrurus macrocercus", R.drawable.bl_dro);
        birdList.add(Black_Drongo);

        //Ashy Drongo
        BirdDescription Ashy_Drongo = new BirdDescription("Ashy Drongo", "Dicrurus leucophaeus", R.drawable.as_dro);
        birdList.add(Ashy_Drongo);

        //White-bellied Drongo
        BirdDescription White_bellied_Drongo = new BirdDescription("White-bellied Drongo", "Dicrurus caerulescens", R.drawable.wh_dro);
        birdList.add(White_bellied_Drongo);

        //ronzed Drongo
        BirdDescription Bronzed_Drongo = new BirdDescription("Bronzed Drongo", "Dicrurus aeneus", R.drawable.br_dro);
        birdList.add(Bronzed_Drongo);

        //Hair-crested Drongo
        BirdDescription Hair_crested_Drongo = new BirdDescription("Hair-crested Drongo", "Dicrurus hottentottus", R.drawable.h_dro);
        birdList.add(Hair_crested_Drongo);

        //Greater Racket-tailed Drongo
        BirdDescription Greater_Racket_tailed_Drongo = new BirdDescription("Greater Racket-tailed Drongo", "Dicrurus paradiseus", R.drawable.ra_dro);
        birdList.add(Greater_Racket_tailed_Drongo);

    }

    private void StarlingList_MP() {
        //Common Starling
        BirdDescription Common_Starling = new BirdDescription("Common Starling", "Sturnus vulgaris", R.drawable.co_sta);
        birdList.add(Common_Starling);

        //Rosy Starling
        BirdDescription Rosy_Starling = new BirdDescription("Rosy Starling", "Pastor roseus", R.drawable.ro_sta);
        birdList.add(Rosy_Starling);

        //Purple-backed Starling
        BirdDescription Purple_backed_Starling = new BirdDescription("Purple-backed Starling", "Agropsar sturninuss", R.drawable.pu_sta);
        birdList.add(Purple_backed_Starling);

        //Asian Pied Starling
        BirdDescription Asian_Pied_Starling = new BirdDescription("Asian Pied Starling", "Gracupica contra", R.drawable.as_sta);
        birdList.add(Asian_Pied_Starling);

        //Brahminy Starling
        BirdDescription Brahminy_Starling = new BirdDescription("Brahminy Starling", "Sturnia pagodarums", R.drawable.b_sta);
        birdList.add(Brahminy_Starling);

        //Chestnut-tailed Starling
        BirdDescription Chestnut_tailed_Starling = new BirdDescription("Chestnut-tailed Starling", "Sturnia malabarica", R.drawable.ch_sta);
        birdList.add(Chestnut_tailed_Starling);

        //White-headed Starling
        BirdDescription White_headed_Starling = new BirdDescription("White-headed Starling", "Sturnia erythropygia", R.drawable.wh_sta);
        birdList.add(White_headed_Starling);

    }


    private void FalconList_MP() {
        //Red-necked Falcon
        BirdDescription Red_necked_Falcon = new BirdDescription("Red-necked Falcon", "Falco chicquera", R.drawable.re_fa);
        birdList.add(Red_necked_Falcon);

        //Amur Falcon
        BirdDescription Amur_Falcon = new BirdDescription("Amur Falcon", "Falco amurensis", R.drawable.am_fa);
        birdList.add(Amur_Falcon);

        //Laggar Falcon
        BirdDescription Laggar_Falcon = new BirdDescription("Laggar Falcon", "Falco jugger", R.drawable.la_fa);
        birdList.add(Laggar_Falcon);

        //Saker Falcon
        BirdDescription Saker_Falcon = new BirdDescription("Saker Falcon", "Falco cherrug", R.drawable.sa_fa);
        birdList.add(Saker_Falcon);

        //Peregrine Falcon
        BirdDescription Peregrine_Falcon = new BirdDescription("Peregrine Falcon", "Falco peregrinus", R.drawable.per_fa);
        birdList.add(Peregrine_Falcon);


    }


    private void ParakeetsList_MP() {
        //Blossom-headed Parakeet
        BirdDescription Blossom_headed_Parakeet = new BirdDescription("Blossom-headed Parakeet", "Psittacula roseata", R.drawable.b_h_par);
        birdList.add(Blossom_headed_Parakeet);

        //Plum-headed Parakeet
        BirdDescription Plum_headed_Parakeet = new BirdDescription("Plum-headed Parakeet", "Psittacula cyanocephala", R.drawable.p_h_par);
        birdList.add(Plum_headed_Parakeet);

        //Alexandrine Parakeet
        BirdDescription Alexandrine_Parakeet = new BirdDescription("Alexandrine Parakeet", "Psittacula eupatria", R.drawable.al_par);
        birdList.add(Alexandrine_Parakeet);

        //Rose-ringed Parakeet
        BirdDescription Rose_ringed_Parakeet = new BirdDescription("Rose-ringed Parakeet", "Psittacula krameri", R.drawable.ro_par);
        birdList.add(Rose_ringed_Parakeet);

        //Vernal Hanging Parrot
        BirdDescription Vernal_Hanging_Parrot = new BirdDescription("Vernal Hanging Parrot", "Loriculus vernalis", R.drawable.v_par);
        birdList.add(Vernal_Hanging_Parrot);

        //Indian Pitta
        BirdDescription Indian_Pitta = new BirdDescription("Indian Pitta", "Pitta brachyura", R.drawable.pit);
        birdList.add(Indian_Pitta);


    }

    private void MinivetList_MP() {
        //White-bellied Minivet
        BirdDescription White_bellied_Minivet = new BirdDescription("White-bellied Minivet", "Pericrocotus erythropygius", R.drawable.sm_min);
        birdList.add(White_bellied_Minivet);

        //Small Minivet
        BirdDescription Small_Minivet = new BirdDescription("Small Minivet", "Pericrocotus cinnamomeus", R.drawable.p_h_par);
        birdList.add(Small_Minivet);

        //Long-tailed Minivet
        BirdDescription Long_tailed_Minivet = new BirdDescription("Long-tailed Minivet", "Psittacula eupatria", R.drawable.lo_min);
        birdList.add(Long_tailed_Minivet);

        //Scarlet Minivet
        BirdDescription Scarlet_Minivet = new BirdDescription("Scarlet Minivet", "Pericrocotus speciosus", R.drawable.sc_min);
        birdList.add(Scarlet_Minivet);

        //Ashy Minivet
        BirdDescription Ashy_Minivet = new BirdDescription("Ashy Minivet", "Pericrocotus divaricatus", R.drawable.as_min);
        birdList.add(Ashy_Minivet);

        //Rosy Minivet
        BirdDescription Rosy_Minivet = new BirdDescription("Rosy Minivet", "Pericrocotus roseus", R.drawable.ro_min);
        birdList.add(Rosy_Minivet);


    }

    private void BeeeaterList_MP() {
        //Blue-bearded Bee-eater
        BirdDescription Blue_bearded_Bee_eater = new BirdDescription("Blue-bearded Bee-eater", "Nyctyornis athertoni", R.drawable.bl_be);
        birdList.add(Blue_bearded_Bee_eater);

        //Green Bee-eater
        BirdDescription Green_Bee_eater = new BirdDescription("Green Bee-eater", "Merops orientalis", R.drawable.gr_be);
        birdList.add(Green_Bee_eater);

        //Chestnut-headed Bee-eater
        BirdDescription Chestnut_headed_Bee_eater = new BirdDescription("Chestnut-headed Bee-eater", "Merops leschenaulti", R.drawable.ch_be);
        birdList.add(Chestnut_headed_Bee_eater);

        //Blue-tailed Bee-eater
        BirdDescription Blue_tailed_Bee_eater = new BirdDescription("Blue-tailed Bee-eater", "Merops philippinus", R.drawable.blu_be);
        birdList.add(Blue_tailed_Bee_eater);

        //Blue-cheeked Bee-eater
        BirdDescription Blue_cheeked_Bee_eater = new BirdDescription("Blue-cheeked Bee-eater", "Merops persicus", R.drawable.bl_ch_be);
        birdList.add(Blue_cheeked_Bee_eater);

        //European Bee-eater
        BirdDescription European_Bee_eater = new BirdDescription("European Bee-eater", "Merops apiaster", R.drawable.eu_be);
        birdList.add(European_Bee_eater);

    }

    private void CuckooshrikeList_MP() {
        //BLarge Cuckooshrike
        BirdDescription Large_Cuckooshrike = new BirdDescription("Large Cuckooshrike", "Coracina macei", R.drawable.la_cuck);
        birdList.add(Large_Cuckooshrike);

        //Andaman Cuckooshrike
        BirdDescription Andaman_Cuckooshrike = new BirdDescription("Andaman Cuckooshrike", "Coracina dobsoni", R.drawable.and_cuck);
        birdList.add(Andaman_Cuckooshrike);

        //Black-winged Cuckooshrike
        BirdDescription Black_winged_Cuckooshrike = new BirdDescription("Black-winged Cuckooshrike", "Coracina melaschistos", R.drawable.bl_cuck);
        birdList.add(Black_winged_Cuckooshrike);

        //Black-headed Cuckooshrike
        BirdDescription Black_headed_Cuckooshrike = new BirdDescription("Black-headed Cuckooshrike", "Coracina melanoptera", R.drawable.bl_h_cuck);
        birdList.add(Black_headed_Cuckooshrike);

    }

    private void OrioleList_MP() {
        //Maroon Oriole
        BirdDescription Maroon_Oriole = new BirdDescription("Maroon Oriole", "Oriolus traillii", R.drawable.ma_or);
        birdList.add(Maroon_Oriole);

        //Black-hooded Oriole
        BirdDescription Black_hooded_Oriole = new BirdDescription("Black-hooded Oriole", "Oriolus xanthornus", R.drawable.bl_or);
        birdList.add(Black_hooded_Oriole);

        //Indian Golden Oriole
        BirdDescription Indian_Golden_Oriole = new BirdDescription("Indian Golden Oriole", "Oriolus kundoos", R.drawable.ind_or);
        birdList.add(Indian_Golden_Oriole);

        //Black-naped Oriole
        BirdDescription Black_naped_Oriole = new BirdDescription("Black-naped Oriole", "Oriolus chinensis", R.drawable.bl_na_or);
        birdList.add(Black_naped_Oriole);

    }

    private void KingfisherList_MP() {
        //Common Kingfisher
        BirdDescription Common_Kingfisher = new BirdDescription("Common Kingfisher", "Alcedo atthis", R.drawable.c_king);
        birdList.add(Common_Kingfisher);

        //Pied Kingfisher
        BirdDescription Pied_Kingfisher = new BirdDescription("Pied Kingfisher", "Ceryle rudis", R.drawable.p_king);
        birdList.add(Pied_Kingfisher);

        //Stork-billed Kingfisher
        BirdDescription Stork_billed_Kingfisher = new BirdDescription("Stork-billed Kingfisher", "Pelargopsis capensis", R.drawable.st_king);
        birdList.add(Stork_billed_Kingfisher);

        //Ruddy Kingfisher
        BirdDescription Ruddy_Kingfisher = new BirdDescription("Ruddy Kingfisher", "Halcyon coromanda", R.drawable.ru_king);
        birdList.add(Ruddy_Kingfisher);

        //White-throated Kingfisher
        BirdDescription White_throated_Kingfisher = new BirdDescription("White-throated Kingfisher", "Halcyon smyrnensis", R.drawable.wh_king);
        birdList.add(White_throated_Kingfisher);

        //Black-capped Kingfisher
        BirdDescription Black_capped_Kingfisher = new BirdDescription("Black-capped Kingfisher", "Halcyon pileata", R.drawable.bl_king);
        birdList.add(Black_capped_Kingfisher);

    }

    private void VultureList_MP() {
        //Egyptian Vulture
        BirdDescription Egyptian_Vulture = new BirdDescription("Egyptian Vulture", "Neophron percnopterus", R.drawable.eg_vul);
        birdList.add(Egyptian_Vulture);

        //ed-headed Vulture
        BirdDescription Red_headed_Vulture = new BirdDescription("Red-headed Vulture", "Sarcogyps calvus", R.drawable.r_h_vul);
        birdList.add(Red_headed_Vulture);

        //White-rumped Vulture
        BirdDescription White_rumped_Vulture = new BirdDescription("White-rumped Vulture", "Gyps bengalensis", R.drawable.w_r_vul);
        birdList.add(White_rumped_Vulture);

        //Indian Vulture
        BirdDescription Indian_Vulture = new BirdDescription("Indian Vulture", "Gyps indicus", R.drawable.i_vul);
        birdList.add(Indian_Vulture);

        //Griffon Vulture
        BirdDescription Griffon_Vulture = new BirdDescription("Griffon Vulture", "Gyps fulvus", R.drawable.gr_vul);
        birdList.add(Griffon_Vulture);

        //Cinereous Vulture
        BirdDescription Cinereous_Vulture = new BirdDescription("Cinereous Vulture", "Aegypius monachus", R.drawable.c_vul);
        birdList.add(Cinereous_Vulture);

    }

    private void PipitList_MP() {
        //Tree Pipit
        BirdDescription Tree_Pipit = new BirdDescription("Tree Pipit", "Anthus trivialis", R.drawable.tr_pipit);
        birdList.add(Tree_Pipit);

        //Olive-backed Pipit
        BirdDescription Olive_backed_Pipit = new BirdDescription("Olive-backed Pipit", "Anthus hodgsoni", R.drawable.ol_pip);
        birdList.add(Olive_backed_Pipit);

        //osy Pipit
        BirdDescription Rosy_Pipit = new BirdDescription("Rosy Pipit", "Anthus roseatus", R.drawable.ro_pip);
        birdList.add(Rosy_Pipit);

        //Richard's Pipit
        BirdDescription Richard_Pipit = new BirdDescription("Richard's Pipit", "Anthus richardi", R.drawable.rich_pip);
        birdList.add(Richard_Pipit);

        //Paddyfield Pipit
        BirdDescription Paddyfield_Pipit = new BirdDescription("Paddyfield Pipit", "Anthus rufulus", R.drawable.pad_pip);
        birdList.add(Paddyfield_Pipit);

        //Blyth's Pipit
        BirdDescription Blyth_Pipit = new BirdDescription("Blyth's Pipit", "Anthus godlewskii", R.drawable.bly_pip);
        birdList.add(Blyth_Pipit);

        //Tawny Pipit
        BirdDescription Tawny_Pipit = new BirdDescription("Tawny Pipit", "Anthus campestris", R.drawable.ta_pip);
        birdList.add(Tawny_Pipit);

        //Long-billed Pipit
        BirdDescription Long_billed_Pipit = new BirdDescription("Long-billed Pipit", "Anthus similis", R.drawable.l_bil_pip);
        birdList.add(Long_billed_Pipit);

    }


    private void LapwingList_MP() {
        //Northern Lapwing
        BirdDescription Northern_Lapwing = new BirdDescription("Northern Lapwing", "Vanellus vanellus", R.drawable.nor_lap);
        birdList.add(Northern_Lapwing);

        //River Lapwing
        BirdDescription River_Lapwing = new BirdDescription("River Lapwing", "Vanellus duvauceliih", R.drawable.riv_lap);
        birdList.add(River_Lapwing);

        //Yellow-wattled Lapwing
        BirdDescription Yellow_wattled_Lapwing = new BirdDescription("Yellow-wattled Lapwing", "Vanellus malabaricus", R.drawable.ye_lap);
        birdList.add(Yellow_wattled_Lapwing);

        //Grey-headed Lapwing
        BirdDescription Grey_headed_Lapwing = new BirdDescription("Grey-headed Lapwing", "Vanellus cinereus", R.drawable.gr_lap);
        birdList.add(Grey_headed_Lapwing);

        //Red-wattled Lapwing
        BirdDescription Red_wattled_Lapwing = new BirdDescription("Red-wattled Lapwing", "Vanellus indicus", R.drawable.re_lap);
        birdList.add(Red_wattled_Lapwing);

        //Sociable Lapwing
        BirdDescription Sociable_Lapwing = new BirdDescription("Sociable Lapwing", "Vanellus gregarius", R.drawable.so_lap);
        birdList.add(Sociable_Lapwing);

        //White-tailed Lapwing
        BirdDescription White_tailed_Lapwing = new BirdDescription("White-tailed Lapwing", "Vanellus leucurus", R.drawable.wh_lap);
        birdList.add(White_tailed_Lapwing);
    }

    private void CoucalList_MP() {
        //Greater Coucal
        BirdDescription Greater_Coucal = new BirdDescription("Greater Coucal", "Centropus sinensis", R.drawable.gr_co);
        birdList.add(Greater_Coucal);
    }

    private void MonarchList_MP() {
        //Black-naped Monarch
        BirdDescription Black_naped_Monarch = new BirdDescription("Black-naped Monarch", "Hypothymis azurea", R.drawable.bl_mon);
        birdList.add(Black_naped_Monarch);
    }

    private void TroganList_MP() {
        //Malabar Trogon
        BirdDescription Malabar_Trogon = new BirdDescription("Malabar Trogon", "Harpactes fasciatus", R.drawable.trog);
        birdList.add(Malabar_Trogon);
    }

    private void OspreyList_MP() {
        //Osprey
        BirdDescription Osprey = new BirdDescription("Osprey", "Pandion haliaetus", R.drawable.os);
        birdList.add(Osprey);
    }

    private void WryneckList_MP() {
        //Northern Wryneck
        BirdDescription Northern_Wryneck = new BirdDescription("Northern Wryneck", "Jynx torquilla", R.drawable.wry);
        birdList.add(Northern_Wryneck);

        //Speckled Piculet
        BirdDescription Speckled_Piculet = new BirdDescription("Speckled Piculet", "Picumnus innominatus", R.drawable.sp_pic);
        birdList.add(Speckled_Piculet);
    }

    private void RedstartList_MP() {
        //Blue-fronted Redstart
        BirdDescription Blue_fronted_Redstart = new BirdDescription("Blue-fronted Redstart", "Jynx torquilla", R.drawable.bl_red);
        birdList.add(Blue_fronted_Redstart);

        //Black Redstart
        BirdDescription Black_Redstart = new BirdDescription("Black Redstart", "Phoenicurus ochruros", R.drawable.bla_red);
        birdList.add(Black_Redstart);
    }

    private void CisticolakList_MP() {
        //Zitting Cisticola
        BirdDescription Zitting_Cisticola = new BirdDescription("Zitting Cisticola", "Cisticola juncidis", R.drawable.z_ci);
        birdList.add(Zitting_Cisticola);

        //Golden-headed Cisticola
        BirdDescription Golden_headed_Cisticola = new BirdDescription("Golden-headed Cisticola", "Cisticola exilis", R.drawable.g_ci);
        birdList.add(Golden_headed_Cisticola);
    }



    private void TreepieList_MP() {
        //Rufous Treepie
        BirdDescription Rufous_Treepie = new BirdDescription("Rufous Treepie", "Dendrocitta vagabunda", R.drawable.ru_tre);
        birdList.add(Rufous_Treepie);

        //Eurasian Jackdaw
        BirdDescription Eurasian_Jackdaw = new BirdDescription("Eurasian Jackdaw", "Corvus monedula", R.drawable.eu_ja);
        birdList.add(Eurasian_Jackdaw);
    }

    private void FantailList_MP() {
        //White-browed Fantail
        BirdDescription White_browed_Fantail = new BirdDescription("White-browed Fantail", "Rhipidura aureola", R.drawable.w_fan);
        birdList.add(White_browed_Fantail);

        //White-throated Fantail
        BirdDescription White_throated_Fantail = new BirdDescription("White-throated Fantail", "Rhipidura albicollis", R.drawable.w_t_fan);
        birdList.add(White_throated_Fantail);
    }

    private void KestrelList_MP() {
        //Lesser Kestrel
        BirdDescription Lesser_Kestrel = new BirdDescription("Lesser Kestrel", "Falco naumanni", R.drawable.l_kes);
        birdList.add(Lesser_Kestrel);

        //Common Kestrel
        BirdDescription Common_Kestrel = new BirdDescription("Common Kestrel", "Falco tinnunculus", R.drawable.c_kes);
        birdList.add(Common_Kestrel);
    }

    private void HobbyList_MP() {
        //Eurasian Hobby
        BirdDescription Eurasian_Hobby = new BirdDescription("Eurasian Hobby", "Falco subbuteo", R.drawable.eu_hob);
        birdList.add(Eurasian_Hobby);

        //Oriental Hobby
        BirdDescription Oriental_Hobby = new BirdDescription("Oriental Hobby", "Falco severus", R.drawable.or_hob);
        birdList.add(Oriental_Hobby);
    }


    private void GeeseList_MP() {
        //Red-breasted Goose
        BirdDescription Red_breasted_Goose = new BirdDescription("Red-breasted Goose", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Red_breasted_Goose);

        //Bar-headed Goose
        BirdDescription Bar_headed_Goose = new BirdDescription("Bar-headed Goose", "8 types in Madhya Pradesh", R.drawable.l_whistling_duck);
        birdList.add(Bar_headed_Goose);

        //Greylag Goose
        BirdDescription Greylag_Goose = new BirdDescription("Greylag Goose", "8 types in Madhya Pradesh", R.drawable.tufted_duck);
        birdList.add(Greylag_Goose);

        //Asian Pygmy Goose
        BirdDescription Asian_Pygmy_Goose = new BirdDescription("Asian Pygmy Goose", "8 types in Madhya Pradesh", R.drawable.falcated_duck);
        birdList.add(Asian_Pygmy_Goose);

    }

    private void HornbillList_MP() {
        //Malabar Pied Hornbill
        BirdDescription Malabar_Pied_Hornbill = new BirdDescription("Malabar Pied Hornbill", "Anthracoceros coronatus", R.drawable.mal_horn);
        birdList.add(Malabar_Pied_Hornbill);

        //Oriental Pied Hornbill
        BirdDescription Oriental_Pied_Hornbill = new BirdDescription("Oriental Pied Hornbill", "Anthracoceros albirostris", R.drawable.or_horn);
        birdList.add(Oriental_Pied_Hornbill);

        //Indian Grey Hornbill
        BirdDescription Indian_Grey_Hornbill = new BirdDescription("Indian Grey Hornbill", "Ocyceros birostris", R.drawable.ind_horn);
        birdList.add(Indian_Grey_Hornbill);


    }

    private void BarbetsList_MP() {
        //Malabar Pied Hornbill
        BirdDescription Brown_headed_Barbet = new BirdDescription("Brown-headed Barbet", "Megalaima zeylanica", R.drawable.br_bar);
        birdList.add(Brown_headed_Barbet);

        //Coppersmith Barbet
        BirdDescription Coppersmith_Barbet = new BirdDescription("Coppersmith Barbet", "Megalaima haemacephala", R.drawable.cop_bar);
        birdList.add(Coppersmith_Barbet);



    }

    private void ShikraList_MP() {
        //Shikra
        BirdDescription Shikra = new BirdDescription("Shikra", "Accipiter badius", R.drawable.sh);
        birdList.add(Shikra);

        //Besra
        BirdDescription Besra = new BirdDescription("Besra", "Accipiter virgatus", R.drawable.bes);
        birdList.add(Besra);



    }

    private void WoodshrikeList_MP() {
        //Large Woodshrike
        BirdDescription Large_Woodshrike = new BirdDescription("Large Woodshrike", "Tephrodornis gularis", R.drawable.l_wood);
        birdList.add(Large_Woodshrike);

        //Common Woodshrike
        BirdDescription Common_Woodshrike = new BirdDescription("Common Woodshrike", "Tephrodornis pondicerianus", R.drawable.c_wood);
        birdList.add(Common_Woodshrike);



    }

    private void IoraList_MP() {
        //Common Iora
        BirdDescription Common_Iora = new BirdDescription("Common Iora", "Aegithina tiphia", R.drawable.c_io);
        birdList.add(Common_Iora);

        //Marshall's Iora
        BirdDescription Marshall_Iora = new BirdDescription("Marshall's Iora", "Aegithina nigrolutea", R.drawable.m_io);
        birdList.add(Marshall_Iora);



    }

    private void SparrowhawkList_MP() {
        //Eurasian Sparrowhawk
        BirdDescription Eurasian_Sparrowhawk = new BirdDescription("Eurasian Sparrowhawk", "Accipiter nisus", R.drawable.spar);
        birdList.add(Eurasian_Sparrowhawk);

        //Northern Goshawk
        BirdDescription Northern_Goshawk = new BirdDescription("Northern Goshawk", "Accipiter gentilis", R.drawable.nor_go);
        birdList.add(Northern_Goshawk);

        //Crested Goshawk
        BirdDescription Crested_Goshawk = new BirdDescription("Crested Goshawk", "Accipiter trivirgatus", R.drawable.cre_go);
        birdList.add(Crested_Goshawk);



    }
    private void NutList_MP() {
        //Chestnut-bellied Nuthatch
        BirdDescription Chestnut_bellied_Nuthatch = new BirdDescription("Chestnut-bellied Nuthatch", "Sitta cinnamoventris", R.drawable.ch_nu);
        birdList.add(Chestnut_bellied_Nuthatch);

        //Velvet-fronted Nuthatch
        BirdDescription Velvet_fronted_Nuthatch = new BirdDescription("Velvet-fronted Nuthatch", "Sitta frontalis", R.drawable.ve_nu);
        birdList.add(Velvet_fronted_Nuthatch);

        //Indian Salpornis
        BirdDescription Indian_Salpornis = new BirdDescription("Indian Salpornis", "Salpornis spilonotus", R.drawable.in_sa);
        birdList.add(Indian_Salpornis);



    }


    private void BuzzardList_MP() {
        //White-eyed Buzzard
        BirdDescription White_eyed_Buzzard = new BirdDescription("White-eyed Buzzard", "Butastur teesa", R.drawable.w_buzz);
        birdList.add(White_eyed_Buzzard);

        //Eurasian Buzzard
        BirdDescription Eurasian_Buzzard = new BirdDescription("Eurasian Buzzard", "Buteo buteo", R.drawable.eu_buzz);
        birdList.add(Eurasian_Buzzard);

        //Long-legged Buzzard
        BirdDescription Long_legged_Buzzard = new BirdDescription("Long-legged Buzzard", "Buteo rufinus", R.drawable.l_l_buzz);
        birdList.add(Long_legged_Buzzard);

    }


    private void MalkohaList_MP() {
        //Sirkeer Malkoha
        BirdDescription Sirkeer_Malkoha = new BirdDescription("Sirkeer Malkoha", "Phaenicophaeus leschenaultiir", R.drawable.si_malk);
        birdList.add(Sirkeer_Malkoha);

        //Blue-faced Malkoha
        BirdDescription Blue_faced_Malkoha = new BirdDescription("Blue-faced Malkoha", "Phaenicophaeus viridirostris", R.drawable.bl_malk);
        birdList.add(Blue_faced_Malkoha);

        //Green-billed Malkoha
        BirdDescription Green_billed_Malkoha = new BirdDescription("Green-billed Malkoha", "Phaenicophaeus tristis", R.drawable.gr_malk);
        birdList.add(Green_billed_Malkoha);

    }

    private void KiteList_MP() {
        //Brahminy Kite
        BirdDescription Brahminy_Kite = new BirdDescription("Brahminy Kite", "Haliastur indus", R.drawable.br_ki);
        birdList.add(Brahminy_Kite);

        //Black Kite
        BirdDescription Black_Kite = new BirdDescription("Black Kite", "Milvus migrans", R.drawable.bl_ki);
        birdList.add(Black_Kite);

    }

    private void RosefinchList_MP() {
        //Common Rosefinch
        BirdDescription Common_Rosefinch = new BirdDescription("Common Rosefinch", "Carpodacus erythrinus", R.drawable.rose);
        birdList.add(Common_Rosefinch);



    }


    private void CrowList_MP() {
        //House Crow
        BirdDescription House_Crow = new BirdDescription("House Crow", "Corvus splendens", R.drawable.cr);
        birdList.add(House_Crow);

        //Large-billed Crow
        BirdDescription Large_billed_Crow = new BirdDescription("Large-billed Crow", "Corvus macrorhynchos", R.drawable.l_cr);
        birdList.add(Large_billed_Crow);

    }
    private void FloricanList_MP() {
        //Lesser Florican
        BirdDescription Lesser_Florican = new BirdDescription("Lesser Florican", "Sypheotides indicus", R.drawable.l_flor);
        birdList.add(Lesser_Florican);



    }

    private void PratincoleList_MP() {
        //Oriental Pratincole
        BirdDescription Oriental_Pratincole = new BirdDescription("Oriental Pratincole", "Glareola maldivarum", R.drawable.or_prat);
        birdList.add(Oriental_Pratincole);

        //Little Pratincole
        BirdDescription Little_Pratincole = new BirdDescription("Little Pratincole", "Glareola lactea", R.drawable.li_prat);
        birdList.add(Little_Pratincole);


    }

    private void SparrowList_MP() {
        //House Sparrow
        BirdDescription House_Sparrow = new BirdDescription("House Sparrow", "Passer domesticus\n", R.drawable.ho_spa);
        birdList.add(House_Sparrow);

        //Spanish Sparrow
        BirdDescription Spanish_Sparrow = new BirdDescription("Spanish Sparrow", "Passer hispaniolensis", R.drawable.spa_spa);
        birdList.add(Spanish_Sparrow);

        //Chestnut-shouldered Bush Sparrow
        BirdDescription Chestnut_shouldered_Bush_Sparrow = new BirdDescription("Chestnut-shouldered Bush Sparrow", "Petronia xanthocollis", R.drawable.c_b_spa);
        birdList.add(Chestnut_shouldered_Bush_Sparrow);

    }

    private void CourserList_MP() {
        //Jerdon's Courser
        BirdDescription Jerdon_Courser = new BirdDescription("Jerdon's Courser", "Rhinoptilus bitorquatus", R.drawable.je_co);
        birdList.add(Jerdon_Courser);

        //Cream-coloured Courser
        BirdDescription Cream_coloured_Courser = new BirdDescription("Cream-coloured Courser", "Cursorius cursorh", R.drawable.cre_co);
        birdList.add(Cream_coloured_Courser);

        //Indian Courser
        BirdDescription Indian_Courser = new BirdDescription("Indian Courser", "Cursorius coromandelicus", R.drawable.in_co);
        birdList.add(Indian_Courser);

    }

    private void ButtonquailList_MP() {
        //Common Buttonquail
        BirdDescription Common_Buttonquail = new BirdDescription("Common Buttonquail", "Turnix sylvaticus", R.drawable.co_button);
        birdList.add(Common_Buttonquail);

        //Yellow-legged Buttonquail
        BirdDescription Yellow_legged_Buttonquail = new BirdDescription("Yellow-legged Buttonquail", "Turnix tanki", R.drawable.yell_button);
        birdList.add(Yellow_legged_Buttonquail);

        //Barred Buttonquail
        BirdDescription Barred_Buttonquail = new BirdDescription("Barred Buttonquail", "Turnix suscitator", R.drawable.bar_button);
        birdList.add(Barred_Buttonquail);



    }

    private void AvadavatList_MP() {
        //Red Avadavat
        BirdDescription Red_Avadavat = new BirdDescription("Red Avadavat", "Amandava amandava", R.drawable.r_av);
        birdList.add(Red_Avadavat);

        //YGreen Avadavat
        BirdDescription Green_Avadavat = new BirdDescription("Green Avadavat", "Amandava formosa", R.drawable.g_av);
        birdList.add(Green_Avadavat);


    }

    private void EgretList_MP() {
        //Cattle Egret
        BirdDescription Cattle_Egret = new BirdDescription("Cattle Egret", "Bubulcus ibis", R.drawable.c_eg);
        birdList.add(Cattle_Egret);

        //Great Egret
        BirdDescription Great_Egret = new BirdDescription("Great Egret", "Ardea alba", R.drawable.gr_egret);
        birdList.add(Great_Egret);

        //Intermediate Egret
        BirdDescription Intermediate_Egret = new BirdDescription("Intermediate Egret", "Ardea intermedia", R.drawable.in_eg);
        birdList.add(Intermediate_Egret);

        //Little Egret
        BirdDescription Little_Egret = new BirdDescription("Little Egret", "Egretta garzetta", R.drawable.li_egr);
        birdList.add(Little_Egret);

        //Western Reef Egret
        BirdDescription Western_Reef_Egret = new BirdDescription("Western Reef Egret", "Egretta gularis", R.drawable.we_egr);
        birdList.add(Western_Reef_Egret);

    }


    private void MuniaList_MP() {
        //White-rumped Munia
        BirdDescription White_rumped_Munia = new BirdDescription("Lonchura striata", "Bubulcus ibis", R.drawable.w_r_mun);
        birdList.add(White_rumped_Munia);

        //Scaly-breasted Munia
        BirdDescription Scaly_breasted_Munia = new BirdDescription("Scaly-breasted Munia", "Lonchura punctulata", R.drawable.sc_mun);
        birdList.add(Scaly_breasted_Munia);

        //Black-throated Munia
        BirdDescription Black_throated_Munia = new BirdDescription("Black-throated Munia", "Lonchura kelaarti", R.drawable.bl_thr_mun);
        birdList.add(Black_throated_Munia);

        //Black-headed Munia
        BirdDescription Black_headed_Munia = new BirdDescription("Black-headed Munia", "Lonchura atricapilla", R.drawable.bl_mun);
        birdList.add(Black_headed_Munia);


    }

    private void HarrierList_MP() {
        //Western Marsh Harrier
        BirdDescription Western_Marsh_Harrier = new BirdDescription("Western Marsh Harrier", "Circus aeruginosus", R.drawable.w_m_har);
        birdList.add(Western_Marsh_Harrier);

        //Hen Harrier
        BirdDescription Hen_Harrier = new BirdDescription("Hen Harrier", "Circus cyaneus", R.drawable.h_har);
        birdList.add(Hen_Harrier);

        //Pallid Harrier
        BirdDescription Pallid_Harrier = new BirdDescription("Pallid Harrier", "Circus macrourus", R.drawable.p_har);
        birdList.add(Pallid_Harrier);

        //Pied Harrier
        BirdDescription Pied_Harrier = new BirdDescription("Pied Harrier", "Circus melanoleucos", R.drawable.pi_har);
        birdList.add(Pied_Harrier);

        //Montagu's Harrier
        BirdDescription Montagu_Harrier = new BirdDescription("Montagu's Harrier", "Circus pygargus", R.drawable.m_har);
        birdList.add(Montagu_Harrier);

    }

    private void BustardList_MP() {
        //Great Indian Bustard
        BirdDescription Great_Indian_Bustard = new BirdDescription("Great Indian Bustard", "Ardeotis nigriceps", R.drawable.gr_in_bus);
        birdList.add(Great_Indian_Bustard);

        //Macqueen's Bustard
        BirdDescription Macqueen_Bustard = new BirdDescription("Macqueen's Bustard", "Chlamydotis macqueenii", R.drawable.mac_bus);
        birdList.add(Macqueen_Bustard);


    }

    private void ThickList_MP() {
        //Eurasian Thick-knee
        BirdDescription Eurasian_Thick_knee = new BirdDescription("Eurasian Thick-knee", "Burhinus oedicnemus", R.drawable.eu_th);
        birdList.add(Eurasian_Thick_knee);

        //Great Thick-knee
        BirdDescription Great_Thick_knee = new BirdDescription("Great Thick-knee", "Esacus recurvirostris", R.drawable.gr_th);
        birdList.add(Great_Thick_knee);


    }

    private void FlowerpeckerList_MP() {
        //hick-billed Flowerpecker
        BirdDescription Thick_billed_Flowerpecker = new BirdDescription("Thick-billed Flowerpecker", "Dicaeum agile", R.drawable.th_flo);
        birdList.add(Thick_billed_Flowerpecker);

        //Pale-billed Flowerpecker
        BirdDescription Pale_billed_Flowerpecker = new BirdDescription("Pale-billed Flowerpecker", "Dicaeum erythrorhynchos", R.drawable.p_b_flo);
        birdList.add(Pale_billed_Flowerpecker);


    }


    private void TealsList_MP() {
        //Marbled Teal
        BirdDescription Marbled_Teal = new BirdDescription("Marbled Teal", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Marbled_Teal);

        //Baikal Teal
        BirdDescription Baikal_Teal = new BirdDescription("Baikal Teal", "8 types in Madhya Pradesh", R.drawable.l_whistling_duck);
        birdList.add(Baikal_Teal);

        //Tufted Duck
        BirdDescription Tufted_Duck = new BirdDescription("Tufted Duck", "8 types in Madhya Pradesh", R.drawable.tufted_duck);
        birdList.add(Tufted_Duck);

        //Common Teal
        BirdDescription Common_Teal = new BirdDescription("Common Teal", "8 types in Madhya Pradesh", R.drawable.falcated_duck);
        birdList.add(Common_Teal);

    }

    private void NightjarList_MP() {
        //Grey Nightjar
        BirdDescription Grey_Nightjar = new BirdDescription("Grey Nightjar", "Caprimulgus jotaka", R.drawable.gr_ni);
        birdList.add(Grey_Nightjar);

        //European Nightjar
        BirdDescription European_Nightjar = new BirdDescription("European Nightjar", "Caprimulgus europaeus", R.drawable.eu_ni);
        birdList.add(European_Nightjar);

        //Sykes's Nightjar
        BirdDescription Sykes_Nightjar = new BirdDescription("Sykes's Nightjar", "Caprimulgus mahrattensis", R.drawable.sk_ni);
        birdList.add(Sykes_Nightjar);

        //Large-tailed Nightjar
        BirdDescription Large_tailed_Nightjar = new BirdDescription("Large-tailed Nightjar", "Caprimulgus macrurus", R.drawable.lt_ni);
        birdList.add(Large_tailed_Nightjar);

        //Indian Nightjar
        BirdDescription Indian_Nightjar = new BirdDescription("Indian Nightjar", "Caprimulgus asiaticus", R.drawable.in_ni);
        birdList.add(Indian_Nightjar);

        //Savanna Nightjar
        BirdDescription Savanna_Nightjar = new BirdDescription("Savanna Nightjar", "Caprimulgus affinis", R.drawable.sv_ni);
        birdList.add(Savanna_Nightjar);

    }

    private void SandgrouseList_MP() {
        //Chestnut-bellied Sandgrouse
        BirdDescription Chestnut_bellied_Sandgrouse = new BirdDescription("Chestnut-bellied Sandgrouse", "Pterocles exustus", R.drawable.c_bellied_sand);
        birdList.add(Chestnut_bellied_Sandgrouse);

        //Spotted Sandgrouse
        BirdDescription Spotted_Sandgrouse = new BirdDescription("Spotted Sandgrouse", "Pterocles senegallus", R.drawable.sp_sand);
        birdList.add(Spotted_Sandgrouse);

        //Black-bellied Sandgrouse
        BirdDescription Black_bellied_Sandgrouse = new BirdDescription("Black-bellied Sandgrouse", "Pterocles orientalis", R.drawable.bl_sand);
        birdList.add(Black_bellied_Sandgrouse);

        //Painted Sandgrouse
        BirdDescription Painted_Sandgrouse = new BirdDescription("Painted Sandgrouse", "Pterocles indicus", R.drawable.pain_sand);
        birdList.add(Painted_Sandgrouse);

    }

    private void DoveList_MP() {
        //Oriental Turtle Dove
        BirdDescription Oriental_Turtle_Dove = new BirdDescription("Oriental Turtle Dove", "Streptopelia orientalis", R.drawable.or_dove);
        birdList.add(Oriental_Turtle_Dove);

        //Eurasian Collared Dove
        BirdDescription Eurasian_Collared_Dove = new BirdDescription("Eurasian Collared Dove", "Streptopelia decaocto", R.drawable.or_coll_dov);
        birdList.add(Eurasian_Collared_Dove);

        //Red Collared Dove
        BirdDescription Red_Collared_Dove = new BirdDescription("Red Collared Dove", "Streptopelia tranquebarica", R.drawable.red_coll_dov);
        birdList.add(Red_Collared_Dove);

        //Spotted-necked Dove
        BirdDescription Spotted_necked_Dove = new BirdDescription("Spotted-necked Dove", "Spilopelia chinensis", R.drawable.sp_dov);
        birdList.add(Spotted_necked_Dove);

        //Laughing Dove
        BirdDescription Laughing_Dove = new BirdDescription("Laughing Dove", "Spilopelia senegalensis", R.drawable.la_dov);
        birdList.add(Laughing_Dove);

        //Emerald Dove
        BirdDescription Emerald_Dove = new BirdDescription("Emerald Dove", "Chalcophaps indica", R.drawable.em_dov);
        birdList.add(Emerald_Dove);

    }

    private void TealList_MP() {
        //Marbled Teal
        BirdDescription Marbled_Teal = new BirdDescription("Marbled Teal", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Marbled_Teal);

        //Baikal Teal
        BirdDescription Baikal_Teal = new BirdDescription("Baikal Teal", "8 types in Madhya Pradesh", R.drawable.l_whistling_duck);
        birdList.add(Baikal_Teal);


        //Common Teal
        BirdDescription Common_Teal = new BirdDescription("Common Teal", "8 types in Madhya Pradesh", R.drawable.falcated_duck);
        birdList.add(Common_Teal);

    }

    private void FrancolinsList_MP() {
        //Black Francolin
        BirdDescription Black_Francolin = new BirdDescription("Black Francolin", "Francolinus francolinus", R.drawable.black_franc);
        birdList.add(Black_Francolin);

        //Painted Francolin
        BirdDescription Painted_Francolin = new BirdDescription("Painted Francolin", "Francolinus pictus", R.drawable.painted_fra);
        birdList.add(Painted_Francolin);

        //Grey Francolin
        BirdDescription Grey_Francolin = new BirdDescription("Grey Francolin", "Francolinus pondicerianus", R.drawable.grey_francolin);
        birdList.add(Grey_Francolin);


    }

    private void PigeonList_MP() {
        //Pale-backed Pigeon
        BirdDescription Pale_backed_Pigeon = new BirdDescription("Pale-backed Pigeon", "Columba eversmanni", R.drawable.pale_backed_pig);
        birdList.add(Pale_backed_Pigeon);

        //Pale-capped Pigeon
        BirdDescription Pale_capped_Pigeon = new BirdDescription("Pale-capped Pigeon", "Columba punicea", R.drawable.pale_capped_pig);
        birdList.add(Pale_capped_Pigeon);

        //Orange-breasted Green Pigeon
        BirdDescription Orange_breasted_Green_Pigeon = new BirdDescription("Orange-breasted Green Pigeon", "Treron bicinctus", R.drawable.orange_breasted_pig);
        birdList.add(Orange_breasted_Green_Pigeon);

        //Pale-capped Pigeon
        BirdDescription Yellow_legged_Green_Pigeon = new BirdDescription("Yellow-legged Green Pigeon", " Treron phoenicoptera", R.drawable.yellow_legged_pig);
        birdList.add(Yellow_legged_Green_Pigeon);

        //Wedge-tailed Green Pigeon
        BirdDescription Wedge_tailed_Green_Pigeon = new BirdDescription("Wedge-tailed Green Pigeon", "Treron sphenurus", R.drawable.w_t_pig);
        birdList.add(Wedge_tailed_Green_Pigeon);

        //Green Imperial Pigeon
        BirdDescription Green_Imperial_Pigeon = new BirdDescription("Green Imperial Pigeon", "Ducula aenea", R.drawable.green_pig);
        birdList.add(Green_Imperial_Pigeon);


    }

    private void PloverList_MP() {
        //Grey Plover
        BirdDescription Grey_Plover = new BirdDescription("Grey Plover", "Pluvialis squatarola", R.drawable.gr_plo);
        birdList.add(Grey_Plover);

        //Pacific Golden Plover
        BirdDescription Pacific_Golden_Plover = new BirdDescription("Pacific Golden Plover", "Pluvialis fulva", R.drawable.gol_plo);
        birdList.add(Pacific_Golden_Plover);

        //Common Ringed Plover
        BirdDescription Common_Ringed_Plover = new BirdDescription("Common Ringed Plover", "Treron bicinctus", R.drawable.ri_plo);
        birdList.add(Common_Ringed_Plover);

        //ong-billed Plover
        BirdDescription Long_billed_Plover = new BirdDescription("Long-billed Plover", "Charadrius placidus", R.drawable.l_b_plo);
        birdList.add(Long_billed_Plover);

        //Little Ringed Plover
        BirdDescription Little_Ringed_Plover = new BirdDescription("Little Ringed Plover", "Charadrius dubius", R.drawable.li_r_plo);
        birdList.add(Little_Ringed_Plover);

        //Kentish Plover
        BirdDescription Kentish_Plover = new BirdDescription("Kentish Plover", "Charadrius alexandrinus", R.drawable.ke_plo);
        birdList.add(Kentish_Plover);

        //Lesser Sand Plover
        BirdDescription Lesser_Sand_Plover = new BirdDescription("Lesser Sand Plover", "Charadrius mongolus", R.drawable.le_sa_plo);
        birdList.add(Lesser_Sand_Plover);

        //Greater Sand Plover
        BirdDescription Greater_Sand_Plover = new BirdDescription("Greater Sand Plover", "Charadrius leschenaultii", R.drawable.gr_sa_plo);
        birdList.add(Greater_Sand_Plover);


    }

    private void JacanasList_MP() {
        //Pheasant-tailed Jacana
        BirdDescription Pheasant_tailed_Jacana = new BirdDescription("Pheasant-tailed Jacana", "Hydrophasianus chirurgus", R.drawable.f_whistling_duck);
        birdList.add(Pheasant_tailed_Jacana);

        //Bronze-winged Jacana
        BirdDescription Bronze_winged_Jacana = new BirdDescription("Bronze-winged Jacana", "Metopidius indicus", R.drawable.l_whistling_duck);
        birdList.add(Bronze_winged_Jacana);

    }

    private void QuailList_MP() {
        //Common Quail
        BirdDescription Common_Quail = new BirdDescription("Common Quail", "Coturnix coturnix", R.drawable.common_quail);
        birdList.add(Common_Quail);
        //Common Quail
        BirdDescription Rain_Quail = new BirdDescription("Rain Quail", "Coturnix coromandelica", R.drawable.rain_quail);
        birdList.add(Rain_Quail);

        //Blue-breasted Quail
        BirdDescription Blue_breasted_Quail = new BirdDescription("Blue-breasted Quail", "Coturnix chinensis", R.drawable.blue_breasted_quai);
        birdList.add(Blue_breasted_Quail);

        //Jungle Bush Quail
        BirdDescription Jungle_Bush_Quail = new BirdDescription("Jungle Bush Quail", "Perdicula asiatica", R.drawable.jungle_bush_quail);
        birdList.add(Jungle_Bush_Quail);

        //Rock Bush Quail Teal
        BirdDescription Rock_Bush_Quail = new BirdDescription("Rock Bush Quail", "Perdicula argoondah", R.drawable.rock_bush_quail);
        birdList.add(Rock_Bush_Quail);
        //Rock Bush Quail Teal
        BirdDescription Painted_Bush_Quail = new BirdDescription("Painted Bush Quail", "Perdicula erythrorhyncha", R.drawable.painted_bush_quail);
        birdList.add(Painted_Bush_Quail);

    }
    private void FowlList_MP() {
        //Indian Peafowl
        BirdDescription Indian_Peafowl = new BirdDescription("Indian Peafowl", "Pavo cristatus", R.drawable.peafowl);
        birdList.add(Indian_Peafowl);
        //Red Junglefowl
        BirdDescription Red_Junglefowl = new BirdDescription("Red Junglefowl", "Gallus gallus", R.drawable.red_junglefowl);
        birdList.add(Red_Junglefowl);

        //Grey Junglefowl
        BirdDescription Grey_Junglefowl = new BirdDescription("Grey Junglefowl", "Gallus sonneratii", R.drawable.grey_jungle_f);
        birdList.add(Grey_Junglefowl);

        //Red Spurfowl
        BirdDescription Red_Spurfowl = new BirdDescription("Red Spurfowl", "Galloperdix spadicea", R.drawable.red_sp);
        birdList.add(Red_Spurfowl);

        //Painted Spurfowl
        BirdDescription Painted_Spurfowl = new BirdDescription("Painted Spurfowl", "Galloperdix lunulata", R.drawable.painted_s_f);
        birdList.add(Painted_Spurfowl);


    }

    private void PochardsList_MP() {
        //Red-crested Pochard
        BirdDescription Red_crested_Pochard = new BirdDescription("Red-crested Pochard", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Red_crested_Pochard);

        //Common Pochard
        BirdDescription Common_Pochard = new BirdDescription("Common Pochard", "8 types in Madhya Pradesh", R.drawable.l_whistling_duck);
        birdList.add(Common_Pochard);

    }

    private void FlamingoesList_MP() {
        //Greater Flamingo
        BirdDescription Greater_Flamingo = new BirdDescription("Greater Flamingo", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Greater_Flamingo);

        //Lesser Flamingo
        BirdDescription Lesser_Flamingo = new BirdDescription("Lesser Flamingo", "8 types in Madhya Pradesh", R.drawable.l_whistling_duck);
        birdList.add(Lesser_Flamingo);

    }

    private void StorksList_MP() {
        //Painted Stork
        BirdDescription Painted_Stork = new BirdDescription("Painted Stork", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Painted_Stork);

        //Black Stork
        BirdDescription Black_Stork = new BirdDescription("Black Stork", "8 types in Madhya Pradesh", R.drawable.l_whistling_duck);
        birdList.add(Black_Stork);

        //Woolly-necked Stork
        BirdDescription Woolly_necked_Stork = new BirdDescription("Woolly-necked Stork", "8 types in Madhya Pradesh", R.drawable.tufted_duck);
        birdList.add(Woolly_necked_Stork);

        //European White Stork
        BirdDescription European_White_Stork = new BirdDescription("European White Stork", "8 types in Madhya Pradesh", R.drawable.falcated_duck);
        birdList.add(European_White_Stork);

        //Black-necked Stork
        BirdDescription Black_necked_Stork = new BirdDescription("Black-necked Stork", "8 types in Madhya Pradesh", R.drawable.pink_headed_duck);
        birdList.add(Black_necked_Stork);

    }

    private void AdjutantsList_MP() {
        //Greater Adjutant
        BirdDescription Greater_Adjutant = new BirdDescription("Greater Adjutant", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Greater_Adjutant);

        //Lesser Adjutant
        BirdDescription Lesser_Adjutant = new BirdDescription("Lesser Adjutant", "8 types in Madhya Pradesh", R.drawable.l_whistling_duck);
        birdList.add(Lesser_Adjutant);

    }

    private void PelicansList_MP() {
        //Great White Pelican
        BirdDescription Great_White_Pelican = new BirdDescription("Great White Pelican", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Great_White_Pelican);

        //Spot-billed Pelican
        BirdDescription Spot_billed_Pelican = new BirdDescription("Spot-billed Pelican", "8 types in Madhya Pradesh", R.drawable.l_whistling_duck);
        birdList.add(Spot_billed_Pelican);

        //Dalmatian Pelican
        BirdDescription Dalmatian_Pelican = new BirdDescription("Dalmatian Pelican", "8 types in Madhya Pradesh", R.drawable.tufted_duck);
        birdList.add(Dalmatian_Pelican);
    }

    private void IbisList_MP() {
        //Black-headed Ibis
        BirdDescription Black_headed_Ibis = new BirdDescription("Black-headed Ibis", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Black_headed_Ibis);

        //Indian Black Ibis
        BirdDescription Indian_Black_Ibis = new BirdDescription("Indian Black Ibis", "8 types in Madhya Pradesh", R.drawable.l_whistling_duck);
        birdList.add(Indian_Black_Ibis);

        //Glossy Ibis
        BirdDescription Glossy_Ibis = new BirdDescription("Glossy Ibis", "8 types in Madhya Pradesh", R.drawable.tufted_duck);
        birdList.add(Glossy_Ibis);

    }

    private void SpoonbillList_MP() {
        //Eurasian Spoonbill
        BirdDescription Eurasian_Spoonbill = new BirdDescription("Eurasian Spoonbill", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Eurasian_Spoonbill);

    }

    private void StiltList_MP() {
        //Black-winged Stilt
        BirdDescription Black_winged_Stilt = new BirdDescription("Black-winged Stilt", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Black_winged_Stilt);

    }

    private void SnipeList_MP() {
        //Greater Painted-snipe
        BirdDescription Greater_Painted_snipe = new BirdDescription("Greater Painted-snipe", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Greater_Painted_snipe);

    }


    private void SkimmerList_MP() {
        //Indian Skimmer
        BirdDescription Indian_Skimmer = new BirdDescription("Indian Skimmer", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Indian_Skimmer);

    }

    private void GullList_MP() {
        //Brown-headed Gull
        BirdDescription Brown_headed_Gull = new BirdDescription("Brown-headed Gull", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Brown_headed_Gull);

        //Black-headed Gull
        BirdDescription Black_headed_Gull = new BirdDescription("Black-headed Gull", "8 types in Madhya Pradesh", R.drawable.l_whistling_duck);
        birdList.add(Black_headed_Gull);

        //Pallas's Gull
        BirdDescription Pallas_Gull = new BirdDescription("Pallas's Gull", "8 types in Madhya Pradesh", R.drawable.tufted_duck);
        birdList.add(Pallas_Gull);

        //Caspian Gull
        BirdDescription Caspian_Gull = new BirdDescription("Caspian Gull", "8 types in Madhya Pradesh", R.drawable.falcated_duck);
        birdList.add(Caspian_Gull);

    }

    private void TernList_MP() {
        //Little Tern
        BirdDescription Little_Tern = new BirdDescription("Little Tern", "Dendrocygna bicolor", R.drawable.f_whistling_duck);
        birdList.add(Little_Tern);

        //Gull-billed Tern
        BirdDescription Gull_billed_Tern = new BirdDescription("Gull-billed Tern", "8 types in Madhya Pradesh", R.drawable.l_whistling_duck);
        birdList.add(Gull_billed_Tern);

        //Tufted Duck
        BirdDescription Caspian_Tern = new BirdDescription("Caspian Tern", "8 types in Madhya Pradesh", R.drawable.tufted_duck);
        birdList.add(Caspian_Tern);

        //Whiskered Tern
        BirdDescription Whiskered_Tern = new BirdDescription("Whiskered Tern", "8 types in Madhya Pradesh", R.drawable.falcated_duck);
        birdList.add(Whiskered_Tern);

        //White-winged Tern
        BirdDescription White_winged_Tern = new BirdDescription("White-winged Tern", "8 types in Madhya Pradesh", R.drawable.pink_headed_duck);
        birdList.add(White_winged_Tern);

        //River Tern
        BirdDescription River_Tern = new BirdDescription("River Tern", "8 types in Madhya Pradesh", R.drawable.comb_duck);
        birdList.add(River_Tern);

        //Black-bellied Tern
        BirdDescription Black_bellied_Tern = new BirdDescription("Black-bellied Tern", "8 types in Madhya Pradesh", R.drawable.ferrugnios_duck);
        birdList.add(Black_bellied_Tern);
    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private DucksInMp.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final DucksInMp.ClickListener clickListener) {
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

