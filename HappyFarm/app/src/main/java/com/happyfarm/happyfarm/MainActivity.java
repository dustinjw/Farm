package com.happyfarm.happyfarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mainLoginBtn, mainAccountBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLoginBtn = (Button) findViewById(R.id.mainLoginBtn);
        mainLoginBtn.setOnClickListener(this);
        mainAccountBtn = (Button) findViewById(R.id.mainAccountBtn);
        mainAccountBtn.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == mainLoginBtn) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        } else if (v == mainAccountBtn) {
            Intent intent = new Intent(this, AccountActivity.class);
            startActivity(intent);
        }
    }
}




























































