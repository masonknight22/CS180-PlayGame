public class Level {

    private int levelNumber;
    private String description;
    private String difficulty;
    private int acedTests;
    private int hardTopicsIncomplete;
    private int regularProjectsIncomplete;
    private int capstoneProjectsIncomplete;
    private double time;
    private boolean passed;

    public Level(int levelNumber, int acedTests, int hardTopicsIncomplete,
                 int regularProjectsIncomplete, int capstoneProjectsIncomplete, double time) {

        this.levelNumber = levelNumber;
        this.acedTests = acedTests;
        this.hardTopicsIncomplete = hardTopicsIncomplete;
        this.regularProjectsIncomplete = regularProjectsIncomplete;
        this.capstoneProjectsIncomplete = capstoneProjectsIncomplete;
        this.time = time;


    }

    public Level() {
        this.levelNumber = 12;
        this.acedTests = 0;
        this.hardTopicsIncomplete = 0;
        this.regularProjectsIncomplete = 0;
        this.capstoneProjectsIncomplete = 0;
        this.time = 0;

    }


    public String toString() {
        return "Level Number: " +  levelNumber + "\nDescription" + description + "\nDifficulty: " + difficulty;
    }

    public boolean getPassed() {
        return passed;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public String getDescription() {
        if (levelNumber == 1) {
            description = "Object-Oriented Programming and Problem Solving";
        } else if (levelNumber == 2) {
            description = "Programming in C";
        } else if (levelNumber == 3) {
            description = "Computer Architecture";
        } else if (levelNumber == 4) {
            description = "Data Structures & Algorithms";
        } else if (levelNumber == 5) {
            description = "Systems Programming";
        } else if (levelNumber == 6) {
            description = "Software Engineering I";
        } else if (levelNumber == 7) {
            description = "Compilers";
        } else if (levelNumber == 8) {
            description = "Operating Systems";
        } else if (levelNumber == 9) {
            description = "Introduction to Analysis and Algorithms";
        } else if (levelNumber == 10) {
            description = "Data Mining and Machine Learning";
        } else if (levelNumber == 11) {
            description = "Software Testing";
        } else if (levelNumber == 12) {
            description = "Software Engineering II";
        } else {
            description = "Diabolical Software Engineering Course";
        }
        return description;
    }

    public String getDifficulty() {
        if (levelNumber < 5) {
            difficulty = "Easy";
        } else if (levelNumber < 9 && levelNumber > 4) {
            difficulty = "Intermediate";
        } else if (levelNumber < 13 && levelNumber > 8) {
            difficulty = "Hard";
        } else {
            difficulty = "Diabolical";
        }
        return difficulty;
    }

    public int getAcedTests() {
        return acedTests;
    }

    public int getHardTopicsIncomplete() {
        return hardTopicsIncomplete;
    }

    public int getRegularProjectsIncomplete() {
        return regularProjectsIncomplete;
    }

    public int getCapstoneProjectsIncomplete() {
        return capstoneProjectsIncomplete;
    }

    public double getTime() {
        return time;
    }


}
