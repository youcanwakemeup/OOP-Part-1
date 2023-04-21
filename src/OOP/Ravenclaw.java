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
    public void getStudentInfo() {
        System.out.println("Ученик " + getName() + " " + getSurname() + " имеет следующие характеристики: " +
                "мощность: " + getMagicPower() + ", дальность: " + getTransgressionDistance() + ", ум: " + getCleverness() +
                ", мудрость: " + getWisdom() +  ", остроумие: " + getWit()  +  ", креативность: " + getCreativity());
    }
    public static void compareStudents(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int firstStudentCount = firstStudent.getCleverness() + firstStudent.getWit() + firstStudent.getWisdom() + firstStudent.getCreativity();
        int secondStudentCount = secondStudent.getCleverness() + secondStudent.getWit() + secondStudent.getWisdom() + secondStudent.getCreativity();
        if (firstStudentCount > secondStudentCount) {
            System.out.println(firstStudent.getName() + " лучший Когтевранец, чем " + secondStudent.getName());
        }
        else if (firstStudentCount < secondStudentCount) {
            System.out.println(secondStudent.getName() + " лучший Когтевранец, чем " + firstStudent.getName());
        }
        else {
            System.out.println(firstStudent.getName() + " и " + secondStudent.getName() + " одинаковые по силе Когтевранцы");
        }
    }
}
