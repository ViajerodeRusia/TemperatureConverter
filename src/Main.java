public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Temperature[] temperatures = {
                new Celsius(-10),
                new Fahrenheit(40),
                new Kelvin(270)
        };

        for (Temperature temperature : temperatures) {
            System.out.println(temperature.temperatureConverter());
            System.out.println("____________");
        }
    }
}