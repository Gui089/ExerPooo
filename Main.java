package aula67;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter rectangle width and height :");

        Retan rect = new Retan();

        rect.Width = sc.nextDouble();
        rect.height = sc.nextDouble();

        double area = rect.Area();
        double peri =  rect.Perimeter();
        double diagonal = rect.Diagonal();

        System.out.println("Area : "+area);
        System.out.println("Perimeter : "+peri);
        System.out.println("Diaginal : "+diagonal);







    }
}
