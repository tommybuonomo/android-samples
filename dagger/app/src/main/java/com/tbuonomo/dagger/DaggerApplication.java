package com.tbuonomo.dagger;

import android.app.Application;

/**
 * Created by tommy on 01/07/16.
 */
public class DaggerApplication extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
