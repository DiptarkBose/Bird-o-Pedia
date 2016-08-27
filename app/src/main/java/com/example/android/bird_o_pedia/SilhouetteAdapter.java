package com.example.android.bird_o_pedia;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SilhouetteAdapter extends RecyclerView.Adapter<SilhouetteAdapter.MyViewHolder> {

    private List<SilhouetteDescription> list_item;
    public Context mcontext;


    public SilhouetteAdapter(List<SilhouetteDescription> list, Context context) {

        list_item = list;
        mcontext = context;
    }

    // Called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item.
    @Override
    public SilhouetteAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        // create a layout
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.silhoutte_list_item, null);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    // Called by RecyclerView to display the data at the specified position.
    @Override
    public void onBindViewHolder(final MyViewHolder viewHolder, final int position) {

        final SilhouetteDescription obj = list_item.get(position);
        viewHolder.name.setText(obj.getNameOfTheBirdEnglish());
        viewHolder.image.setImageResource(obj.getImageResourceID());
        viewHolder.info.setText(obj.getPopulation());

    }

    // initializes textview in this class
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public ImageView image;
        public TextView info;

        public MyViewHolder(View itemLayoutView) {
            super(itemLayoutView);

            name = (TextView) itemLayoutView.findViewById(R.id.individual_bird_name);
            image = (ImageView) itemLayoutView.findViewById(R.id.silhouette_bird_image);
            info = (TextView) itemLayoutView.findViewById((R.id.population));

        }
    }

    //Returns the total number of items in the data set hold by the adapter.
    @Override
    public int getItemCount() {
        return list_item.size();
    }

}