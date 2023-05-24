
/**
 * @author Karen Vanessa González Alarcon
 */

public class Cuadrado extends Figura{

    private double lado;


    public Cuadrado(String tipo, double lado) {
        super(tipo);
        this.lado = lado;

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    @Override
    public void calcularArea() {

        if (this.lado > 10){
            System.out.println("Alguno de los lados deben ser menor a 10");
            return;
        }
        double area = (lado * lado);
        System.out.println("Su area es:"+ area);
    }

    @Override
    public void calcularPerimetro() {

        if (this.lado > 10 ){
            System.out.println("Alguno de los lados deben ser menor a 10");
            return;
        }
        double perimetro = 4*lado;
        System.out.println("Su perimetro es: "+perimetro);

    }
}
