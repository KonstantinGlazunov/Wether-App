package de.aittr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WetherTest {

    @ParameterizedTest
    @CsvSource({
            "5, 'свежо'",
            "10, 'свежо'",
            "0, 'холодно'",
            "20, 'тепло'",
            "30, 'жарко'",
            "-30, 'холодно'"
    })
    void describeTemperature_test1(int temperature, String description) {
        assertEquals(
                description,
                Wether.describeTemperature(temperature)
        );

    }
}