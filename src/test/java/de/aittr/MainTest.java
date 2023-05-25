package de.aittr;
import org.junit.jupiter.api.*;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static de.aittr.Main.isValidLogin;



@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)  //автоматическое прописание название Теста в консоле

class MainTest {
    @Test
    @DisplayName("isEven(3) -> False")
    public void isEven_3_Falsereturned() {
        assertFalse(Main.isEvenVers1(3));
    }

    @ParameterizedTest
    @DisplayName("isEven(even) -> true")
    @ValueSource(ints = {2, 6, 8, 64, 122, 800})
    public void isEven_even_TrueReturned(int number) {
        assertTrue(Main.isEvenVers1(number));
    }

    @ParameterizedTest
    // @DisplayName("isEven(odd) -> fals")
    @ValueSource(ints = {3, 11, 19, 65, 123, 801})
    public void isEven_even_FalsReturned(int number) {
        assertFalse(Main.isEvenVers1(number));
    }


    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    //автоматическое прописание название Теста в консоле
    @Nested
    class loginTests {


        @ParameterizedTest
        @ValueSource(strings = {"Pass@word", "TruePass@123123", "password@isnottrue", "1234@556789"})
        public void isValidLogin_loginMore8_TrueReturned(String login) {
            assertTrue(isValidLogin(login));
        }


        @ParameterizedTest
        @ValueSource(strings = {"Pass", "Tr@ue", "true", "1234567"})
        public void isValidLogin_loginMore8_FalsReturned(String login) {
            assertFalse(isValidLogin(login));
        }

        @ParameterizedTest
        @ValueSource(strings = {"Pas@sword", "TruePass@123123", "passwordi@snottrue", "123455@6789"})
        public void isValidLogin_loginLess20_TrueReturned(String login) {
            assertTrue(isValidLogin(login));
        }

        @ParameterizedTest
        @ValueSource(strings = {"Password00000000000000", "TruePass123123qwwwwwwwwwwwwww", "passwordisnottruewwwwwwwwwwww", "1234556789wwwwwwwwwwwwwwwww"})
        public void isValidLogin_loginLess20_FalsReturned(String login) {
            assertFalse(isValidLogin(login));
        }

        @ParameterizedTest
        @ValueSource(strings = {"Pass@word", "TruePass@123123", "passwor@disnottrue", "12345@56789"})
        public void isValidLogin_containsAt_TrueReturned(String login) {
            assertTrue(isValidLogin(login));
        }

        @ParameterizedTest
        @ValueSource(strings = {"Password", "TruePass123123", "passwordisnottrue", "1234556789"})
        public void isValidLogin_containsAt_FalsReturned(String login) {
            assertFalse(isValidLogin(login));
        }


    }

    @Nested
    @DisplayName("getRectangleArea tests")
    class ForGetRectangleArea {
        @ParameterizedTest
        @CsvSource({
                "4, 5, 'Прямоугольник с площадью 20'",
                "10, 10, 'Прямоугольник с площадью 100'",
                "2, 3, 'Прямоугольник с площадью 6'"
        })
        public void getRectangleArea_test1(int a, int b, String message) {
            assertEquals(
                    Main.getRectangleArea(a, b),
                    message
            );
        }
    }


}