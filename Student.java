public class Student {

    private String name;
    private String university;
    private int hardTopicsMastered;
    private int projectsCompleted;
    private boolean graduated;
    private double careerTime;

    public Student(String name, String university, int hardTopicsMastered, int projectsCompleted, boolean graduated, double careerTime) {
        this.name = name;
        this.university = university;
        this.hardTopicsMastered = hardTopicsMastered;
        this.projectsCompleted = projectsCompleted;
        this.graduated = graduated;
        this.careerTime = careerTime;
    }

    public Student() {
        this.name = null;
        this.university = null;
        this.hardTopicsMastered = 0;
        this.projectsCompleted = 0;
        this.graduated = true;
        this.careerTime = 0;
    }



    public String toString() {
        return "--- Now displaying information about the student ---" + "\nName: " + name + "\nUniversity: " + university + "\nHardTopicsMastered: " + hardTopicsMastered + "\nProjects Completed: "
                + projectsCompleted + "\nGraduated: " + graduated + "\nCareer Time: " + careerTime + " years";
    }

    public String getName() {
        return this.name;
    }

    public String getUniversity() {
        return this.university;
    }

    public int getHardTopicsMastered() {
        return this.hardTopicsMastered;
    }

    public int getProjectsCompleted() {
        return this.projectsCompleted;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public double getCareerTime() {
        return careerTime;
    }

    public void setHardTopicsMastered(int hardTopicsMastered) {
        this.hardTopicsMastered = hardTopicsMastered;
    }

    public void setProjectsCompleted(int projectsCompleted) {
        this.projectsCompleted = projectsCompleted;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public void roundCareerTime(double careerTimeNotRounded) {

        if (careerTime > 0 && careerTime < .51) {
            careerTime = 0.5;
        } else if (careerTime > .5 && careerTime < 1.01 ) {
            careerTime = 1.0;
        } else if (careerTime > 1.0 && careerTime < 1.51 ) {
            careerTime = 1.5;
        } else if (careerTime > 1.5 && careerTime < 2.01 ) {
            careerTime = 2.0;
        } else if (careerTime > 2.0 && careerTime < 2.51 ) {
            careerTime = 2.5;
        } else if (careerTime > 2.5 && careerTime < 3.01 ) {
            careerTime = 3.0;
        } else if (careerTime > 3.0 && careerTime < 3.51 ) {
            careerTime = 3.5;
        } else if (careerTime > 3.5 && careerTime < 4.01 ) {
            careerTime = 4.0;
        } else if (careerTime > 4.0 && careerTime < 4.51 ) {
            careerTime = 4.5;
        } else if (careerTime > 4.5 && careerTime < 5.01 ) {
            careerTime = 5.0;
        } else if (careerTime > 5.0 && careerTime < 5.51 ) {
            careerTime = 5.5;
        } else if (careerTime > 5.5 && careerTime < 6.01 ) {
            careerTime = 6.0;
        } else if (careerTime > 6.0 && careerTime < 6.51 ) {
            careerTime = 6.5;
        } else if (careerTime > 6.5 && careerTime < 7.01 ) {
            careerTime = 7.0;
        } else if (careerTime > 7.0 && careerTime < 7.51 ) {
            careerTime = 7.5;
        } else if (careerTime > 7.5 && careerTime < 8.01 ) {
            careerTime = 8.0;
        }
        careerTimeNotRounded = careerTime;
    }


}
