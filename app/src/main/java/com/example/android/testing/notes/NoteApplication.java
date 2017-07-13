package com.example.android.testing.notes;

import android.app.Application;

import com.example.android.testing.notes.dagger.AppComponent;
import com.example.android.testing.notes.dagger.AppModule;
import com.example.android.testing.notes.dagger.DaggerAppComponent;

/**
 * Created by godwin on 12/7/17.
 */

public class NoteApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }

    public void setAppComponent(AppComponent appComponent) {
        this.appComponent = appComponent;
    }
}
