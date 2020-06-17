package com.alexbaily.kitchenhelper;
import java.io.Serializable;
import java.util.ArrayList;


public class User implements Serializable {

    private int mUserID;
    private ArrayList<Recipe> mRecipes;

    public User(int mUserID) {
        this.mUserID = mUserID;
        mRecipes = new ArrayList<Recipe>();
    }

    public void AddRecipe(Recipe recipe) {
        mRecipes.add(recipe);
    }

    public ArrayList<Recipe> GetRecipes() {
        return mRecipes;
    }
}
