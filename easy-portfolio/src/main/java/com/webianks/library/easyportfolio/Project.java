package com.webianks.library.easyportfolio;


import java.io.Serializable;

/**
 * Created by R Ankit on 03-05-2017.
 */

public class Project implements Serializable {

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

    String getProjectDesc() {
        return projectDesc;
    }

    public String getProjectLink() {
        return projectLink;
    }

    String getProjectName() {
        return projectName;
    }

}
