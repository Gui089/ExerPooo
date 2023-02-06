package Exer2;

public class Funcionario {

    public String Name;
    public double GrossSalary;
    public double tax;

    public double NetSalary(){
        return GrossSalary - tax;
    }

   public void increaseSalary(double percentage) {
        GrossSalary += GrossSalary * percentage / 100;
   }

   public String toString () {
        return Name + ", $ " + String.format("% .2f", NetSalary());
   }

}
