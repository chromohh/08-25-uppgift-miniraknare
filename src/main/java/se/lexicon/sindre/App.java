package se.lexicon.sindre;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner Input = new Scanner(System.in);
        double nummer1;
        double nummer2;
        System.out.println("***Miniräknare***");
        String sat;
        System.out.println("Skriv ditt första tal");
        nummer1 = Input.nextDouble();
        boolean stop = true;
        String com;
        String d;

        while(stop){
            System.out.println("Välj räknemetod mellan +, -, /, *");
            sat = Input.next();
            System.out.println("skriv ditt andra tal");
            nummer2 = Input.nextDouble();

            switch(sat){
                case "+":
                    nummer1 = Add(nummer1, nummer2);
                    System.out.println("resultat = " +nummer1);
                    break;
                case "-":
                    nummer1 = Sub(nummer1, nummer2);
                    System.out.println("resultat = " +nummer1);
                    break;
                case "*" :
                    nummer1 = Mul(nummer1, nummer2);
                    System.out.println("resultat = " +nummer1);
                    break;
                case "/" :
                    nummer1 = Div(nummer1, nummer2);
                    System.out.println("resultat = " + nummer1);
                    break;
            }

            System.out.println("1 för att avsluta, valfri tangent för att fortsätta.");
            d = Input.next();
            switch(d){
                case "1":
                    stop = false;
                    break;
            }



        }
    }

    public static double Sub(double a, double b){
        return a - b;
    }
    public static double Div(double a, double b){
        return a / b;
    }
    public static double Add(double a, double b){
        return a + b;
    }
    public static double Mul(double a, double b){
        return a * b;
    }

}
