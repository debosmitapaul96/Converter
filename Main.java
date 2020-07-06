package Debo;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter converter;
        int choice;
        System.out.println("\n Enter your choice of conversion \n\n 1. Thermometer - Conversion from Degree Celcius to Degree Farenhite \n 2. Thermocouple - Conversion from Degree Celcius to Degree Kelvin \n 3. Pitot Tube - Conversion from kms to mach \n 4. Shaft Log - Conversion from kmh to mph");
        choice = sc.nextInt();

        switch(choice){
            case 1:
                converter = new Thermometer();

                double degc = 36;
                double convertedK = (double) converter.convert(degc);
                System.out.println("Temerature in degree Farenhite is "+convertedK);
                
                if(((TemperatureConverter)converter).isHot(degc)){
                    System.out.println("It is hot");
                } else {
                    System.out.println("It is normal...");
                }

                break;
                case 2:
                converter = new Thermocouple();

                double degci = 25;
                double convertedF = (double) converter.convert(degci);
                System.out.println("Temperature in degree Kelvin is "+convertedF);
                
                if(((TemperatureConverter)converter).isHot(degci)){
                    System.out.println("Its hot....");
                } else {
                    System.out.println("It is fine...");
                }

                break;

            case 3:
                converter = new PitotTube();

                double kms = 12;
                double convertedMach = (double) converter.convert(kms);
                System.out.println("Spped in Mach is "+convertedMach);
            
                if(((SpeedConverter)converter).isFast(kms)){
                    System.out.println("It is fast....");
                } else {
                    System.out.println("You can assume it slow...");
                }

                break;

            case 4:
                converter = new ShaftLog();

                double kmh = 75;
                double convertedMph = (double) converter.convert(kmh);
                System.out.println("Speed in mph is "+convertedMph);
               
                if(((SpeedConverter)converter).isFast(kmh)){
                    System.out.println("It is fast....");
                } else {
                    System.out.println("You can assume it slow...");
                }
                
                break;

            default :
                System.out.println("Please enter valid input as given in the option");
                break;
        }

    }
}