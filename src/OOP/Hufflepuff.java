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
    public void getStudentInfo() {
        System.out.println("Ученик " + getName() + " " + getSurname() + " имеет следующие характеристики: " +
                "мощность: " + getMagicPower() + ", дальность: " + getTransgressionDistance() + ", трудолюбие: " + getHardworking() +
                ", верность: " + getLoyalty() +  ", честность: " + getHonesty());
    }
    public static void compareStudents(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int firstStudentCount = firstStudent.getHardworking() + firstStudent.getHonesty() + firstStudent.getLoyalty();
        int secondStudentCount = secondStudent.getHardworking() + secondStudent.getHonesty() + secondStudent.getLoyalty();
        if (firstStudentCount > secondStudentCount) {
            System.out.println(firstStudent.getName() + " лучший Пуффендуец, чем " + secondStudent.getName());
        }
        else if (firstStudentCount < secondStudentCount) {
            System.out.println(secondStudent.getName() + " лучший Пуффендуец, чем " + firstStudent.getName());
        }
        else {
            System.out.println(firstStudent.getName() + " и " + secondStudent.getName() + " одинаковые по силе Пуффендуйцы");
        }
    }
}
