public interface Observer {
  /*
   * This Observer interface is implemented by all WeatherData observers,
   * so they all have to implement the update() method. Here we're
   * passing the measurements directly to the observers, which may not be best.
   */
  public void update(float temp, float humidity, float pressure);// state values Observers get from Subject on state change
}
