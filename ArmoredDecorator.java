class ArmoredDecorator extends CarDecorator {
    public ArmoredDecorator(Car decoratedCar) {
        super(decoratedCar);
    }
    public String getDesc() {
        return super.getDesc() + ", with armor";
    }
    public double cost() {
        return super.cost() + 10000;
    }
}