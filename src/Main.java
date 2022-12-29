public class Main {

    public static void main(String[] args) {

         System.out.println("Задание 3");

        Car granta = new Car(null,"Granta",1.7,"жёлтый",2015,"Россия");
        System.out.println(granta);


        Car Audi = new Car("Audi",null,3.0,"чёрный",2020,"Германия");
        System.out.println(Audi);

        Car BMW = new Car("BMW","z8",0,"чёрный",2021,"Германия");
        System.out.println(BMW);

        Car Kia = new Car("Kia","sportage",2.4,null,2018,"Южная Корея");
        System.out.println(Kia);

        Car Hyundai = new Car("Hyundai","avante",1.6,"оранжевый",0,"Южная Корея");
        System.out.println(Hyundai);
    }

}