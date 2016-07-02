package com.tbuonomo.realm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class RealmActivity extends AppCompatActivity {
    private DogDao mDogDao = new DogDao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create Dogs
        Dog dog1 = new Dog("First", 5);
        mDogDao.save(dog1);
        Dog dogSaved1 = mDogDao.findByName("First");

        Dog dog2 = new Dog("Second", 8);
        mDogDao.save(dog2);
        Dog dogSaved2 = mDogDao.findByName("Second");

        Log.i(RealmActivity.class.getSimpleName(), "Dogs Saved : " + dogSaved1 + " and " + dogSaved2);

        //Delete dog
        mDogDao.delete(dogSaved1);
        Dog dogDeleted = mDogDao.findByName("First");
        Log.i(RealmActivity.class.getSimpleName(), "Dog Deleted : " + dogDeleted);

        dogSaved2.eat();
    }
}
