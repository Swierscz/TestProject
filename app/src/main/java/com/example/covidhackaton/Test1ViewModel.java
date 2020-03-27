package com.example.covidhackaton;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Test1ViewModel extends ViewModel {

    public MutableLiveData<Integer> someData = new MutableLiveData<>();


    public Test1ViewModel() {
        someData.postValue(20);
    }
}
