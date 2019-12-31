package Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeassurements(80, 65, 30.4f);
        weatherData.setMeassurements(82, 70, 29.2f);
        weatherData.setMeassurements(78, 90, 29.2f);
    }
}
