package edu.csulb.android.temperatureconverter;

/**
 * Created by William on 5/19/2017.
 */

import static org.junit.Assert.*;

import edu.csulb.android.temperatureconverter.ConverterUtil;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConverterUtilTest {

    @Test
    public void testConvertFahrenheitToCelsius() {
        float actual = ConverterUtil.convertCelciusToFahrenheit(100);
        // expected value is 212
        float expected = 212;
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        float actual = ConverterUtil.convertFahrenheitToCelcius(212);
        // expected value is 100
        float expected = 100;
        assertEquals("Conversion from fahrenheit to celsius failed", expected, actual, 0.001);
    }

}