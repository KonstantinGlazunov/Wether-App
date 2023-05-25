package de.aittr;


public class WeatherTools {

    /*public static String getWindDescription(double speed, boolean isGusty)
    Этот метод принимает скорость ветра и параметр сообщающий является ли ветер порывистым. Корреляция скорости ветра и описания:
<1 == Calm
1-5 == Light Air
6-11 == Light Breeze
12-19 == Gentle Breeze
20-28 == Moderate Breeze  // условия задачи не соответсвуют примеру
29-38 == Fresh Breeze

Пример работы метода:
getWindDescription(20, true) -> "Gusty Moderate Breeze with speed of 20 km"
getWindDescription(20, false) -> "Moderate Breeze with speed of 20 km"
getWindDescription(30, true) -> "Gusty Moderate Breeze with speed of 30 km"  // !!!!!!!!!!
getWindDescription(30, false) -> "Moderate Breeze with speed of 30 km"*/  // !!!!!!!!!!!!!!!

    public static String getWindDescription(double speed, boolean isGusty) {
        String isGustyDiscription = "";
        String discription1 = "";
        String discriptionSpeed = "";
        if (isGusty) {
            isGustyDiscription = "Gusty ";
        }
        if (speed <= 1) {
            discription1 = "Calm Air ";
        }
        if (speed >= 1 && speed <= 5) {
            discription1 = "Light Air ";
        }
        if (speed >= 6 && speed <= 11) {
            discription1 = "Light Breeze ";
        }
        if (speed >= 12 && speed <= 19) {
            discription1 = "Gentle Breeze ";
        }
        if (speed >= 20 && speed <= 28) {
            discription1 = "Moderate Breeze ";
        }
        if (speed > 28) {
            discription1 = "Fresh Breeze ";
        }
        if (speed % 1 == 0) {

            return isGustyDiscription + discription1 + "with speed of " + (int) speed + " km";
        }
        return isGustyDiscription + discription1 + "with speed of " + speed + " km";
    }

}
