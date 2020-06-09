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



public class RecipeFragment extends Fragment  {

    private User mUser = new User(0);
    TextView recipeName;
    TextView recipeDescription;
    ImageView recipePhoto;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recipe, container, false);

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


        return v;
    }


}
