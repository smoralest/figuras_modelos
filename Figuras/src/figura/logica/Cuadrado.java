package figura.logica;

public class Cuadrado extends Figura{
    
    public void calcularArea(){
        int lado = origen.calcularDistancia(fin);
        area = lado*lado;               
    }
    
    public void calcularPerimetro(){
        int lado = origen.calcularDistancia(fin);
        perimetro = 4*lado;
    }            
}
