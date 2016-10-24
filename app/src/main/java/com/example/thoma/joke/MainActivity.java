package com.example.thoma.joke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view){
        Intent intent = new Intent(this,DelayMessageService.class);
        intent.putExtra(DelayMessageService.EXTRA_MESSAGE,
                getResources().getString(R.string.button_response));
        startService(intent);
    }

    public void OnClickWomble(View view){
        Intent intent = new Intent(this, WombleService.class);
        startService(intent);
    }
}

