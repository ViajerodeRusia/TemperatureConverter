public class Celsius extends Temperature {
    public Celsius(double temperature) {
        super(temperature);
    }
    @Override
    public String temperatureConverter() {
        return String.format("Исходная температура: %.2f C. В кельвинах: %.2f К, в фаренгейтах: %.2f F", getTemperature(), getTemperature() + 273.15, getTemperature() * 9 / 5 + 32);
    }
}
