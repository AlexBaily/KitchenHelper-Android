package com.alexbaily.kitchenhelper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class RecipeFragment extends Fragment  {

    private User mUser = new User(0);

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
        Recipe newRecipe = new Recipe(0, "Cookies");
        newRecipe.AddIngredient(newIngredient);
        mUser.AddRecipe(newRecipe);

        mRecipeText.setText(newIngredient.getIngredientText());

        return v;
    }


}
