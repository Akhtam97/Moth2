public class Country {
    String name;
    String location;
    String language;
    int size;
    String president;

    public static void main(String[] args) {
        Country countryOne = new Country();
        countryOne.name = "Russia";
        countryOne.location = "Eurasia";
        countryOne.language = "Russian";
        countryOne.size = 17100000;
        countryOne.president = "V.V.Putin";
        System.out.println(countryOne.name + " "
                + countryOne.location + " "
                + countryOne.language + " "
                + countryOne.size + " "
                + countryOne.president);
    }
}