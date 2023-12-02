public class Fahrenheit extends Temperature {
    public Fahrenheit(double temperature) {
        super(temperature);
    }
    @Override
    public String temperatureConverter() {
        return String.format("Исходная температура: %.2f F. В цельсиях: %.2f C, в кельвинах: %.2f К", getTemperature(),(getTemperature() - 32) * 5 / 9, (getTemperature() - 32) * 5 / 9 + 273.15);
    }
}
