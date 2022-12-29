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
}
