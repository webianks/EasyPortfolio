package com.webianks.demo.easyportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.webianks.library.easyportfolio.EasyPortfolio;
import com.webianks.library.easyportfolio.Project;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickPortfolio(View view) {

        List<Project> projectList = new ArrayList<>();

        Project pollstapProject = new Project();
        pollstapProject.setProjectName("PollsTap");
        pollstapProject.setProjectDesc("Polling based social networking app.");
        pollstapProject.setProjectLink("http://webianks.com");

        projectList.add(pollstapProject);


        new EasyPortfolio.Builder(this)
                .withGithubUrl("http://www.github.com/webianks")
                .withPlayStoreUrl("http://www.github.com/webianks")
                .withLinkedInUrl("http://www.github.com/webianks")
                .withProjectList(projectList)
                .build()
                .start();
    }
}
