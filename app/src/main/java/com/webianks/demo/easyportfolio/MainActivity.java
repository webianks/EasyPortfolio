package com.webianks.demo.easyportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.webianks.library.easyportfolio.EasyPortfolio;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickPortfolio(View view) {

        new EasyPortfolio.Builder(this)
                .withGithubUrl("http://www.github.com/webianks")
                .withPlayStoreUrl("http://www.github.com/webianks")
                .withLinkedInUrl("http://www.github.com/webianks")
                .build()
                .start();
    }
}
