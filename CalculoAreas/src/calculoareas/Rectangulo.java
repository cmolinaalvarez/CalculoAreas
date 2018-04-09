package calculoareas;

public class Rectangulo {
    
    //Con atributos de clase
    int ladoUno;
    int ladoDos;
    
    Rectangulo(int ladoUno, int ladoDos){
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }
        
    double calcularAreaRectangulo(){
        return ladoUno * ladoDos;
    }
    
    
    
}