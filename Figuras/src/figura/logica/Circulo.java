package figura.logica;

public class Circulo extends Figura{
    
    public void calcularArea(){
        int r = origen.calcularDistancia(fin);
        area = (int) (Math.PI*Math.pow(r,2));
    }
    
    public void calcularPerimetro(){
        int r = origen.calcularDistancia(fin);
        perimetro = (int) (Math.PI*2*r);
    }
}
