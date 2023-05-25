package de.aittr;

import jdk.jfr.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class WeatherToolsTest {
    @ParameterizedTest

    @CsvSource({

            "0, true, 'Gusty Calm Air with speed of 0 km'",
            "0.5, false, 'Calm Air with speed of 0.5 km'",
            "5, true, 'Gusty Light Air with speed of 5 km'",
            "1, false, 'Light Air with speed of 1 km'",
            "6.8, true, 'Gusty Light Breeze with speed of 6.8 km'",
            "11, false, 'Light Breeze with speed of 11 km'",
            "12, true, 'Gusty Gentle Breeze with speed of 12 km'",
            "19, false, 'Gentle Breeze with speed of 19 km'",
            "20.5, true, 'Gusty Moderate Breeze with speed of 20.5 km'",
            "20, false,  'Moderate Breeze with speed of 20 km'",
            "30, true, 'Gusty Fresh Breeze with speed of 30 km'",
            "30.2, false, 'Fresh Breeze with speed of 30.2 km'",
            "39, true, 'Gusty Fresh Breeze with speed of 39 km'",
            "39, false, 'Fresh Breeze with speed of 39 km'",
            "SS, false, 'Fresh Breeze with speed of 39 km'"

    })
     void getWindDescription_test1(double speed, boolean isGusty, String discription) {
        assertEquals(discription, WeatherTools.getWindDescription(speed, isGusty));
    }

}