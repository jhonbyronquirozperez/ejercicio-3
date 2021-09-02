
import java.util.Scanner;


class Main {
  public static void main(String[] args){
    //primer numero
    Scanner entrada = new Scanner(System.in);
    int numero1;

    System.out.println("ingrese el primer numero: ");
    numero1 = entrada.nextInt();


    //segundo numero
    Scanner entrada2 = new Scanner(System.in);
    int numero2;

    System.out.println("ingrese el segundo numero: ");
    numero2 = entrada2.nextInt();

    //tercer numero
    Scanner entrada3 = new Scanner(System.in);
    int numero3;

    System.out.println("ingrese el tercer numero: ");
    numero3 = entrada3.nextInt();

    if(numero1 > numero2 ){
      if(numero1 > numero3){
        System.out.println(numero1 + " es el mayor numero");
      } 
    }

     if(numero2 > numero1 ){
      if(numero2 > numero3){
        System.out.println(numero2 + " es el mayor numero");
      } 
    }
   
    if(numero3 > numero2 ){
      if(numero3 > numero1){
        System.out.println("("+numero3 +") es el mayor numero");
      } 
    }

  
  }
}