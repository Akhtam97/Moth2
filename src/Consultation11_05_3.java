import java.util.Scanner;

public class Consultation11_05_3 {
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cat cat = new Cat("Putin", 50, 50);

        Food lagman = new Food("Lagman", 30, 5);
        Food water = new Food("water", 0, 50);
        Food cheaps = new Food("cheaps", 5, -30);

        boolean game = true;
        while (game) {

            System.out.println("Start, game");
            System.out.println("---------------------");
            System.out.println("Name our cat: " + cat.getName() + "\nSatiety : " + cat.getMaxSatiety() + "\nThirsty : " + cat.getMaxThirsty());

            System.out.println("Action: ");
            String action = sc.nextLine();

            switch (action) {
                case "1":
                    eat(cat, lagman);
                    break;
                case "2":
                    eat(cat, water);
                    break;
                case "3":
                    eat(cat, cheaps);
                    break;
                case "4":
                    System.out.println("Ne dal edy");
                    break;
            }
            if (cat.getMaxThirsty() < cat.getMinThirsty() || cat.getSatiety() < cat.getMinSatiety()){
                System.out.println(cat.getName() + " Dead");
            }else {
                System.out.println(cat.getName() + " is Happy");
            }
            cat.setSatiety(cat.getSatiety()-10);
            cat.setThirsty(cat.getThirsty()-10);
        }
    }

    public static void eat(Cat cat, Food food) {
        cat.setThirsty(cat.getThirsty() + food.getThirsty());
        cat.setSatiety(cat.getSatiety() + food.getSatiety());
    }
}