public class TemperatureConverter {
  public static void main(String[] args) {
      int tempInFahrenheit = 350;
      float tempInCelsius = (tempInFahrenheit - 32f) * (5f/9f);
      System.out.println("Fahrenheit: " + tempInFahrenheit + "˚F");
      System.out.println("Celsius: " + tempInCelsius + "˚C");
  }
}
