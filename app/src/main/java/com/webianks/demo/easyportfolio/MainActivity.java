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

        Project pollstap = new Project();
        pollstap.setProjectName("PollsTap");
        pollstap.setProjectDesc("Polling based social networking app." +
                " You can start new polls and reach a conclusion based on the voting.");
        pollstap.setProjectLink("https://play.google.com/store/apps/details?id=com.webianks.pollstap");

        Project popupBubble = new Project();
        popupBubble.setProjectName("PopupBubble");
        popupBubble.setProjectDesc("Easily add and customise \"New Post\" popup button with the feeds (RecyclerView) of your app.");
        popupBubble.setProjectLink("https://github.com/webianks/PopupBubble");

        projectList.add(pollstap);
        projectList.add(popupBubble);


        new EasyPortfolio.Builder(this)
                .withGithubUrl("http://www.github.com/webianks")
                .withPlayStoreUrl("http://www.github.com/webianks")
                .withLinkedInUrl("http://www.github.com/webianks")
                .withProjectList(projectList)
                .build()
                .start();
    }
}
