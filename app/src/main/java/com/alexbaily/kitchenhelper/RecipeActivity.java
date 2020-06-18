package com.alexbaily.kitchenhelper;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecipeActivity extends Activity {

    public TextView mRecipeNameTextView;
    public TextView mRecipeDescTextView;
    public ImageView mRecipeImageView;
    public Recipe mRecipe;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        mRecipe = (Recipe) getIntent().getSerializableExtra("EXTRA_RECIPE");

        mRecipeNameTextView = findViewById(R.id.act_recipe_name);
        mRecipeNameTextView.setText(mRecipe.getmRecipeName());

        mRecipeImageView = findViewById(R.id.act_recipe_image);
        mRecipeImageView.setImageResource(mRecipe.getmImageName());

        mRecipeDescTextView = findViewById(R.id.act_recipe_desc);
        mRecipeDescTextView.setText(mRecipe.getmRecipeDescription());




        recyclerView = (RecyclerView) findViewById(R.id.ingredient_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new IngredientAdapter(mRecipe.getmIngredientList());
        recyclerView.setAdapter(mAdapter);
    }

}
