package com.webianks.library.easyportfolio;

import android.content.Context;
import android.content.Intent;

/**
 * Created by R Ankit on 03-05-2017.
 */

public class EasyPortfolio {

    private Context context;
    private String github_url;
    private String play_store_url;
    private String linkedin_url;

    public EasyPortfolio(Builder builder) {

    }

    public static class Builder {

        private Context context;
        private String github_url;
        private String play_store_url;
        private String linkedin_url;


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


        public EasyPortfolio build() {
            return new EasyPortfolio(this);
        }

    }

    public void start() {

        Intent intent = new Intent(context, PortfolioActivity.class);
        intent.putExtra("github_url", github_url);
        intent.putExtra("play_store_url", play_store_url);
        intent.putExtra("linkedin_url", linkedin_url);
        context.startActivity(intent);

    }



}
