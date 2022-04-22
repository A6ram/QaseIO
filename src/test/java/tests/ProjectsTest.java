package tests;

import dto.Project;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProjectsTest extends BaseTest{

    @Test(description = "New project test")
    public void createNewProject() {
        Project project = new Project("QaseIO", "QA17", "Selenide project");
        loginPage.openPage();
        loginPage.isPageOpened();
        loginPage.login("illia.a6ram@gmail.com", "pipikonda5");
        projectsPage.isPageOpened();
        projectsPage.clickNewProjectButton();
        newProjectPage.isPageOpened();
        newProjectPage.inputProjectInfo(project);
        newProjectPage.choosePublicAccessType();
        newProjectPage.createProject();
        projectPage.isPageOpened();
        assertEquals(projectPage.getProjectName(), project.getProjectName(), "Project name doesn't match");
    }
}

