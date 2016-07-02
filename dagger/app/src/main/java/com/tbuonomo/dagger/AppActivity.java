package com.tbuonomo.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class AppActivity extends AppCompatActivity {
    @Inject
    Animal mAnimal1, mAnimal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        ((DaggerApplication) getApplication()).getAppComponent().inject(this);

        if (mAnimal1 != null && mAnimal2 != null) {
            Log.i(AppActivity.class.getSimpleName(), mAnimal1 + " and " + mAnimal2 + " successfully injected!!");
            mAnimal1.eat();
        }
    }
}
