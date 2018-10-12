package experiment;

public class MethodP {
    public static void main(String[] args) {

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "Oktober", "November", "December"};

        double[] celsius = {-4.2, -0.5, 7.8, 9.4, 16.4, 21.3, 22.4, 23.7, 18.6, 10.8, 5.5, 3.3};

        double[] kelvin = new double[12];
        for (int i = 0; i < celsius.length; i++) {
            kelvin[i] = celsius[i] + 273.15;
        }

        double[] fahrenheit = new double[12];
        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (celsius[i] * (9 / 5)) + 32;
        }

        Temperature pickAmonth = new Temperature();
        Temperature celsiusD = new Temperature();
        Temperature kelvinD = new Temperature();
        Temperature fahrenheitD = new Temperature();
        Temperature information = new Temperature();

        String x = pickAmonth.theMonth(month, 3);
        double y = celsiusD.celsiusDegeree(celsius, 3);
        double z = kelvinD.kelvinDegeree(kelvin, 3);
        double w = fahrenheitD.fahrenheitDegeree(fahrenheit, 3);
        String v = information.theDegres(celsius, kelvin, fahrenheit, 3);
        System.out.println("You choosed the month: " + x + ", the temperature for it was: " + y + " Celsius, " + z + " Kelvin and " + w + " Fahrenheit.");
        System.out.println(" ");
        System.out.println("You choosed the month: " + x + ", the temperature for it was: " + v);
    }

}
