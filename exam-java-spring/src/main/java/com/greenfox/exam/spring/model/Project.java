package com.greenfox.exam.spring.model;

/**
 * Created by Viktor on 2017-06-06.
 */
public class Project {

  private String nameOfProject;

  public Project() {
  }

  public Project(String nameOfProject) {
    this.nameOfProject = nameOfProject;
  }

  public String getNameOfProject() {
    return nameOfProject;
  }

  public void setNameOfProject(String nameOfProject) {
    this.nameOfProject = nameOfProject;
  }
}
