package OOP;

public class Gryffindor extends Hogwarts {
    private int honor; // честь
    private int courage; // храбрость
    private int nobility; // благородство

    public Gryffindor(String name, String surname, int magicPower, int transgressionDistance, int honor, int courage, int nobility) {
        super(name, surname, magicPower, transgressionDistance);
        this.honor = honor;
        this.courage = courage;
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    @Override
    public void getStudentInfo() {
        System.out.println("Ученик " + getName() + " " + getSurname() + " имеет следующие характеристики: " +
                "мощность: " + getMagicPower() + ", дальность: " + getTransgressionDistance() + ", честь: " + getHonor() +
                ", храбрость: " + getCourage() +  ", благородство: " + getNobility());
    }

    public static void compareStudents(Gryffindor firstStudent, Gryffindor secondStudent) {
        int firstStudentCount = firstStudent.getHonor() + firstStudent.getNobility() + firstStudent.getCourage();
        int secondStudentCount = secondStudent.getHonor() + secondStudent.getNobility() + secondStudent.getCourage();
        if (firstStudentCount > secondStudentCount) {
            System.out.println(firstStudent.getName() + " лучший Гриффиндорец, чем " + secondStudent.getName());
        }
        else if (firstStudentCount < secondStudentCount) {
            System.out.println(secondStudent.getName() + " лучший Гриффиндорец, чем " + firstStudent.getName());
        }
        else {
            System.out.println(firstStudent.getName() + " и " + secondStudent.getName() + " одинаковые по силе Гриффиндорцы");
        }
    }
}