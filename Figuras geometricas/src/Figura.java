/**
 * @author Karen Vanessa González Alarcon
 */
public abstract class Figura {
     private String tipo;



    public Figura(String tipo) {
        this.tipo = tipo;
      ;
    }
/*Los (get (Obtener) tipo de dato y retorna la variable  definida en las propiedades.EJ = Nombre en la linea 16 =  nombre en la linea 5)y los (set (Colocar)con este se puede settiar la primera vez  y si tiene datos se puede modificar) siempre deben de ir debajo del construrtor */
public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public abstract void calcularArea();

    public  abstract void calcularPerimetro();
}

