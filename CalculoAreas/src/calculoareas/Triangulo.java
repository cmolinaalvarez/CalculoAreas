package calculoareas;

public class Triangulo {
    
    //Con atributos de clase
    double base;
    double altura;
    
    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
        
    double calcularAreaTriangulo(){
        return (base * altura)/2;
    }
    
    
    
}
