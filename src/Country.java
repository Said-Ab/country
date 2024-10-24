public class Country {
    private String name;
    private int countOfPopulation;
    private int area;
    private String language;



    public Country(String name, int countOfPopulation, int area, String language) {
        this.name = name;
        this.countOfPopulation = countOfPopulation;
        this.area = area;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfPopulation() {
        return countOfPopulation;
    }

    public void setCountOfPopulation(int countOfPopulation) {
        this.countOfPopulation = countOfPopulation;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static void theBiggest(Country[] countries) {
        Country countryTheBiggest = countries[0];
        for (Country country:countries) {
          if (country.getArea()>countryTheBiggest.getArea()){
              countryTheBiggest=country;
          }
        }
        System.out.println("The biggest country from list"+countryTheBiggest);
    }


    @Override
    public String toString() {
        return " Country" +
                "\nname:" + name +
                "\ncountOfPopulation=" + countOfPopulation +
                "\narea=" + area +
                "\nanguage:" + language +"\n";
    }
}



