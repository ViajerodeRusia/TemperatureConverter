public class TemperatureService {
    Temperature[] temperatures;
    public String temperatureConverter(Temperature temperature) throws TemperatureException {
        if(!temperature.equals(null)) {
        return temperature.temperatureConverter();
        }
        throw new TemperatureException("Incorrect temperature data. Please, try again.");
    }
}