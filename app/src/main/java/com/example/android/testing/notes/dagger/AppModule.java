package com.example.android.testing.notes.dagger;

import android.content.Context;

import com.example.android.testing.notes.NoteApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by godwin on 12/7/17.
 */

@Singleton
@Module
public class AppModule {

    NoteApplication app;

    public AppModule(NoteApplication app) {
        this.app = app;
    }

    @Provides
    public Context provideContext(){
        return app;
    }

    @Provides
    @Singleton
    public NoteApplication provideApplication(){
        return app;
    }
}
