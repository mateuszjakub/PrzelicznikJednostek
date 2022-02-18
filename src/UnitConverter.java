import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        int mainChoice;
        int secondChoice;
        double value;
        double result=0;

        System.out.println("Wybierz miarę do przeliczenia:");
        System.out.println("Długość - 1\nWaga -2\nTemperatura -3");
        Scanner scan = new Scanner(System.in);
        mainChoice = scan.nextInt();
        System.out.println("Twój wybór to: "+mainChoice);
        System.out.println("Wybierz co chcesz przeliczyć: ");

        switch(mainChoice){
            case 1: System.out.println("metry na kilometry - 1\nkilometry na centymetry -2\ncentymetry na metry -3"); break;
            case 2: System.out.println("kilogramy na gramy - 1\ngramy na kilogramy -2\nkilogramy na tony -3"); break;
            case 3: System.out.println("Celsjusz na Fahrenheit - 1\nCelsjusz na Kelwin -2\nKelwin na Celsjusz -3"); break;
        }
        secondChoice = scan.nextInt();
        System.out.println("Twój wybór to: "+secondChoice);

        System.out.println("Podaj wartość:");
        value = scan.nextInt();

        if(mainChoice==1)
            result = convertDistance(value, secondChoice);
        if(mainChoice==2)
            result = convertWeight(value, secondChoice);
        if (mainChoice==3)
            result = convertTemperature(value, secondChoice);

        System.out.println("Wynik po przeliczeniu: "+result);

    }
    public static double convertDistance(double value, int secondChoice) {
        double result = 0;
        switch(secondChoice){
            case 1: result = value/1000; break;
            case 2: result = value*100000; break;
            case 3: result = value/100; break;
        }
        return result;
    }

    public static double convertWeight(double value, int secondChoice) {
        double result = 0;
        switch(secondChoice){
            case 1: result = value*1000; break;
            case 2: result = value/1000; break;
            case 3: result = value/1000; break;
        }
        return result;
    }

    public static double convertTemperature(double value, int secondChoice) {
        double result = 0;
        switch(secondChoice){
            case 1: result = 32+9/5*value; break;
            case 2: result = value+273; break;
            case 3: result = value-273; break;
        }
        return result;
    }
}
