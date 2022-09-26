package figura.logica;

public class TrianguloRectangulo extends Figura {

    public void calcularArea() {
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int base = temp.calcularDistancia(fin);
        int altura = origen.calcularDistancia(temp);
        area = (base * altura) / 2;
    }
    
    public void calcularPerimetro(){
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int base = temp.calcularDistancia(fin);
        int altura = origen.calcularDistancia(temp);
        int h = origen.calcularDistancia(fin);
        perimetro = base+altura+h;
    }
}
