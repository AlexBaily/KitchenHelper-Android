package com.alexbaily.kitchenhelper;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {
    private ArrayList<Recipe> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class RecipeViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public CardView cv;
        public TextView textView;
        public TextView recipeDescView;
        public ImageView recipeImageView;
        public RecipeViewHolder(CardView v) {
            super(v);

            textView = v.findViewById(R.id.recipe_name);
            recipeDescView = v.findViewById(R.id.recipe_description);
            recipeImageView = v.findViewById(R.id.recipe_image);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RecipeAdapter(ArrayList<Recipe> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RecipeAdapter.RecipeViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        CardView v = (CardView) LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.recipe_cards, parent, false);

        RecipeViewHolder vh = new RecipeViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RecipeViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Recipe recipe = mDataset.get(position);
        holder.textView.setText(recipe.getmRecipeName());
        holder.recipeDescView.setText(recipe.getmRecipeDescription());
        holder.recipeImageView.setImageResource(recipe.getmImageName());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}

