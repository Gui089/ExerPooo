package aula67;

public class Retan {

    public double Width;

    public double height;

    public double Area() {

        double Cont = Width * height;
        return Cont;

    }
    public double Perimeter() {
        return (Width * 2) + (height *2);
    }

    public double Diagonal() {

        double d = Math.pow(Width, 2) + Math.pow(height,2);
        return Math.sqrt(d);

    }
}
