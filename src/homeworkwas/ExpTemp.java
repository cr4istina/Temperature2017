package homeworkwas;

public class ExpTemp {
    public static void main(String[] args) {
        System.out.println("The medium temperature of the 2017 year in Chisinau:");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        double[] celsius = {-4.2, -0.5, 7.8, 9.4, 16.4, 21.3, 22.4, 23.7, 18.6, 10.8, 5.5, 3.3};

        System.out.println("Here you can see the temperature in celsius grades:");
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i] + " " + celsius[i] + "; ");
        }
        System.out.println(" ");

        System.out.println("Here is the temperature for those who are familiar with Kelvin:");
        for (int i = 0; i < months.length; i++) {
            double kelvin;
            kelvin = celsius[i] + 273.15;
            System.out.println(months[i] + " " + kelvin + "; ");
        }
        System.out.println(" ");

        System.out.println("And for those who needs the information in fahrenheit:");
        for (int i = 0; i < months.length; i++) {
            double fahrenheit;
            fahrenheit = (celsius[i] * (9 / 5)) + 32;
            System.out.println(months[i] + " " + fahrenheit + "; ");
        }
        System.out.println(" ");




    }
}
