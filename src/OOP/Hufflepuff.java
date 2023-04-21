package OOP;

public class Hufflepuff extends Hogwarts {
    private int hardworking; // трудолюбие
    private int loyalty; // верность
    private int honesty; // честность
    public Hufflepuff(String name, String surname, int magicPower, int transgressionDistance, int hardworking, int loyalty, int honesty) {
        super(name, surname, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    @Override
    public int getAbility() {
        return hardworking + loyalty + honesty;
    }
    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty
                ;
    }

    public void compareStudents(Hufflepuff secondStudent) {
        if (this.getAbility() > secondStudent.getAbility()) {
            System.out.println(this.toString() + " лучший Пуффендуец, чем " + secondStudent.toString());
        }
        else if (this.getAbility() < secondStudent.getAbility()) {
            System.out.println(secondStudent.toString() + " лучший Пуффендуец, чем " + this.toString());
        }
        else {
            System.out.println(this.toString() + " и " + secondStudent.toString() + " одинаковые по силе Пуффендуйцы");
        }
    }
}
