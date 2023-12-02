public class Kelvin extends Temperature {
    public Kelvin(double temperature) {
        super(temperature);
    }
    @Override
    public String temperatureConverter() {
        return String.format("Исходная температура: %.2f К. В цельсиях: %.2f C, в фаренгейтах: %.2f F", getTemperature() , getTemperature() - 273.15,(((getTemperature() - 273.15) * 9 / 5) + 32));
    }
}
