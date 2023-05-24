
/**
 * @author Karen Vanessa González Alarcon
 */
public class Cubo extends Figura implements Volumen  {
    double tamano;
    double tamanoY;

    public Cubo(String tipo,double tamano) {
        super(tipo);
        this.tamano =tamano;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public void calcularArea() {


        if (tamano > 10) {
            System.out.println("Alguno de los lados deben ser menor a 10");
            return;
        }
        double area = tamano * tamano ;
        double totalaArea = area * 6;
        System.out.println("Su area es: "+ totalaArea);

    }

    @Override
    public void calcularPerimetro() {

        if (tamano > 10) {
            System.out.println("Alguno de los lados deben ser menor a 10");
            return;
        }
        double perimetro = 12 * tamano;
        System.out.println("Su perimetro es: "+perimetro);
    }

    @Override
    public void calcularVolumen() {

        if (tamano > 10) {
            System.out.println("Alguno de los lados deben ser menor a 10");
            return;
        }
        double volumen = tamano * tamano * tamano;
        System.out.println("Su Volumen es: "+ volumen);
    }
}
