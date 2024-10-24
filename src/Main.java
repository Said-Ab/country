import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Country country1=new Country("Россия", 144500000, 17098242, "Русский");
        Country country2=new Country("Канада", 37590000, 9984670, "Английский, Французский");
        Country country3=new Country("Китай", 1402000000, 9596961, "Китайский");
        Country country4=new Country("США", 331000000, 9833517, "Английский");
    Country[]countries={country1,country4,country2,country3};
        System.out.println(Arrays.toString(countries));
    Country.theBiggest(countries);




    }
}