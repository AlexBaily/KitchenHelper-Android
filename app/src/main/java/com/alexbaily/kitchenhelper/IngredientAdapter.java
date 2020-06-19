package com.alexbaily.kitchenhelper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class IngredientAdapter extends RecyclerView.Adapter<IngredientAdapter.IngredientViewHolder> {

    private ArrayList<Ingredient> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class IngredientViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView ingredientNameView;
        public TextView ingredientAmountView;

        public Ingredient ingredient;
        public IngredientViewHolder(LinearLayout v) {
            super(v);

            ingredientNameView = v.findViewById(R.id.ingredient_name);
            ingredientAmountView = v.findViewById(R.id.ingredient_amount);
        }

    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public IngredientAdapter(ArrayList<Ingredient> myDataset) {

        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public IngredientAdapter.IngredientViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        // create a new view
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ingredient_view, parent, false);

        IngredientAdapter.IngredientViewHolder vh = new IngredientAdapter.IngredientViewHolder(v);
        return vh;
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(IngredientAdapter.IngredientViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Ingredient ingredient = mDataset.get(position);
        holder.ingredientNameView.setText(ingredient.getmIngredientName());
        holder.ingredientAmountView.setText(ingredient.getIngredientAmount());



    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
