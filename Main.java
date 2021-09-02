
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
   

   System.out.println(numero1);
   System.out.println(numero2);

   if(numero1 == numero2){
     System.out.println("los dos numeros son iguales");
   } else {
     System.out.println("los dos numeros son diferentes");
   }



  }
}