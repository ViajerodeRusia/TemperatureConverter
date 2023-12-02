import java.util.Objects;

public abstract class Temperature {
    private double temperature;
    public abstract String temperatureConverter();

    public Temperature(double temperature) {
        this.temperature = temperature;
    }
    public double getTemperature() {
        return temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.temperature, temperature) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature);
    }
}
