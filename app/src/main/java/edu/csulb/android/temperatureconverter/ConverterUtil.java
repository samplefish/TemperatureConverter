package edu.csulb.android.temperatureconverter;


public class ConverterUtil {
    public static float convertFahrenheitToCelcius(float fahrenheit)
    {
        return ((fahrenheit - 32) * 5 / 9);
    }
    public static float convertCelciusToFahrenheit(float celcius)
    {
        return ((celcius * 9) / 5) + 32;
    }
}
