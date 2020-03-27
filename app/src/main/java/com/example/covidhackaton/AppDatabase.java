package com.example.covidhackaton;

import androidx.room.RoomDatabase;

public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();


}
