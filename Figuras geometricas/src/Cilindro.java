
/**
 * @author Karen Vanessa González Alarcon
 */

public class Cilindro extends Figura implements Volumen{
    double radio;
    double altura;


    public Cilindro(String tipo, double radio, double altura) {
        super(tipo);
        this.radio = radio;
        this.altura= altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }



    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public void calcularArea() {

        if (this.altura > 10 && this.radio > 10) {
            System.out.println("Alguno de los lados deben ser menor a 10");
            return;
        }
        double area = ((2 * 3.14) * radio) * (radio + altura);
        System.out.println("Su area es:"+ area);
    }


    @Override
    public void calcularPerimetro() {
        if (this.altura > 10 && this.radio > 10) {
            System.out.println("Alguno de los lados deben ser menor a 10");
            return;
        }
        double perimetro = ((2*3.14)* radio);
        System.out.println("Su perimetro es: "+perimetro);
    }

    @Override
    public void calcularVolumen() {

        if (this.altura > 10 && this.radio > 10) {
            System.out.println("Alguno de los lados deben ser menor a 10");
            return;
        }
        double calcVolumen = ((3.14 * (radio * radio)) * altura);
        System.out.println("Su Volumen es:"+calcVolumen);

    }
}

