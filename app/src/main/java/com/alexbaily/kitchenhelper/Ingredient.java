package com.alexbaily.kitchenhelper;


import java.io.Serializable;

public class Ingredient implements Serializable {
    private int mIngredientId;
    private String mIngredientName;
    private String mIngredientQuantity;
    private String mIngredientMeasurement;

    public String getmIngredientName() {
        return mIngredientName;
    }

    public void setmIngredientName(String mIngredientName) {
        this.mIngredientName = mIngredientName;
    }

    public String getmIngredientQuantity() {
        return mIngredientQuantity;
    }

    public void setmIngredientQuantity(String mIngredientQuantity) {
        this.mIngredientQuantity = mIngredientQuantity;
    }

    public String getmIngredientMeasurement() {
        return mIngredientMeasurement;
    }

    public void setmIngredientMeasurement(String mIngredientMeasurement) {
        this.mIngredientMeasurement = mIngredientMeasurement;
    }

    public Ingredient(int mIngredientId, String mIngredientName, String mIngredientQuantity, String mIngredientMeasurement) {
        this.mIngredientId = mIngredientId;
        this.mIngredientName = mIngredientName;
        this.mIngredientQuantity = mIngredientQuantity;
        this.mIngredientMeasurement = mIngredientMeasurement;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "mIngredientName='" + mIngredientName + '\'' +
                ", mIngredientQuantity='" + mIngredientQuantity + '\'' +
                ", mIngredientMeasurement='" + mIngredientMeasurement + '\'' +
                '}';
    }

    public String getIngredientText(){
        return mIngredientName + " " + mIngredientQuantity + mIngredientMeasurement;
    }
}
