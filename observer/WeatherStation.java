public class WeatherStation {

  public static void main(String[] args) {
    // First create the WeatherData object
    WeatherData weatherData = new WeatherData();

    // Create the displays and pass them the WeatherData object
    CurrentConditionsDisplay currentDisplay =
      new CurrentConditionsDisplay(weatherData);
    //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    /*
     * TODO fix incompatible types, can't pass Observable weatherData where
     * constuctor arg still expects Subject weatherData
     */
    //HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    // Simulate new weather measurements
    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);
  }

}
