public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1");

        Car granta = new Car();
        granta.brand = "lada";
        granta.model = "Granta";
        granta.productionYear = 2015;
        granta.origin = "Россия";
        granta.color = "жёлтый";
        granta.engineVolume = 1.7;
        System.out.println(
                "Марка автомобиля - " + granta.brand +
                        ",модель - " + granta.model +
                        ",год выпуска - " + granta.productionYear +
                        ",страна производства - " + granta.origin +
                        ",цвет - " + granta.color +
                        ",объём двигателя - " +granta.engineVolume
        );

        Car Audi = new Car();
        Audi.brand = "Audi";
        Audi.model = "A8 50 L TDI quattro";
        Audi.productionYear = 2020;
        Audi.origin = "Германия";
        Audi.color = "чёрный";
        Audi.engineVolume = 3.0;
        System.out.println(
                "Марка автомобиля - " + Audi.brand +
                        ",модель - " + Audi.model +
                        ",год выпуска - " + Audi.productionYear +
                        ",страна производства - " + Audi.origin +
                        ",цвет - " + Audi.color +
                        ",объём двигателя - " +Audi.engineVolume
        );

        Car BMW = new Car();
        BMW.brand = "BMW";
        BMW.model = "z8";
        BMW.productionYear = 2021;
        BMW.origin = "Германия";
        BMW.color = "чёрный";
        BMW.engineVolume = 3.0;
        System.out.println(
                "Марка автомобиля - " + BMW.brand +
                        ",модель - " + BMW.model +
                        ",год выпуска - " + BMW.productionYear +
                        ",страна производства - " + BMW.origin +
                        ",цвет - " + BMW.color +
                        ",объём двигателя - " +BMW.engineVolume
        );

        Car Kia = new Car();
        Kia.brand = "Kia";
        Kia.model = "sportage";
        Kia.productionYear = 2018;
        Kia.origin = "Южная Корея";
        Kia.color = "красный";
        Kia.engineVolume = 2.4;
        System.out.println(
                "Марка автомобиля - " + Kia.brand +
                        ",модель - " + Kia.model +
                        ",год выпуска - " + Kia.productionYear +
                        ",страна производства - " + Kia.origin +
                        ",цвет - " + Kia.color +
                        ",объём двигателя - " +Kia.engineVolume
        );

        Car Hyundai = new Car();
        Hyundai.brand = "Hyundai";
        Hyundai.model = "avante";
        Hyundai.productionYear = 2016;
        Hyundai.origin = "Южная Корея";
        Hyundai.color = "оранжевый";
        Hyundai.engineVolume = 1.6;
        System.out.println(
                "Марка автомобиля - " + Hyundai.brand +
                        ",модель - " + Hyundai.model +
                        ",год выпуска - " + Hyundai.productionYear +
                        ",страна производства - " + Hyundai.origin +
                        ",цвет - " + Hyundai.color +
                        ",объём двигателя - " +Hyundai.engineVolume
        );

    System.out.println("Задание 2");




    }




}