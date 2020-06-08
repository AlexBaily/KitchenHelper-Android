package com.alexbaily.kitchenhelper;
import java.util.ArrayList;


public class User {

    private int mUserID;
    private ArrayList<Recipe> mRecipes;

    public User(int mUserID) {
        this.mUserID = mUserID;
        mRecipes = new ArrayList<Recipe>();
    }

    public void AddRecipe(Recipe recipe) {
        mRecipes.add(recipe);
    }
}
