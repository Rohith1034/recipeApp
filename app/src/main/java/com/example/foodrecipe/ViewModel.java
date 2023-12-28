package com.example.foodrecipe;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.Date;
import java.util.List;

public class ViewModel extends AndroidViewModel {
    private Repository repository;

    public ViewModel(@NonNull Application application) {
        super(application);
        this.repository = new Repository(application);
    }

    public LiveData<List<Meal>> getAllMeals() {
        return repository.getMutableLiveData();
    }

}
