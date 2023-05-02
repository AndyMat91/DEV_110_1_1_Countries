package org.example;

public class Country {

    private String countryName;
    private int countryArea;
    private int countryPopulation;
    private String capitalName;
    private int capitalPopulation;

    public Country(String name, int area, int population, String capname, int cappopulation) {
        setCountryName(name);
        setCountryArea(area);
        setCountryPopulation(population);
        setCapitalPopulation(cappopulation);
        setCapitalName(capname);
    }

    public Country(String name, int area, int population) {
        setCountryName(name);
        setCountryArea(area);
        setCountryPopulation(population);
    }

    public int getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(int countryArea) {
        if (countryArea <= 0) {
            throw new IllegalArgumentException("Площадь страны должна быть больше нуля");
        } else {
            this.countryArea = countryArea;
        }

    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        if (countryName == null) {
            throw new IllegalArgumentException("Название страны не должно быть пустым");
        } else {
            this.countryName = countryName;
        }
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
        if (countryPopulation <= 0 && countryPopulation != 0) {
            throw new IllegalArgumentException("Население страны должно быть больше нуля");
        } else {
            this.countryPopulation = countryPopulation;
        }
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        if (capitalName == null) {
            throw new IllegalArgumentException("Название страны не должно быть пустым");
        } else {
            this.capitalName = capitalName;
        }
    }

    public int getCapitalPopulation() {
        return capitalPopulation;
    }

    public void setCapitalPopulation(int capitalPopulation) {
        if (capitalPopulation <= 0 && capitalPopulation != 0) {
            throw new IllegalArgumentException("Население страны должно быть больше нуля");
        } else {
            this.capitalPopulation = capitalPopulation;
        }
    }

    //Метод, задающий/сбрасывающий данные о столице (проверка на пустую строку и 0 отключены, для сброса);
    public void setClearCapitalPopulationAndName(int capitalPopulation, String capitalName) {
        this.capitalPopulation = capitalPopulation;
        this.capitalName = capitalName;
    }

    public float getDensityPopulation() {
        return (float) countryPopulation / countryArea;
    }

    public void print() {
        System.out.print("Название страны: " + countryName + ", площадь = " + countryArea + " кв.км, население страны = ");
        if (countryPopulation != 0) {
            System.out.println(countryPopulation + " человек;");
            System.out.println("Плотность населения страны = " + getDensityPopulation() + " человека на 1 км²;");
        } else {
            System.out.println(" неизвестно;");
            System.out.println("Плотность населения страны = неизвестно;");
        }
        if (capitalName != null) {
            System.out.print("Столица " + capitalName + " с населением ");
        } else {
            System.out.print("Столица неизвестна, населениее ");
        }
        if (capitalPopulation != 0) {
            System.out.println(capitalPopulation + " человек.");
        } else {
            System.out.println(" неизвестно.");
        }
    }

    // Используя цикл For-each вызовем для каждого элемента массива countries метод print()
    public static void printAll(Country[] countries) {
        for (Country x : countries) {
            x.print();
            System.out.println();
        }
    }
}
