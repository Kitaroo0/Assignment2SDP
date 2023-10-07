public class Main {
    public static void main(String[] args) {
        Car bmw = new BMW();
        System.out.println("Car: " + bmw.getDesc());
        System.out.println("Price: $" + bmw.cost());

        Car ArmoredBMW = new ArmoredDecorator(bmw);
        System.out.println("Car: " + ArmoredBMW.getDesc());
        System.out.println("Price: $" + ArmoredBMW.cost());

        Car MArmoredBMW = new MDecorator(ArmoredBMW);
        System.out.println("Car: " + MArmoredBMW.getDesc());
        System.out.println("Price: $" + MArmoredBMW.cost());

        Car MBMW = new MDecorator(bmw);
        System.out.println("Car: " + MBMW.getDesc());
        System.out.println("Price: $" + MBMW.cost());
    }
}