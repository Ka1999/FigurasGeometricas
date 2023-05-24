
/**
 * @author Karen Vanessa González Alarcon
 */
public class Triangulo extends Figura{

    double base;
    double altura;


    public Triangulo(String tipo, double base, double altura) {
        super(tipo);
        this.base= base;
        this .altura =altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
            if (base > 10 && altura > 10) {
                System.out.println("Uno de los dos lados debe de ser menor a 10");
                return;
            }
            double area = (base * altura) / 2;
            System.out.println("Su area es:"+ area);
    }

    @Override
    public void calcularPerimetro() {

        if (this.altura > 10 && this.base > 10) {
            System.out.println("Los lados deben ser menor a 10");
            return;
        }
        double hipotenusa =Math.sqrt(base*base + altura*altura);
        double perimetro = base+altura+hipotenusa;
        System.out.println("Su perimetro es: " + perimetro);
    }
}
