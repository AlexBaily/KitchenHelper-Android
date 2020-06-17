package com.alexbaily.kitchenhelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class RecipeListFragment extends Fragment  {

    private User mUser = new User(0);
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

        //Create some ingredients and recipes to test card creation
        Ingredient newIngredient = new Ingredient(0, "Flour", "500", "g");
        Recipe newRecipe = new Recipe(0, "Cookies", "Declicious Cookies", R.drawable.cookies);
        newRecipe.AddIngredient(newIngredient);
        mUser.AddRecipe(newRecipe);

        //2
        Ingredient newIngredient2 = new Ingredient(0, "Flour", "500", "g");
        Recipe newRecipe2 = new Recipe(0, "Brownies", "Declicious Brownies", R.drawable.brownie);
        newRecipe2.AddIngredient(newIngredient2);
        mUser.AddRecipe(newRecipe2);

        //RecyclerView//

        recyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);



        OnItemClickListener listener = (view, position) -> {
            Intent intent = new Intent(getActivity(), RecipeActivity.class);
            startActivity(intent);
        };
        // specify an adapter (see also next example)
        mAdapter = new RecipeAdapter(mUser.GetRecipes(), listener);
        recyclerView.setAdapter(mAdapter);

        return v;
    }



}
