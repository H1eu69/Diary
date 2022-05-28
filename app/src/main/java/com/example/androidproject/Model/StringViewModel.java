package com.example.androidproject.Model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StringViewModel extends ViewModel {
    private MutableLiveData<String> liveData1 = new MutableLiveData<>();
    private String string;
    private MutableLiveData<String> liveData2 = new MutableLiveData<>();
    private String emotion;
    private MutableLiveData<String> liveData3 = new MutableLiveData<>();
    private String photo_url;

    public MutableLiveData<String> getLiveData3() {
        return liveData3;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
        liveData3.setValue(this.photo_url);
    }

    public MutableLiveData<String> getLiveData2() {
        return liveData2;
    }

    public void setLiveData2(MutableLiveData<String> liveData2) {
        this.liveData2 = liveData2;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
        liveData2.setValue(this.emotion);
    }

    public MutableLiveData<String> getLiveData() {
        return liveData1;
    }

    public void setLiveData(MutableLiveData<String> liveData) {
        this.liveData1 = liveData;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
        liveData1.setValue(this.string);
    }
}
