package com.example.covidhackaton;

import android.content.Context;

import androidx.room.Room;

public enum DbAndRepositoryProvider {
    DB_AND_REPOSITORY_PROVIDER;
    private AppDatabase appDatabase;

    void initDatabase(Context context) {
        appDatabase = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "hackaton-db").build();
    }
}
