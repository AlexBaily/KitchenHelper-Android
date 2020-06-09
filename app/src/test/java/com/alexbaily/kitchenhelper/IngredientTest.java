package com.alexbaily.kitchenhelper;

import org.junit.Test;
import static org.junit.Assert.*;

public class IngredientTest {

    @Test
    public void testGetIngredientText() {
        Ingredient ingredient = new Ingredient(0, "Test",
                "500", "ml");

        String result = ingredient.getIngredientText();

        assertEquals("Test 500ml", result);
    }
}
