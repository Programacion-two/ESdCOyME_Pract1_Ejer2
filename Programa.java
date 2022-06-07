package programa1;

import java.util.Scanner;
import java.util.Random;

public class Programa {

	
			 private void iniciar1(){
				
				int valor=generarAleatorio();
				int num;
				int resul = 0;
				
				do{
					num=pedirNumero(resul);
					resul=compararNumeros(num,valor);
					System.out.println(resul);
					
				}while(resul!=0);
					System.out.println("Felicitaciones acertaste!!");
			}
			

			//devuelve un numero aleatorio entre 1 y 1000
			 private int generarAleatorio(){
				//completar aquí
				Random azar = new Random();
				int valor=azar.nextInt(1000)+1;
				return valor;
			
				
				
			}
			
			//pide un nro por pantalla
			 private int pedirNumero(int num){
				 Scanner entrada=new Scanner(System.in);
				////completar aquí
				 System.out.println("ingrese cualquier numero entre 1 y 1000");
				 num=entrada.nextInt();
				 
				 if(num>1000) {
					 System.out.print("el numero es demasiado grande");
				 }
				 if(num<1000) {
					 System.out.print("el numero es demasiado chico");
				 }
				 return num;
				
				 
			 }
			
			 //compara dos enteros a y b. Devuelve un integer indicando si es menor, mayor o igual
			 private int compararNumeros(int a, int b){
				 //completar aquí
				 if (a<b) {
					 return 1;
				 }
				 if (a>=b) {
					 return 0;
				 }
				 else {
					 return 2;
				 }
			 }
			
		


		}




