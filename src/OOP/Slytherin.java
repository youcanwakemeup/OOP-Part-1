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
    @Override
    public int getAbility() {
        return cunning + determination + ambition + resourcefulness + powerLust;
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
    public String toString() {
        return super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", powerLust=" + powerLust;
    }

    public void compareStudents(Slytherin secondStudent) {
        if (this.getAbility() > secondStudent.getAbility()) {
            System.out.println(this.toString() + " лучший Слизеринец, чем " + secondStudent.toString());
        }
        else if (this.getAbility() < secondStudent.getAbility()) {
            System.out.println(secondStudent.toString() + " лучший Слизеринец, чем " + this.toString());
        }
        else {
            System.out.println(this.toString() + " и " + secondStudent.toString() + " одинаковые по силе Слизеринцы");
        }
    }
}
