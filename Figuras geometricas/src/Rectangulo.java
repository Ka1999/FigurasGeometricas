
/**
 * @author Karen Vanessa González Alarcon
 */

public class Rectangulo extends Figura {
    private double altura;
    private double base;

    public Rectangulo(String tipo, double altura, double base) {
        super(tipo);
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void calcularArea() {

        if (this.altura > 10.0 && this.base > 10.0){
            System.out.println("Alguno de los lados deben ser menor a 10");
            return;
        }
        double area = this.base * this.altura;
        System.out.println("Su area es: " + area);

    }



    @Override
    public void calcularPerimetro() {

        if (this.altura > 10 && this.base > 10){
            System.out.println("Alguno de los lados deben ser menor a 10");
            return;
        }
        double calculo = ((2 * base) + (2 * altura));
        System.out.println("Su perimetro es: " + calculo);

    }
}
