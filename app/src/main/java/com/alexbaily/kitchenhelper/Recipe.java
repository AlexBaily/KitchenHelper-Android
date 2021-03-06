package com.alexbaily.kitchenhelper;
import android.graphics.drawable.Drawable;

import java.io.Serializable;
import java.util.ArrayList;



public class Recipe implements Serializable {

    private int mRecipeId;
    private String mRecipeName;
    private String mRecipeDescription;
    private int mImageName;
    private ArrayList<Ingredient> mIngredientList;
    private ArrayList<RecipeStep> mRecipeSteps;



    public Recipe(int mRecipeId, String mRecipeName, String mRecipeDescription, int mImageName) {
        this.mRecipeId = mRecipeId;
        this.mRecipeName = mRecipeName;
        this.mImageName = mImageName;
        this.mRecipeDescription = mRecipeDescription;
        this.mIngredientList = new ArrayList<Ingredient>();
        this.mRecipeSteps = new ArrayList<RecipeStep>();
    }

    public void AddIngredient(Ingredient ingredient) {
        mIngredientList.add(ingredient);
    }

    public void AddRecipeStep(RecipeStep recipeStep) {
        mRecipeSteps.add(recipeStep);
    }

    public void RemoveIngredient(Ingredient ingredient) {
        mIngredientList.remove(ingredient);
    }

    public void RemoveRecipeStep(RecipeStep recipeStep) {
        mRecipeSteps.remove(recipeStep);
    }

    public String getmRecipeName() {
        return mRecipeName;
    }

    public void setmRecipeName(String mRecipeName) {
        this.mRecipeName = mRecipeName;
    }

    public String getmRecipeDescription() {
        return mRecipeDescription;
    }

    public void setmRecipeDescription(String mRecipeDescription) {
        this.mRecipeDescription = mRecipeDescription;
    }

    public ArrayList<Ingredient> getmIngredientList() {
        return mIngredientList;
    }

    public int getmImageName() {
        return mImageName;
    }

}
