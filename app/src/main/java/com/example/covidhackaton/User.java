package com.example.covidhackaton;


import androidx.room.PrimaryKey;

public class User {

    @PrimaryKey(autoGenerate = true)
    private long userId;

    private String firstName;

}
