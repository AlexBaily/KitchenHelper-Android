package com.alexbaily.kitchenhelper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

    private TextView mRecipeTextView;
    private User mUser = new User(0);
    private FragmentTransaction transaction;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        transaction = fm.beginTransaction();
        if (fragment == null) {
            fragment = new RecipeFragment();
            transaction.add(R.id.fragment_container, fragment);
            transaction.commit();

        }


    }


}