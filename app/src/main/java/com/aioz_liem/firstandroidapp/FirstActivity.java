package com.aioz_liem.firstandroidapp;
import android.app.Activity;
import android.os.Bundle;

public class FirstActivity extends Activity{
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.main_layout);
    }
}
