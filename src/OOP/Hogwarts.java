package OOP;

public abstract class Hogwarts {
    private int magicPower;
    private int transgressionDistance;
    private String name;
    private String surname;

    public Hogwarts(String name, String surname, int magicPower, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public static void compareAllStudents(Hogwarts firstStudent, Hogwarts secondStudent) {
        if (firstStudent.getMagicPower() > secondStudent.getMagicPower()) {
            System.out.println(firstStudent.toString() + "обладает большей мощностью магии, чем " + secondStudent.toString());
        }
        else if (firstStudent.getMagicPower() < secondStudent.getMagicPower()) {
            System.out.println(secondStudent.toString() + "обладает большей мощностью магии, чем " + firstStudent.toString());
        }
        else {
            System.out.println(secondStudent.toString() + "обладает такой же мощностью магии, как и " + firstStudent.toString());
        }
        if (firstStudent.getTransgressionDistance() > secondStudent.getTransgressionDistance()) {
            System.out.println(firstStudent.toString() + "обладает большей дальностью магии, чем " + secondStudent.toString());
        }
        else if (firstStudent.getTransgressionDistance() < secondStudent.getTransgressionDistance()) {
            System.out.println(secondStudent.toString() + "обладает большей дальностью магии, чем " + firstStudent.toString());
        }
        else {
            System.out.println(secondStudent.toString() + "обладает такой же дальностью магии, как и " + firstStudent.toString());
        }
    }
    public abstract int getAbility();
    @Override
    public String toString() {
        return
                "magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'';
    }
}
