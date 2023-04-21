package estudo;

import java.util.Scanner;

public class estude {
	public static int soma(int num1, int num2){
		return num1+num2;
	}
	public static int sub(int num1, int num2){
		return num1-num2;
	}
	public static int mult(int num1, int num2){
		return num1*num2;
	}
	public static int divi(int num1, int num2){
		return num1/num2;
	}
	
	
	
	public static void main(String[] args){
		
	  int a, b, c;
	  
	  Scanner entra= new Scanner(System.in);
	  
	  System.out.println("Digite se você quer: \n 1) soma \n 2) subtração \n 3) multiplicação \n 4) divisão" );	
	  c = entra.nextInt();
	  
	  System.out.println("Digite um número:" );	
	  a = entra.nextInt();
	  System.out.println("Digite um número:" );	   
	  b = entra.nextInt();
	  
      if(c==1) {
	   int soma = soma(a, b);
	    System.out.println("Resposta da soma: " + soma);
      }
      if(c==2) {
         int sub = sub(a, b);
    	    System.out.println("Resposta da subtração é: " + sub);
      }
      if(c==3) {
         int mult = mult(a, b);
         	System.out.println("Resposta da multiplicação é: " + mult);
      }
      if(c==4) {
         int divi = divi(a, b);
       	    System.out.println("Resposta da divisão é: " + divi);
      }
	}
}
      
      

