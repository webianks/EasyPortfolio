package com.webianks.library.easyportfolio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by R Ankit on 03-05-2017.
 */

public class PortfolioActivity extends AppCompatActivity{

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portfolio_activity);

        init();
    }

    private void init() {

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        Project project = new Project();
        project.setProjectName("Pollstap");
        project.setProjectDesc("Polling based social networking app.");

        Project project2 = new Project();
        project2.setProjectName("ScrollChoice");
        project2.setProjectDesc("Create scrollable choice view in android.");

        List<Project> projectList = new ArrayList<>();
        projectList.add(project);
        projectList.add(project2);

        ProjectsRecyclerAdapter projectsRecyclerAdapter = new ProjectsRecyclerAdapter(this,projectList);
        recyclerView.setAdapter(projectsRecyclerAdapter);

    }
}
