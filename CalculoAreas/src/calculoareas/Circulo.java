package calculoareas;

public class Circulo {
    
    //Con atributos de clase
    double radio;
    double pi = 3.1416;
    
    Circulo(double radio){
        this.radio = radio;
    }
        
    double calcularAreaCirculo(){
        return Math.PI*Math.pow(radio,2);
    }  
    
    
}
