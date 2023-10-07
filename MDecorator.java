class MDecorator extends CarDecorator {
    public MDecorator(Car decoratedCar) {
        super(decoratedCar);
    }
    public String getDesc() {
        return super.getDesc() + ", M package";
    }
    public double cost() {
        return super.cost() + 20000;
    }
}