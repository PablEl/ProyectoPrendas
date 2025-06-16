package Main;

import java.util.Scanner;

import Dominio.Ropas;
import Implementacion.MetodosImpl;

public class Principal {

	public static void main(String[] args) {
		//Declarar coleccion de objetos
		Ropas ropa1 = new Ropas("No me la se", 200, "blanco", 50);
		Ropas ropa2 = new Ropas("Gucci", 10000, "Verde", 2);
		
		//Modificacion
		Ropas ropa3 = new Ropas("Prueba", 10000, "prueba", 2);
		
		//Modificacion otra rama
		Ropas ropa4 = new Ropas("Prueba", 10000, "prueba", 2);
		
		
		MetodosImpl tienda = new MetodosImpl();
		
		//guardar
		tienda.guardar(ropa1);
		tienda.guardar(ropa2);
		//mostrar
		System.out.println(tienda.mostrar());
		//buscar
		Ropas ropaBusc = tienda.buscar(1);
		System.out.println("Se encontro el registro " + ropaBusc);
		
		//editar
		ropaBusc.setColor("Negro");
		tienda.editar(1, ropaBusc);
		System.out.println(tienda.mostrar());

		//eliminar
		tienda.eliminar(0);
		System.out.println(tienda.mostrar());
		
	}

}
