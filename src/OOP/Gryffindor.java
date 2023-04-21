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
    @Override
    public int getAbility() {
        return honor + courage + nobility;
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
    public String toString() {
        return super.toString() +
                "honor=" + honor +
                ", courage=" + courage +
                ", nobility=" + nobility;

    }

    public void compareStudents(Gryffindor secondStudent) {
        if (this.getAbility() > secondStudent.getAbility()) {
            System.out.println(this.toString() + " лучший Гриффиндорец, чем " + secondStudent.toString());
        }
        else if (this.getAbility() < secondStudent.getAbility()) {
            System.out.println(secondStudent.toString() + " лучший Гриффиндорец, чем " + this.toString());
        }
        else {
            System.out.println(this.toString() + " и " + secondStudent.toString() + " одинаковые по силе Гриффиндорцы");
        }
    }
}