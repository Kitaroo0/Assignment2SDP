abstract class CarDecorator implements Car {
    protected Car decoratedCar;
    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }
    public String getDesc() {
        return decoratedCar.getDesc();
    }
    public double cost() {
        return decoratedCar.cost();
    }
}