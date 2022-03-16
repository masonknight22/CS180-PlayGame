import java.util.Scanner;


public class PlayGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String welcome = "Welcome to Students of CS! Good luck with your college career!";
        final String name = "Enter your name:";
        final String university = "Enter your university:";
        final String customLevel = "Would you like to customize the number of levels?";
        final String changeLevel = "Enter the number of levels to add or remove(use negative value to remove):";
        final String customTopics = "Would you like to customize the number of hard topics per level?";
        final String changeTopics = "Enter the number of hard topics per level to " +
                "add or remove(use negative value to remove):";
        final String customProjects = "Would you like to customize the number of projects per level?";
        final String changeProjects = "Enter the number of projects per level to " +
                "add or remove(use negative value to remove):";
        final String numAcedTests = "Enter the number of aced tests in level ";
        final String topicsNotUnderstood = "Enter the number of topics not understood in level ";
        final String regularProjects = "Enter the number of regular projects incomplete in level ";
        final String capstoneProjects = "Enter the number of capstone projects incomplete in level ";
        final String timeTaken = "Enter the time taken in level ";
        final String failedLevel = "General information about the failed level is as follows:";
        final String playAgainBeginning = "Would you like to play level ";
        final String playAgainEnd = " again?";
        final String descriptionOne = "Object-Oriented Programming and Problem Solving";
        final String descriptionTwo = "Programming in C";
        final String descriptionThree = "Computer Architecture";
        final String descriptionFour = "Data Structures & Algorithms";
        final String descriptionFive = "Systems Programming";
        final String descriptionSix = "Software Engineering I";
        final String descriptionSeven = "Compilers";
        final String descriptionEight = "Operating Systems";
        final String descriptionNine = "Introduction to Analysis and Algorithms";
        final String descriptionTen = "Data Mining and Machine Learning";
        final String descriptionEleven = "Software Testing";
        final String descriptionTwelve = "Software Engineering II";
        final String diabolical = "Diabolical Software Engineering Course";
        final String congratulationsBeginning = "Congratulations, ";
        final String congratualationsEnd = " you have graduated!";
        final String thankYou = "Thank you for playing Students of CS!";

        Student newstudent = new Student();
        GameSettings newgame = new GameSettings();
        Level newlevel = new Level();


        System.out.println(welcome);
        System.out.println(name);
        String studentname = newstudent.getName();
        studentname = scan.nextLine();

        System.out.println(university);
        String studentuniversity = newstudent.getUniversity();
        studentuniversity = scan.nextLine();

        System.out.println(customLevel);
        String customelevel = scan.nextLine();

        int level = newgame.getLevels();
        boolean graduated = newlevel.getPassed();

        if (customelevel.equalsIgnoreCase("yes")) {
            System.out.println(changeLevel);
            int changelevel = scan.nextInt();
            scan.nextLine();
            level = level + changelevel;
            int levelChange = level;
        }

        System.out.println(customTopics);
        String custometopics = scan.nextLine();

        int topic = newgame.getHardTopicsPerLevel();

        if (custometopics.equalsIgnoreCase("yes")) {
            System.out.println(changeTopics);
            int changetopics = scan.nextInt();
            scan.nextLine();
            topic = topic + changetopics;
        }

        System.out.println(customProjects);
        String customeprojects = scan.nextLine();

        int project = newgame.getProjectsPerLevel();

        if (customeprojects.equalsIgnoreCase("yes")) {
            System.out.println(changeProjects);
            int changeprojects = scan.nextInt();
            scan.nextLine();
            project = project + changeprojects;
        }

        boolean passed = newlevel.getPassed();
        passed = true;


        int strikesone = 0;
        int one = newlevel.getLevelNumber();
        one = 1;
        String descriptionone = newlevel.getDescription();
        descriptionone = descriptionOne;
        String difficultyone = newlevel.getDescription();
        difficultyone = "Easy";
        int aceone = newlevel.getAcedTests();
        int topicone = newlevel.getHardTopicsIncomplete();
        int projectsone = newlevel.getRegularProjectsIncomplete();
        int capstoneone = newlevel.getCapstoneProjectsIncomplete();
        double timeone = newlevel.getTime();
        timeone = 0;



            while (level > 0) {
                System.out.println(numAcedTests + one + ":");
                aceone = scan.nextInt();
                scan.nextLine();
                strikesone = strikesone - aceone;
                System.out.println(topicsNotUnderstood + one + ":");
                topicone = scan.nextInt();
                scan.nextLine();
                strikesone = strikesone + topicone;
                System.out.println(regularProjects + one + ":");
                projectsone = scan.nextInt();
                scan.nextLine();
                strikesone = strikesone + projectsone;
                System.out.println(capstoneProjects + one + ":");
                capstoneone = scan.nextInt();
                scan.nextLine();
                System.out.println(timeTaken + one + ":");
                timeone = scan.nextDouble();
                scan.nextLine();
                if (strikesone > 2 || capstoneone > 0) {
                    passed = false;
                    System.out.println(failedLevel);
                    System.out.println("Level Number: " + one);
                    System.out.println("Description: " + descriptionone);
                    System.out.println("Difficulty: " + difficultyone);
                    System.out.println(playAgainBeginning + one + playAgainEnd);
                    String againone = scan.nextLine();
                    if (againone.equalsIgnoreCase("yes")) {
                        strikesone = 0;
                        capstoneone = 0;

                    } else {
                        level = 0;
                        break;
                    }

                } else {
                    break;
                }

            }


        int strikestwo = 0;
        int two = newlevel.getLevelNumber();
        two = 2;
        String descriptiontwo = newlevel.getDescription();
        descriptiontwo = descriptionTwo;
        String difficultytwo = newlevel.getDescription();
        difficultytwo = "Easy";
        int acetwo = newlevel.getAcedTests();
        int topictwo = newlevel.getHardTopicsIncomplete();
        int projectstwo = newlevel.getRegularProjectsIncomplete();
        int capstonetwo = newlevel.getCapstoneProjectsIncomplete();
        double timetwo = newlevel.getTime();
        timetwo = 0;




            while (level > 1) {
                System.out.println(numAcedTests + two + ":");
                acetwo = scan.nextInt();
                scan.nextLine();
                strikestwo = strikestwo - acetwo;
                System.out.println(topicsNotUnderstood + two + ":");
                topictwo = scan.nextInt();
                scan.nextLine();
                strikestwo = strikestwo + topictwo;
                System.out.println(regularProjects + two + ":");
                projectstwo = scan.nextInt();
                scan.nextLine();
                strikestwo = strikestwo + projectstwo;
                System.out.println(capstoneProjects + two + ":");
                capstonetwo = scan.nextInt();
                scan.nextLine();
                System.out.println(timeTaken + two + ":");
                timetwo = scan.nextDouble();
                scan.nextLine();
                if (strikestwo > 2 || capstonetwo > 0) {
                    passed = false;
                    System.out.println(failedLevel);
                    System.out.println("Level Number: " + two);
                    System.out.println("Description: " + descriptiontwo);
                    System.out.println("Difficulty: " + difficultytwo);
                    System.out.println(playAgainBeginning + two + playAgainEnd);
                    String againtwo = scan.nextLine();
                    if (againtwo.equalsIgnoreCase("yes")) {
                        strikestwo = 0;
                        capstonetwo = 0;

                    } else {
                        level = 0;
                        break;
                    }

                } else {
                    break;
                }

            }


        int strikesthree = 0;
        int three = newlevel.getLevelNumber();
        three = 3;
        String descriptionthree = newlevel.getDescription();
        descriptionthree = descriptionThree;
        String difficultythree = newlevel.getDescription();
        difficultythree = "Easy";
        int acethree = newlevel.getAcedTests();
        int topicthree = newlevel.getHardTopicsIncomplete();
        int projectsthree = newlevel.getRegularProjectsIncomplete();
        int capstonethree = newlevel.getCapstoneProjectsIncomplete();
        double timethree = newlevel.getTime();
        timethree = 0;

        while (level > 2) {
            System.out.println(numAcedTests + three + ":");
            acethree = scan.nextInt();
            scan.nextLine();
            strikesthree = strikesthree - acethree;
            System.out.println(topicsNotUnderstood + three + ":");
            topicthree = scan.nextInt();
            scan.nextLine();
            strikesthree = strikesthree + topicthree;
            System.out.println(regularProjects + three + ":");
            projectsthree = scan.nextInt();
            scan.nextLine();
            strikesthree = strikesthree + projectsthree;
            System.out.println(capstoneProjects + three + ":");
            capstonethree = scan.nextInt();
            scan.nextLine();
            System.out.println(timeTaken + three + ":");
            timethree = scan.nextDouble();
            scan.nextLine();
            if (strikesthree > 2 || capstonethree > 0) {
                passed = false;
                System.out.println(failedLevel);
                System.out.println("Level Number: " + three);
                System.out.println("Description: " + descriptionthree);
                System.out.println("Difficulty: " + difficultythree);
                System.out.println(playAgainBeginning + three + playAgainEnd);
                String againthree = scan.nextLine();
                if (againthree.equalsIgnoreCase("yes")) {
                    strikesthree = 0;
                    capstonethree = 0;

                } else {
                    level = 0;
                    break;
                }

            } else {
                break;
            }

        }

        int strikesfour = 0;
        int four = newlevel.getLevelNumber();
        four = 4;
        String descriptionfour = newlevel.getDescription();
        descriptionfour = descriptionFour;
        String difficultyfour = newlevel.getDescription();
        difficultyfour = "Easy";
        int acefour = newlevel.getAcedTests();
        int topicfour = newlevel.getHardTopicsIncomplete();
        int projectsfour = newlevel.getRegularProjectsIncomplete();
        int capstonefour = newlevel.getCapstoneProjectsIncomplete();
        double timefour = newlevel.getTime();
        timefour = 0;

        while (level > 3) {
            System.out.println(numAcedTests + four + ":");
            acefour = scan.nextInt();
            scan.nextLine();
            strikesfour = strikesfour - acefour;
            System.out.println(topicsNotUnderstood + four + ":");
            topicfour = scan.nextInt();
            scan.nextLine();
            strikesfour = strikesfour + topicfour;
            System.out.println(regularProjects + four + ":");
            projectsfour = scan.nextInt();
            scan.nextLine();
            strikesfour = strikesfour + projectsfour;
            System.out.println(capstoneProjects + four + ":");
            capstonefour = scan.nextInt();
            scan.nextLine();
            System.out.println(timeTaken + four + ":");
            timefour = scan.nextDouble();
            scan.nextLine();
            if (strikesfour > 2 || capstonefour > 0) {
                passed = false;
                System.out.println(failedLevel);
                System.out.println("Level Number: " + four);
                System.out.println("Description: " + descriptionfour);
                System.out.println("Difficulty: " + difficultyfour);
                System.out.println(playAgainBeginning + four + playAgainEnd);
                String againfour = scan.nextLine();
                if (againfour.equalsIgnoreCase("yes")) {
                    strikesfour = 0;
                    capstonefour = 0;

                } else {
                    level = 0;
                    break;
                }

            } else {
                break;
            }

        }

        int strikesfive = 0;
        int five = newlevel.getLevelNumber();
        five = 5;
        String descriptionfive = newlevel.getDescription();
        descriptionfive = descriptionFive;
        String difficultyfive = newlevel.getDescription();
        difficultyfive = "Intermediate";
        int acefive = newlevel.getAcedTests();
        int topicfive = newlevel.getHardTopicsIncomplete();
        int projectsfive = newlevel.getRegularProjectsIncomplete();
        int capstonefive = newlevel.getCapstoneProjectsIncomplete();
        double timefive = newlevel.getTime();
        timefive = 0;

        while (level > 4) {
            System.out.println(numAcedTests + five + ":");
            acefive = scan.nextInt();
            scan.nextLine();
            strikesfive = strikesfive - acefive;
            System.out.println(topicsNotUnderstood + five + ":");
            topicfive = scan.nextInt();
            scan.nextLine();
            strikesfive = strikesfive + topicfive;
            System.out.println(regularProjects + five + ":");
            projectsfive = scan.nextInt();
            scan.nextLine();
            strikesfive = strikesfive + projectsfive;
            System.out.println(capstoneProjects + five + ":");
            capstonefive = scan.nextInt();
            scan.nextLine();
            System.out.println(timeTaken + five + ":");
            timefive = scan.nextDouble();
            scan.nextLine();
            if (strikesfive > 2 || capstonefive > 0) {
                passed = false;
                System.out.println(failedLevel);
                System.out.println("Level Number: " + five);
                System.out.println("Description: " + descriptionfive);
                System.out.println("Difficulty: " + difficultyfive);
                System.out.println(playAgainBeginning + five + playAgainEnd);
                String againfive = scan.nextLine();
                if (againfive.equalsIgnoreCase("yes")) {
                    strikesfive = 0;
                    capstonefive = 0;

                } else {
                    level = 0;
                    break;
                }

            } else {
                break;
            }

        }

        int strikessix = 0;
        int six = newlevel.getLevelNumber();
        six = 6;
        String descriptionsix = newlevel.getDescription();
        descriptionsix = descriptionSix;
        String difficultysix = newlevel.getDescription();
        difficultysix = "Intermediate";
        int acesix = newlevel.getAcedTests();
        int topicsix = newlevel.getHardTopicsIncomplete();
        int projectssix = newlevel.getRegularProjectsIncomplete();
        int capstonesix = newlevel.getCapstoneProjectsIncomplete();
        double timesix = newlevel.getTime();
        timesix = 0;

        while (level > 5) {
            System.out.println(numAcedTests + six + ":");
            acesix = scan.nextInt();
            scan.nextLine();
            strikessix = strikessix - acesix;
            System.out.println(topicsNotUnderstood + six + ":");
            topicsix = scan.nextInt();
            scan.nextLine();
            strikessix = strikessix + topicsix;
            System.out.println(regularProjects + six + ":");
            projectssix = scan.nextInt();
            scan.nextLine();
            strikessix = strikessix + projectssix;
            System.out.println(capstoneProjects + six + ":");
            capstoneone = scan.nextInt();
            scan.nextLine();
            System.out.println(timeTaken + six + ":");
            timesix = scan.nextDouble();
            scan.nextLine();
            if (strikessix > 2 || capstonesix > 0) {
                passed = false;
                System.out.println(failedLevel);
                System.out.println("Level Number: " + six);
                System.out.println("Description: " + descriptionsix);
                System.out.println("Difficulty: " + difficultysix);
                System.out.println(playAgainBeginning + six + playAgainEnd);
                String againsix = scan.nextLine();
                if (againsix.equalsIgnoreCase("yes")) {
                    strikessix = 0;
                    capstonesix = 0;

                } else {
                    level = 0;
                    break;
                }

            } else {
                break;
            }

        }

        int strikesseven = 0;
        int seven = newlevel.getLevelNumber();
        seven = 7;
        String descriptionseven = newlevel.getDescription();
        descriptionseven = descriptionSeven;
        String difficultyseven = newlevel.getDescription();
        difficultyseven = "Intermediate";
        int aceseven = newlevel.getAcedTests();
        int topicseven = newlevel.getHardTopicsIncomplete();
        int projectsseven = newlevel.getRegularProjectsIncomplete();
        int capstoneseven = newlevel.getCapstoneProjectsIncomplete();
        double timeseven = newlevel.getTime();
        timeseven = 0;

        while (level > 6) {
            System.out.println(numAcedTests + seven + ":");
            aceseven = scan.nextInt();
            scan.nextLine();
            strikesseven = strikesseven - aceseven;
            System.out.println(topicsNotUnderstood + seven + ":");
            topicseven = scan.nextInt();
            scan.nextLine();
            strikesseven = strikesseven + topicseven;
            System.out.println(regularProjects + seven + ":");
            projectsseven = scan.nextInt();
            scan.nextLine();
            strikesseven = strikesseven + projectsseven;
            System.out.println(capstoneProjects + seven + ":");
            capstoneseven = scan.nextInt();
            scan.nextLine();
            System.out.println(timeTaken + seven + ":");
            timeseven = scan.nextDouble();
            scan.nextLine();
            if (strikesseven > 2 || capstoneseven > 0) {
                passed = false;
                System.out.println(failedLevel);
                System.out.println("Level Number: " + seven);
                System.out.println("Description: " + descriptionseven);
                System.out.println("Difficulty: " + difficultyseven);
                System.out.println(playAgainBeginning + seven + playAgainEnd);
                String againseven = scan.nextLine();
                if (againseven.equalsIgnoreCase("yes")) {
                    strikesseven = 0;
                    capstoneseven = 0;

                } else {
                    level = 0;
                    break;
                }

            } else {
                break;
            }

        }

        int strikeseight = 0;
        int eight = newlevel.getLevelNumber();
        eight = 8;
        String descriptioneight = newlevel.getDescription();
        descriptioneight = descriptionEight;
        String difficultyeight = newlevel.getDescription();
        difficultyeight = "Intermediate";
        int aceeight = newlevel.getAcedTests();
        int topiceight = newlevel.getHardTopicsIncomplete();
        int projectseight = newlevel.getRegularProjectsIncomplete();
        int capstoneeight = newlevel.getCapstoneProjectsIncomplete();
        double timeeight = newlevel.getTime();
        timeeight = 0;

        while (level > 7) {
            System.out.println(numAcedTests + eight + ":");
            aceeight = scan.nextInt();
            scan.nextLine();
            strikeseight = strikeseight - aceeight;
            System.out.println(topicsNotUnderstood + eight + ":");
            topiceight = scan.nextInt();
            scan.nextLine();
            strikeseight = strikeseight + topiceight;
            System.out.println(regularProjects + eight + ":");
            projectseight = scan.nextInt();
            scan.nextLine();
            strikeseight = strikeseight + projectseight;
            System.out.println(capstoneProjects + eight + ":");
            capstoneeight = scan.nextInt();
            scan.nextLine();
            System.out.println(timeTaken + eight + ":");
            timeeight = scan.nextDouble();
            scan.nextLine();
            if (strikeseight > 2 || capstoneeight > 0) {
                passed = false;
                System.out.println(failedLevel);
                System.out.println("Level Number: " + eight);
                System.out.println("Description: " + descriptioneight);
                System.out.println("Difficulty: " + difficultyeight);
                System.out.println(playAgainBeginning + eight + playAgainEnd);
                String againeight = scan.nextLine();
                if (againeight.equalsIgnoreCase("yes")) {
                    strikeseight = 0;
                    capstoneeight = 0;

                } else {
                    level = 0;
                    break;
                }

            } else {
                break;
            }

        }

        int strikesnine = 0;
        int nine = newlevel.getLevelNumber();
        nine = 9;
        String descriptionnine = newlevel.getDescription();
        descriptionnine = descriptionNine;
        String difficultynine = newlevel.getDescription();
        difficultynine = "Hard";
        int acenine = newlevel.getAcedTests();
        int topicnine = newlevel.getHardTopicsIncomplete();
        int projectsnine = newlevel.getRegularProjectsIncomplete();
        int capstonenine = newlevel.getCapstoneProjectsIncomplete();
        double timenine = newlevel.getTime();
        timenine = 0;

        while (level > 8) {
            System.out.println(numAcedTests + nine + ":");
            acenine = scan.nextInt();
            scan.nextLine();
            strikesnine = strikesnine - acenine;
            System.out.println(topicsNotUnderstood + nine + ":");
            topicone = scan.nextInt();
            scan.nextLine();
            strikesone = strikesnine + topicnine;
            System.out.println(regularProjects + nine + ":");
            projectsnine = scan.nextInt();
            scan.nextLine();
            strikesnine = strikesnine + projectsnine;
            System.out.println(capstoneProjects + nine + ":");
            capstonenine = scan.nextInt();
            scan.nextLine();
            System.out.println(timeTaken + nine + ":");
            timenine = scan.nextDouble();
            scan.nextLine();
            if (strikesnine > 2 || capstonenine > 0) {
                passed = false;
                System.out.println(failedLevel);
                System.out.println("Level Number: " + nine);
                System.out.println("Description: " + descriptionnine);
                System.out.println("Difficulty: " + difficultynine);
                System.out.println(playAgainBeginning + nine + playAgainEnd);
                String againnine = scan.nextLine();
                if (againnine.equalsIgnoreCase("yes")) {
                    strikesnine = 0;
                    capstonenine = 0;

                } else {
                    level = 0;
                    break;
                }

            } else {
                break;
            }

        }

        int strikesten = 0;
        int ten = newlevel.getLevelNumber();
        ten = 10;
        String descriptionten = newlevel.getDescription();
        descriptionten = descriptionTen;
        String difficultyten = newlevel.getDescription();
        difficultyten = "Easy";
        int aceten = newlevel.getAcedTests();
        int topicten = newlevel.getHardTopicsIncomplete();
        int projectsten = newlevel.getRegularProjectsIncomplete();
        int capstoneten = newlevel.getCapstoneProjectsIncomplete();
        double timeten = newlevel.getTime();
        timeten = 0;

        while (level > 9) {
            System.out.println(numAcedTests + ten + ":");
            aceten = scan.nextInt();
            scan.nextLine();
            strikesten = strikesten - aceten;
            System.out.println(topicsNotUnderstood + ten + ":");
            topicten = scan.nextInt();
            scan.nextLine();
            strikesten = strikesten + topicten;
            System.out.println(regularProjects + ten + ":");
            projectsten = scan.nextInt();
            scan.nextLine();
            strikesten = strikesten + projectsten;
            System.out.println(capstoneProjects + ten + ":");
            capstoneone = scan.nextInt();
            scan.nextLine();
            System.out.println(timeTaken + ten + ":");
            timeten = scan.nextDouble();
            scan.nextLine();
            if (strikesten > 2 || capstoneten > 0) {
                passed = false;
                System.out.println(failedLevel);
                System.out.println("Level Number: " + ten);
                System.out.println("Description: " + descriptionten);
                System.out.println("Difficulty: " + difficultyten);
                System.out.println(playAgainBeginning + ten + playAgainEnd);
                String againten = scan.nextLine();
                if (againten.equalsIgnoreCase("yes")) {
                    strikesten = 0;
                    capstoneten = 0;

                } else {
                    level = 0;
                    break;
                }

            } else {
                break;
            }

        }

        int strikeseleven = 0;
        int eleven = newlevel.getLevelNumber();
        eleven = 11;
        String descriptioneleven = newlevel.getDescription();
        descriptioneleven = descriptionEleven;
        String difficultyeleven = newlevel.getDescription();
        difficultyeleven = "Hard";
        int aceeleven = newlevel.getAcedTests();
        int topiceleven = newlevel.getHardTopicsIncomplete();
        int projectseleven = newlevel.getRegularProjectsIncomplete();
        int capstoneeleven = newlevel.getCapstoneProjectsIncomplete();
        double timeeleven = newlevel.getTime();
        timeeleven = 0;

        while (level > 10) {
            System.out.println(numAcedTests + eleven + ":");
            aceeleven = scan.nextInt();
            scan.nextLine();
            strikeseleven = strikeseleven - aceeleven;
            System.out.println(topicsNotUnderstood + eleven + ":");
            topiceleven = scan.nextInt();
            scan.nextLine();
            strikeseleven = strikeseleven + topiceleven;
            System.out.println(regularProjects + eleven + ":");
            projectseleven = scan.nextInt();
            scan.nextLine();
            strikeseleven = strikeseleven + projectseleven;
            System.out.println(capstoneProjects + eleven + ":");
            capstoneeleven = scan.nextInt();
            scan.nextLine();
            System.out.println(timeTaken + eleven + ":");
            timeeleven = scan.nextDouble();
            scan.nextLine();
            if (strikeseleven > 2 || capstoneeleven > 0) {
                passed = false;
                System.out.println(failedLevel);
                System.out.println("Level Number: " + eleven);
                System.out.println("Description: " + descriptioneleven);
                System.out.println("Difficulty: " + difficultyeleven);
                System.out.println(playAgainBeginning + eleven + playAgainEnd);
                String againeleven = scan.nextLine();
                if (againeleven.equalsIgnoreCase("yes")) {
                    strikeseleven = 0;
                    capstoneeleven = 0;

                } else {
                    level = 0;
                    break;
                }

            } else {
                break;
            }

        }

        int strikestwelve = 0;
        int twelve = newlevel.getLevelNumber();
        twelve = 12;
        String descriptiontwelve = newlevel.getDescription();
        descriptiontwelve = descriptionTwelve;
        String difficultytwelve = newlevel.getDescription();
        difficultytwelve = "Hard";
        int acetwelve = newlevel.getAcedTests();
        int topictwelve = newlevel.getHardTopicsIncomplete();
        int projectstwelve = newlevel.getRegularProjectsIncomplete();
        int capstonetwelve = newlevel.getCapstoneProjectsIncomplete();
        double timetwelve = newlevel.getTime();
        timetwelve = 0;

        while (level > 11) {
            System.out.println(numAcedTests + twelve + ":");
            acetwelve = scan.nextInt();
            scan.nextLine();
            strikestwelve = strikestwelve - acetwelve;
            System.out.println(topicsNotUnderstood + twelve + ":");
            topictwelve = scan.nextInt();
            scan.nextLine();
            strikestwelve = strikestwelve + topictwelve;
            System.out.println(regularProjects + twelve + ":");
            projectstwelve = scan.nextInt();
            scan.nextLine();
            strikestwelve = strikestwelve + projectstwelve;
            System.out.println(capstoneProjects + twelve + ":");
            capstonetwelve = scan.nextInt();
            scan.nextLine();
            System.out.println(timeTaken + twelve + ":");
            timetwelve = scan.nextDouble();
            scan.nextLine();
            if (strikestwelve > 2 || capstonetwelve > 0) {
                passed = false;
                System.out.println(failedLevel);
                System.out.println("Level Number: " + twelve);
                System.out.println("Description: " + descriptiontwelve);
                System.out.println("Difficulty: " + difficultytwelve);
                System.out.println(playAgainBeginning + twelve + playAgainEnd);
                String againtwelve = scan.nextLine();
                if (againtwelve.equalsIgnoreCase("yes")) {
                    strikestwelve = 0;
                    capstonetwelve = 0;

                } else {
                    level = 0;
                    break;
                }

            } else {
                break;
            }

        }

        int strikestwelveplus = 0;
        int twelveplus = newlevel.getLevelNumber();
        twelveplus = 13;
        String descriptiontwelveplus = newlevel.getDescription();
        descriptiontwelveplus = diabolical;
        String difficultytwelveplus = newlevel.getDescription();
        difficultytwelveplus = "Diabolical";
        int acetwelveplus = newlevel.getAcedTests();
        int topictwelveplus = newlevel.getHardTopicsIncomplete();
        int projectstwelveplus = newlevel.getRegularProjectsIncomplete();
        int capstonetwelveplus = newlevel.getCapstoneProjectsIncomplete();
        double timetwelveplus = newlevel.getTime();
        timetwelveplus = 0;
        double timeplus = 0;
        int topicplus = 0;
        int projectsplus = 0;

        int totallevel = level;

        while (level > 12) {
            System.out.println(numAcedTests + twelveplus + ":");
            acetwelveplus = scan.nextInt();
            scan.nextLine();
            strikestwelveplus = strikestwelveplus - acetwelveplus;
            System.out.println(topicsNotUnderstood + twelveplus + ":");
            topictwelveplus = scan.nextInt();
            scan.nextLine();
            strikestwelveplus = strikestwelveplus + topictwelveplus;
            System.out.println(regularProjects + twelveplus + ":");
            projectstwelveplus = scan.nextInt();
            scan.nextLine();
            strikestwelveplus = strikestwelveplus + projectstwelveplus;
            System.out.println(capstoneProjects + twelveplus + ":");
            capstonetwelveplus = scan.nextInt();
            scan.nextLine();
            System.out.println(timeTaken + twelveplus + ":");
            timetwelveplus = scan.nextDouble();
            scan.nextLine();
            timeplus = timeplus + timetwelveplus;
            topicplus = topictwelveplus + topicplus;
            projectsplus = projectsplus + projectstwelveplus;
            if (strikestwelveplus > 2 || capstonetwelveplus > 0) {
                passed = false;
                System.out.println(failedLevel);
                System.out.println("Level Number: " + twelveplus);
                System.out.println("Description: " + descriptiontwelveplus);
                System.out.println("Difficulty: " + difficultytwelveplus);
                System.out.println(playAgainBeginning + twelveplus + playAgainEnd);
                String againtwelveplus = scan.nextLine();
                if (againtwelveplus.equalsIgnoreCase("yes")) {
                    strikestwelveplus = 0;
                    capstonetwelveplus = 0;

                } else {
                    level = 0;
                    break;
                }

            } else {
                level--;

            }

        }



        if (passed = true) {
            System.out.println(congratulationsBeginning + studentname + congratualationsEnd);
            System.out.println("Course Obstacles:");
            System.out.println("Levels: " + totallevel);
            System.out.println("Hard Topics Per Level: " + topic);
            System.out.println("Projects Per Level: " + project);
        }




        //if graduation congrats System.out.println("Graduated!"); if level is > than 0  and total level
        //now diplaying general info also int newace = aceone +
        System.out.println("--- Now displaying information about the student ---");
        System.out.println("Name: " + studentname);
        System.out.println("University: " + studentuniversity);

        int topicsmastered = (totallevel * topic) - topicone - topictwo - topicthree - topicfour - topicfive - topicsix - topicseven - topiceight - topicnine - topicten - topiceleven - topictwelve - topicplus;

        if (topicsmastered < 0) {
            topicsmastered = 0;
        }

        System.out.println("Topics Mastered: " + topicsmastered);

        int projectscompleted = (totallevel * project) - projectsone - projectstwo - projectsthree - projectsfour - projectsfive - projectssix - projectsseven - projectseight - projectsnine - projectsten - projectseleven - projectstwelve - projectsplus;

        if (projectscompleted < 0) {
            projectscompleted = 0;
        }

        System.out.println("Projects Completed: " + projectscompleted);

        System.out.println("Graduated: " + passed);

        double careertime = timeone + timetwo + timethree + timefour + timefive + timesix + timeseven + timeeight + timenine + timeten + timeeleven + timetwelve + timeplus;

        if (careertime > 0 && careertime < .51) {
            careertime = 0.5;
        } else if (careertime > .5 && careertime < 1.01 ) {
            careertime = 1.0;
        } else if (careertime > 1.0 && careertime < 1.51 ) {
            careertime = 1.5;
        } else if (careertime > 1.5 && careertime < 2.01 ) {
            careertime = 2.0;
        } else if (careertime > 2.0 && careertime < 2.51 ) {
            careertime = 2.5;
        } else if (careertime > 2.5 && careertime < 3.01 ) {
            careertime = 3.0;
        } else if (careertime > 3.0 && careertime < 3.51 ) {
            careertime = 3.5;
        } else if (careertime > 3.5 && careertime < 4.01 ) {
            careertime = 4.0;
        } else if (careertime > 4.0 && careertime < 4.51 ) {
            careertime = 4.5;
        } else if (careertime > 4.5 && careertime < 5.01 ) {
            careertime = 5.0;
        } else if (careertime > 5.0 && careertime < 5.51 ) {
            careertime = 5.5;
        } else if (careertime > 5.5 && careertime < 6.01 ) {
            careertime = 6.0;
        } else if (careertime > 6.0 && careertime < 6.51 ) {
            careertime = 6.5;
        } else if (careertime > 6.5 && careertime < 7.01 ) {
            careertime = 7.0;
        } else if (careertime > 7.0 && careertime < 7.51 ) {
            careertime = 7.5;
        } else if (careertime > 7.5 && careertime < 8.01 ) {
            careertime = 8.0;
        }


        System.out.println("Career Time: " + careertime + " years");

        System.out.println(thankYou);







        //while








    }
}
