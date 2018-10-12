package experiment;

public class Temperature {
    String[] month;
    double[] celsius;
    double[] kelvin;
    double[] fahrenheit;

    protected String theMonth(String[] month, int a) {
        if (a <= month.length && a > 0) {
            return month[--a];
        } else {
            String s = "wrong number - sorry!";
            return s;
        }
    }

    protected double celsiusDegeree(double[] celsius, int a) {
        if (a <= celsius.length && a > 0) {
            return celsius[--a];
        } else {
            return 0;
        }
    }

    protected double kelvinDegeree(double[] kelvin, int a) {
        if (a <= kelvin.length && a > 0) {
            return kelvin[--a];
        } else {
            return 0;
        }
    }

    protected double fahrenheitDegeree(double[] fahrenheit, int a) {
        if (a <= fahrenheit.length && a > 0) {
            return fahrenheit[--a];
        } else {
            return 0;
        }
    }

    protected String theDegres(double[] celsius, double[] kelvin, double[] fahrenheit, int a) {
        if (a <= celsius.length && a <= kelvin.length && a <= fahrenheit.length && a > 0) {
            String info;
            info = celsius[--a] + " Celsius, " + kelvin[--a] + " Kelvin and " + fahrenheit[--a] + " Fahrenheit.";
                    return info;
        } else {
            return "Sorry! Wrong number.";
        }
    }




}