package se.lexicon.sindre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App
{
    private static Scanner myInput = new Scanner(System.in);
    public static void main( String[] args )
    {
        double nummer1;
        double nummer2;
        boolean stop = true;
        String rmetod;

        System.out.println("***Miniräknare***\nSkriv ditt första tal");
        nummer1 = convertDouble("s", 1);


        while(stop){
            System.out.println("Välj räknemetod mellan +, -, /, *");
            rmetod = myInput.next();
            System.out.println("Skriv ditt andra tal");
            nummer2 = convertDouble("s", 1);

            switch(rmetod){
                case "+":
                    nummer1 = Add(nummer1, nummer2);
                    System.out.println("Resultat = " +nummer1);
                    break;
                case "-":
                    nummer1 = Sub(nummer1, nummer2);
                    System.out.println("Resultat = " +nummer1);
                    break;
                case "*" :
                    nummer1 = Mul(nummer1, nummer2);
                    System.out.println("Resultat = " +nummer1);
                    break;
                case "/" :
                    nummer1 = Div(nummer1, nummer2);
                    System.out.println("Resultat = " + nummer1);
                    break;
            }

            System.out.println("1 för att avsluta \n2 för att nollställa \nValfri tangent för att fortsätta.");
            String d;
            d = myInput.next();
            switch(d){
                case "1":
                    stop = false;
                    break;
                case "2":
                    System.out.println("Skriv ditt första tal");
                    nummer1 = convertDouble("a", 1);;
                    break;
            }

        }
    }

    public static double Sub(double a, double b){ return a - b;}
    public static double Div(double a, double b){ return a / b;}
    public static double Add(double a, double b){ return a + b;}
    public static double Mul(double a, double b){ return a * b;}
    public static double convertDouble(String a, double output)
    {
        boolean loop = true;
        while(loop){
            try{
                a = myInput.next();
                output = Double.parseDouble(a);
                loop = false;
            }catch(NumberFormatException e){
                System.out.println("Fel, skriv ett nummer");
                loop = true;
            }
        }
        return output;
    }

}
