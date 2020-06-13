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
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class RecipeFragment extends Fragment  {

    private User mUser = new User(0);
    TextView recipeName;
    TextView recipeDescription;
    ImageView recipePhoto;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recipe, container, false);
                /*
        TextView mRecipeText = (TextView)v.findViewById(R.id.recipe_name);

        Ingredient newIngredient = new Ingredient(0, "Flour", "500", "g");
        Recipe newRecipe = new Recipe(0, "Cookies", "Declicious Cookies");
        newRecipe.AddIngredient(newIngredient);
        mUser.AddRecipe(newRecipe);

        mRecipeText.setText(newIngredient.getIngredientText());



        CardView cardView = (CardView) v.findViewById(R.id.card_view);

        recipeName = (TextView)cardView.findViewById(R.id.recipe_name);
        recipeDescription = (TextView)cardView.findViewById(R.id.recipe_description);


        recipeName.setText(newRecipe.getmRecipeName());
        recipeDescription.setText(newRecipe.getmRecipeDescription());
        */
        //RecyclerView//

        String[] testString = {"est1", "test2", "test43"};
        recyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        mAdapter = new RecipeAdapter(testString);
        recyclerView.setAdapter(mAdapter);

        return v;
    }


}
