package com.webianks.library.easyportfolio;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by R Ankit on 03-05-2017.
 */

public class EasyPortfolio {

    private Context context;
    private String github_url;
    private String play_store_url;
    private String linkedin_url;
    private List<Project> projectList;

    EasyPortfolio(Builder builder) {

        context = builder.context;
        github_url = builder.github_url;
        play_store_url = builder.play_store_url;
        linkedin_url = builder.linkedin_url;
        projectList = builder.projectList;

    }

    public static class Builder {

        private Context context;
        private String github_url;
        private String play_store_url;
        private String linkedin_url;
        private List<Project> projectList;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder withGithubUrl(String github_url) {
            this.github_url = github_url;
            return this;
        }

        public Builder withPlayStoreUrl(String play_store_url) {
            this.play_store_url = play_store_url;
            return this;
        }

        public Builder withLinkedInUrl(String linkedin_url) {
            this.linkedin_url = linkedin_url;
            return this;
        }

        public Builder withProjectList(List<Project> projectList) {
            this.projectList = projectList;
            return this;
        }


        public EasyPortfolio build() {
            return new EasyPortfolio(this);
        }

    }

    public void start() {

        Intent intent = new Intent(context, PortfolioActivity.class);
        intent.putExtra("github_url", github_url);
        intent.putExtra("play_store_url", play_store_url);
        intent.putExtra("linkedin_url", linkedin_url);
        intent.putExtra("project_list", (Serializable) projectList);
        context.startActivity(intent);

    }


}
