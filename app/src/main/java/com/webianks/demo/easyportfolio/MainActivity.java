package com.webianks.demo.easyportfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.webianks.library.easyportfolio.PortfolioActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickPortfolio(View view) {

        startActivity(new Intent(this, PortfolioActivity.class));
    }
}
