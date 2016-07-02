package com.tbuonomo.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tommy on 02/07/16.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Animal getAnimal();
    void inject(AppActivity activity);
}
