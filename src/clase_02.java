public class clase_02 {
    // declaracion de variables
int num;
char letra;
double real;
String hola;
String nombre;


void imprimir(){
    System.out.println("clase #2");
    System.out.print("mi nombre->"+nombre);
}
int resultado(int edad)
    {
        return  edad+5;
    }

public  static  void main(String[]arg){
 // estamos instanciando nuestro programa
    int temp;
  clase_02 nl = new clase_02();
  nl.nombre= "fernando";
  nl.imprimir();
temp = nl.resultado(10);
System.out.println("el resultado ->"+temp);
}
}
