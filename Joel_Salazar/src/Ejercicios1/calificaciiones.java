package Ejercicios1;

import java.util.Scanner;

public class calificaciiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,i;
		x=1;
		i=0;
		double not=0;
		double pro=0;
		System.out.println("Bienvenido");
		System.out.println("Desea ingresar al sistema");
		Scanner respuesta=new Scanner(System.in);
		String resp=respuesta.next();
		while (resp.equals("si")&(x<=50)){ 
			System.out.println("Ingrese su nota "+x);
			Scanner nota=new Scanner(System.in);
			double n=nota.nextDouble();
			x=x+1;if(n<=6){
				i=i+1;
			}
			not=not+n;
			pro=not/50;	
		}if(pro<=7){
		System.out.println("el promedio generas reprovado Su promedio es "+pro);
		}
		else{
			System.out.println("usted esta aprovado Su promedio es "+pro);
		}
		System.out.println("el numero de estudiantes reprovados es:"+i);

		System.out.println("Gracias por utilizar el sistema");

	}

}
