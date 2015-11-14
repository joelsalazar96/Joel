package Ejercicios1;

import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double iva;
		double acum=0,acum1=0,acum2=0;
		System.out.println ("Hola Bienvenido");
		System.out.println("desea ingresar al sistema");
		Scanner respuesta= new  Scanner(System.in);
		String re=respuesta.next();
		while(re.equals("si")){
		System.out.println ("Ingrese el monto de su conmpra, por favor");
		Scanner monto= new  Scanner(System.in);
		double mo=monto.nextDouble();
		System.out.println ("escoja la bolita de su color preferido");
		System.out.println ("1. roja");
		System.out.println ("2. amarilla");
		System.out.println ("3. blanca ");
		System.out.println("Seleccione una opcion");
		Scanner bolita=new Scanner(System.in);
		int bo=bolita.nextInt(); 
		switch (bo){
		case 1:
		    iva = ((mo)+mo*0.12);
			System.out.println("Su total a pagar incluido el iva y descuento es :"+((iva)-iva*0.40));
			 acum=acum+((iva)-iva*0.40);
			break;
		case 2:
			 iva = ((mo)+mo*0.12);
			System.out.println("Su total a pagar incluido el iva y descuento es :"+((iva)-iva*0.25));
			acum1=acum1+((iva)-iva*0.25);
			break;
		case 3:
			iva = ((mo)+mo*0.12);
			System.out.println("Su total a pagar incluido el iva es :"+iva);
			acum2=acum2+iva;
			break;
			
			default:
				System.out.println("seleccion no valida");
				}System.out.println("desea seguir ingresando datos al sistema");
		re=respuesta.next();
}System.out.println("el total de ventas del dia es "+(acum+acum1+acum2));
	System.out.println("Gracias por utilizar el sistema");	
	System.exit(0);
	}

}
