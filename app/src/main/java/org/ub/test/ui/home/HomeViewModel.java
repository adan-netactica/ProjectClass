package org.ub.test.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        int suma = sumar(10,1);
        mText.setValue("Hola Mundo = " + String.valueOf(suma));
    }

    public LiveData<String> getText() {
        return mText;
    }

    public int sumar(int a , int b){
        return  a + b;
    }
}