public class Car {

    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int productionYear;
    public String origin;

    @Override
    public String toString() {
        return "Марка автомобиля - " + brand + " ,модель - " + model + " ,объем двигателя - " + engineVolume +
                " ,цвет -" + color + " ,год выпуска - " + productionYear +
                " ,страна производства - " + origin;


    }
        public Car(String brand, String model, double engineVolume, String color, int productionYear, String origin) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.origin = origin;
    }
}
