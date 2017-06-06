package com.greenfox.exam.spring.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viktor on 2017-06-06.
 */
public class ProjectList {

  private List<Project> projectList;

  public List<Project> fillProjectList() {
    projectList = new ArrayList<>();
    projectList.add(addProjectToList("VHJpYmVzIG9mIExhZ29wdXMgQmFja2VuZCBTZXJ2aWNl"));
    projectList.add(addProjectToList("VHJpYmVzIG9mIExhZ29wdXMgQW5kcm9pZA"));
    projectList.add(addProjectToList("R2lUaW5kZXIgQmFja2VuZCBTZXJ2aWNl"));
    projectList.add(addProjectToList("R2lUaW5kZXIgQW5kcm9pZA"));
    projectList.add(addProjectToList("UG9rZXIgU2l0ZSBCYWNrZW5kIFNlcnZpY2U"));
    return projectList;
  }

  public Project addProjectToList(String projectName) {
    Project project = new Project();
    project.setNameOfProject(projectName);
    return project;
  }
}
