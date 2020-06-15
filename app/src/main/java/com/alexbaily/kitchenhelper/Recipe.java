package com.alexbaily.kitchenhelper;
import java.util.ArrayList;



public class Recipe {

    private int mRecipeId;
    private String mRecipeName;
    private String mRecipeDescription;
    private String mImageName;
    private ArrayList<Ingredient> mRecipeList;
    private ArrayList<RecipeStep> mRecipeSteps;


    public Recipe(int mRecipeId, String mRecipeName, String mRecipeDescription, String mImageName) {
        this.mRecipeId = mRecipeId;
        this.mRecipeName = mRecipeName;
        this.mImageName = mImageName;
        this.mRecipeDescription = mRecipeDescription;
        this.mRecipeList = new ArrayList<Ingredient>();
        this.mRecipeSteps = new ArrayList<RecipeStep>();
    }

    public void AddIngredient(Ingredient ingredient) {
        mRecipeList.add(ingredient);
    }

    public void AddRecipeStep(RecipeStep recipeStep) {
        mRecipeSteps.add(recipeStep);
    }

    public void RemoveIngredient(Ingredient ingredient) {
        mRecipeList.remove(ingredient);
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

    public String getmImageName() {
        return mImageName;
    }

}
