package com.tbuonomo.dagger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tommy on 01/07/16.
 */

@Module
public class AppModule {
    Application mApplication;

    public AppModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    Animal provideAnimal() {
        return new Dog();
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

}
