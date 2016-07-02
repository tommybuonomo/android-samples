package com.tbuonomo.dagger;

import android.util.Log;

/**
 * Created by tommy on 01/07/16.
 */

public class Dog implements Animal {
    private static int nbDogs = 0;
    private String mName;

    public Dog() {
        mName = "Dog " + nbDogs;
        nbDogs++;
    }

    @Override
    public void eat() {
        Log.i(Dog.class.getSimpleName(), mName + " eats" );
    }

    @Override
    public String toString() {
        return "Dog{" +
                "mName='" + mName + '\'' +
                '}';
    }
}
