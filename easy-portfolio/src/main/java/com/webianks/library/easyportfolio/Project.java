package com.webianks.library.easyportfolio;

/**
 * Created by R Ankit on 03-05-2017.
 */

public class Project {

    private String projectName;
    private String projectDesc;
    private String projectLink;


    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public String getProjectLink() {
        return projectLink;
    }

    public String getProjectName() {
        return projectName;
    }
}
