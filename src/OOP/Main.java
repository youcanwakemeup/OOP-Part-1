package OOP;

public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри", "Поттер", 70, 65, 100, 50, 30);
        Gryffindor hermione  = new Gryffindor("Гермиона", "Грейнджер", 50, 15, 90, 20, 10);
        Gryffindor ron = new Gryffindor("Рон", "Уизли", 60, 45, 80, 1000, 60);
        Slytherin draco = new Slytherin("Драко", "Малфой", 100, 65, 100, 50, 30, 40, 50);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", 50, 35, 100, 15, 30, 60, 50);
        Slytherin gregory  = new Slytherin("Грегори", "Гойл", 10, 25, 100, 50, 40, 40, 70);
        Hufflepuff zacharias = new Hufflepuff("Захария", "Смит", 60, 45, 80, 40, 20);
        Hufflepuff cedric = new Hufflepuff("Седрик", "Диггори", 80, 35, 90, 50, 40);
        Hufflepuff justin = new Hufflepuff("Джастин", "Финч-Флетчли", 90, 55, 10, 30, 10);
        Ravenclaw cho = new Ravenclaw("Чжоу", "Чанг", 30, 20, 10, 40, 50, 80);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 20, 30, 20, 50, 60, 70);
        Ravenclaw marcus = new Ravenclaw("Маркус", "Белби", 10, 40, 30, 60, 70, 60);
        System.out.println(harry.toString());
        harry.compareStudents(hermione);

    }
}