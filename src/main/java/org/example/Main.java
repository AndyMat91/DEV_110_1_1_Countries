package org.example;

public class Main {
    public static void main(String[] args) {

        //Массив содержащий объекты класса Country
        Country[] countries = new Country[]{
                new Country("Russia", 17_100_000, 146_700_000, "Moscow", 12_600_000),
                new Country("Finland", 338_000, 5_500_000, "Helsinki", 655_000),
                new Country("France", 643_800, 67_800_000, "Paris", 2_100_000),
                new Country("Andorra", 467, 85_400, "Andorra la Vella", 22_600),
                new Country("Singapore", 725, 5_700_000)
        };

        Country uk = new Country("United Kingdom", 242_495, 0);
        Country usa = new Country("The United States of America", 9_826_675, 0, "Washington", 0);

        System.out.println("Выводим содержимое массива при помощи метода printAll класса Country:");
        System.out.println();
        Country.printAll(countries);

        System.out.println("Вывод случая, когда население страны неизвестно:");
        uk.print();
        System.out.println();

        System.out.println("Вывод случая, когда население страны и столицы неизвестно:");
        usa.print();
        System.out.println();

        System.out.println("Проверим метод задающий/сбрасывающий данные о столице на примере USA, сперва зададим данные:");
        usa.setClearCapitalPopulationAndName(1234456, "test");
        usa.print();
        System.out.println();

        System.out.println("Теперь сбросим данные:");
        usa.setClearCapitalPopulationAndName(0, null);
        usa.print();
        System.out.println();

        System.out.println("Проверим как выбрасывается исключение, если население страны будет меньше нуля:");
        usa.setCountryPopulation(-1);
        System.out.println();
    }
}