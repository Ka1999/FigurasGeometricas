import java.util.Scanner;

/**
 * @author Karen Vanessa González Alarcon
 */
public class Main {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        String figuraACrear;
        double tamanoFiguraAltura;
        double tamanoFiguraBase;


        while(true){
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.print("Ingrese la figura a crear, las opciones son las siguientes: \nRectangulo\nCuadrado\nEscaleno\nCubo\nCilindro\nTu opcion es:");
            figuraACrear = scanner.nextLine();
            System.out.print("Ingrese el tamaño de la altura: ");
            tamanoFiguraAltura =Double.parseDouble(scanner.nextLine());
            if(figuraACrear != "Cubo" || figuraACrear != "Cuadrado") {
                if (figuraACrear == "Cilindro"){
                    System.out.print("Ingrese el tamaño del radio: ");
                }else {
                    System.out.print("Ingrese el tamaño de la base: ");
                }
                tamanoFiguraBase = Double.parseDouble(scanner.nextLine());
            }else{
                tamanoFiguraBase = 0;
            }
            operarFigura(figuraACrear, tamanoFiguraAltura, tamanoFiguraBase);
            System.out.println("--------------------------------------------------------------------------------------------------------");
        }

    }

    public static void operarFigura(String figura, double altura, double base){
        double area = 0;
        double perimetro = 0;
        double volumen = 0;

        switch (figura){
            case "Cuadrado":
                Cuadrado cuadrado = new Cuadrado("Cuadrado" ,altura);
                System.out.println("Tu figura creada es: "+ cuadrado.getTipo());
                cuadrado.calcularArea();
                cuadrado.calcularPerimetro();
                break;
            case "Rectangulo":
                Rectangulo rectangulo = new Rectangulo("Rectangulo" ,altura,base);
                System.out.println("Tu figura creada es: "+ rectangulo.getTipo());
                rectangulo.calcularArea();
                rectangulo.calcularPerimetro();
                break;
            case "Escaleno":
                Triangulo escaleno = new Triangulo("Escaleno" ,altura,base);
                System.out.println("Tu figura creada es: "+ escaleno.getTipo());
                escaleno.calcularArea();
                escaleno.calcularPerimetro();
                break;
            case "Cubo":
                Cubo cubo = new Cubo("Cubo" ,altura);
                System.out.println("Tu figura creada es: "+ cubo.getTipo());
                cubo.calcularArea();
                cubo.calcularPerimetro();
                cubo.calcularVolumen();
                break;
            case "Cilindro":
                Cilindro cilindro = new Cilindro("Cilindro" ,base,altura);
                System.out.println("Tu figura creada es: "+ cilindro.getTipo());
                cilindro.calcularArea();
                cilindro.calcularPerimetro();
                cilindro.calcularVolumen();
                break;
            default:
                System.out.println("Figura incorrecta");
                break;
        }

    }

}