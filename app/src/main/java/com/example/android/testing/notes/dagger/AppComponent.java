package com.example.android.testing.notes.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by godwin on 12/7/17.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

}
