public class GameSettings {

    private int levels;
    private int hardTopicsPerLevel;
    private int projectsPerLevel;

    public GameSettings(int levels, int hardTopicsPerLevel, int projectsPerLevel) {
        this.levels = levels;
        this.hardTopicsPerLevel = hardTopicsPerLevel;
        this.projectsPerLevel = projectsPerLevel;
    }

    public GameSettings() {
        this.levels = 12;
        this.hardTopicsPerLevel = 4;
        this.projectsPerLevel = 5;
    }


    public String toString() {
        return "Course Obstacles: " + "\nLevels: " + levels + "\nHard Topics Per Level: " + hardTopicsPerLevel + "\nProjects Per Level: " + projectsPerLevel;
    }

    public int getLevels() {
        return this.levels;
    }

    public int getHardTopicsPerLevel() {
        return this.hardTopicsPerLevel;
    }

    public int getProjectsPerLevel() {
        return this.projectsPerLevel;
    }

    public void customize(int levelChange, int topicsChange, int projectsChange) {
        levelChange = this.levels;
        topicsChange = this.hardTopicsPerLevel;
        projectsChange = this.projectsPerLevel;

    }


}
