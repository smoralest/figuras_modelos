package figura.logica;

public class Rectangulo extends Figura{
        
    public void calcularArea(){
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int base = temp.calcularDistancia(fin);
        int altura = origen.calcularDistancia(temp);
        area = base*altura;               
    }
    
    public void calcularPerimetro(){
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int base = temp.calcularDistancia(fin);
        int altura = origen.calcularDistancia(temp);
        perimetro = base*2+altura*2;
    }
}
