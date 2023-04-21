package OOP;

public class Ravenclaw extends Hogwarts {
    private int cleverness; // ум
    private int wisdom; // мудрость
    private int wit; // остроумие
    private int creativity; // креативность

    public Ravenclaw(String name, String surname, int magicPower, int transgressionDistance, int cleverness, int wisdom, int wit, int creativity) {
        super(name, surname, magicPower, transgressionDistance);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    @Override
    public int getAbility() {
        return cleverness + wisdom + wit + creativity;
    }
    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    @Override
    public String toString() {
        return super.toString() +
                "cleverness=" + cleverness +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }

    public void compareStudents(Ravenclaw secondStudent) {
        if (this.getAbility() > secondStudent.getAbility()) {
            System.out.println(this.toString() + " лучший Когтевранец, чем " + secondStudent.toString());
        }
        else if (this.getAbility() < secondStudent.getAbility()) {
            System.out.println(secondStudent.toString() + " лучший Когтевранец, чем " + this.toString());
        }
        else {
            System.out.println(this.toString() + " и " + secondStudent.toString() + " одинаковые по силе Когтевранцы");
        }
    }
}
