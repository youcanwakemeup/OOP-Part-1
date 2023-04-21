package OOP;

public class Slytherin extends Hogwarts {
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int powerLust; // жажда власти

    public Slytherin(String name, String surname, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int powerLust) {
        super(name, surname, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }
    @Override
    public void getStudentInfo() {
        System.out.println("Ученик " + getName() + " " + getSurname() + " имеет следующие характеристики: " +
                "мощность: " + getMagicPower() + ", дальность: " + getTransgressionDistance() + ", хитрость: " + getCunning() +
                ", решительность: " + getDetermination() +
                ", амбициозность: " + getAmbition() + ", находчивость: " + getResourcefulness() + ", жажда власти: " + getPowerLust());
    }
    public static void compareStudents(Slytherin firstStudent, Slytherin secondStudent) {
        int firstStudentCount = firstStudent.getCunning() + firstStudent.getPowerLust() + firstStudent.getResourcefulness() + firstStudent.getDetermination() + firstStudent.getAmbition();
        int secondStudentCount = secondStudent.getCunning() + secondStudent.getPowerLust() + secondStudent.getResourcefulness() + secondStudent.getDetermination() + secondStudent.getAmbition();
        if (firstStudentCount > secondStudentCount) {
            System.out.println(firstStudent.getName() + " лучший Слизеринец, чем " + secondStudent.getName());
        }
        else if (firstStudentCount < secondStudentCount) {
            System.out.println(secondStudent.getName() + " лучший Слизеринец, чем " + firstStudent.getName());
        }
        else {
            System.out.println(firstStudent.getName() + " и " + secondStudent.getName() + " одинаковые по силе Слизеринцы");
        }
    }
}
