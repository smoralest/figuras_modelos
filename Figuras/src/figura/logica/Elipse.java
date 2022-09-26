
package figura.logica;

public class Elipse extends Figura{
    public void calcularArea(){
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int base = temp.calcularDistancia(fin);
        int altura = origen.calcularDistancia(temp);
        area = (int) Math.PI*base*altura; 
    }
    
    public void calcularPerimetro(){
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int base = temp.calcularDistancia(fin);
        int altura = origen.calcularDistancia(temp);
        perimetro = (int) ((2*Math.PI)*Math.sqrt((Math.pow(base,2)+Math.pow(altura,2))/2)); 
    }
}
