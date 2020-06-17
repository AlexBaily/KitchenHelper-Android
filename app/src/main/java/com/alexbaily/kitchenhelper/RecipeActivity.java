package com.alexbaily.kitchenhelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RecipeActivity extends Activity {

    public TextView mRecipeNameTextView;
    public TextView mRecipeDescTextView;
    public ImageView mRecipeImageView;
    public Recipe mRecipe;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_fragment);

        mRecipe = (Recipe) getIntent().getSerializableExtra("EXTRA_RECIPE");

        mRecipeNameTextView = findViewById(R.id.act_recipe_name);
        mRecipeNameTextView.setText(mRecipe.getmRecipeName());

        mRecipeImageView = findViewById(R.id.act_recipe_image);
        mRecipeImageView.setImageResource(mRecipe.getmImageName());

        mRecipeDescTextView = findViewById(R.id.act_recipe_desc);
        mRecipeDescTextView.setText(mRecipe.getmRecipeDescription());
    }

}
