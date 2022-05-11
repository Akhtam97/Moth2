public class Conultation11_05_2 {
}
class Food{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getThirsty() {
        return thirsty;
    }

    public void setThirsty(int thirsty) {
        this.thirsty = thirsty;
    }

    private int satiety;
    private int thirsty;

    public Food(String name, int satiety, int thirsty) {
        this.name = name;
        this.satiety = satiety;
        this.thirsty = thirsty;
    }
}
