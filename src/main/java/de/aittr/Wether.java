package de.aittr;

public class Wether {
    public static String describeTemperature(int temperature){
        if (temperature>0 && temperature<=10){
            return "свежо";
        }
        if (temperature>10 && temperature<=20){
            return "тепло";
        }

        if (temperature>20){
            return "жарко";
        }
        return "холодно";
    }
}
