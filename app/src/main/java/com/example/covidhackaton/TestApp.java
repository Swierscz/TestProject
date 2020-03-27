package com.example.covidhackaton;

import android.app.Application;

public class TestApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DbAndRepositoryProvider.DB_AND_REPOSITORY_PROVIDER.initDatabase(this);
    }
}
