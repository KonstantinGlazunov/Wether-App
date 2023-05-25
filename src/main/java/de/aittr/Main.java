package de.aittr;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(WeatherTools.getWindDescription(20, true));

        double x = 5.0;
        double y = x%10;
        double z = x/10;
        System.out.println(x + " "+ y+ " " + z);


    }

    public static boolean isEvenVers1(int number) {

        return number % 2 == 0;
        // return isEven(number);  //нужно сменить название нашего метода
    }

    public static boolean isValidLogin(String login) {
        return login.length() >= 8
                && login.length() <= 20
                && login.contains("@");
    }

    public static String getRectangleArea(int a, int b){
        // getRectangleArea(4,5) --> "Прямоугольник с площадью 20";
        return "Прямоугольник с площадью " + (a*b);
    }



}
