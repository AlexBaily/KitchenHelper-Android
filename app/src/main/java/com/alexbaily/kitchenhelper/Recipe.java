package com.alexbaily.kitchenhelper;
import java.util.ArrayList;



public class Recipe {

    private int mRecipeId;
    private String mRecipeName;
    private ArrayList<Ingredient> mRecipeList;
    private ArrayList<RecipeStep> mRecipeSteps;


    public Recipe(int mRecipeId, String mRecipeName) {
        this.mRecipeId = mRecipeId;
        this.mRecipeName = mRecipeName;
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

}
