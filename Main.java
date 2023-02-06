package Exer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.println("Entre com seus dados : ");

        System.out.println("Name :");
        func.Name = sc.nextLine();
        System.out.println("Gross salary : ");
        func.GrossSalary =  sc.nextDouble();
        System.out.println("Tax : ");
        func.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employeeb " + func);
        System.out.println();
        System.out.println("Wich percentage salary to increase salary ? ");

        double percentage = sc.nextDouble();
        func.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data : "+ func);




       sc.close();



    }
}
