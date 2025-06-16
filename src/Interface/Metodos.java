package Interface;

import java.util.List;

import Dominio.Ropas;

public interface Metodos {
	//Metodos tenemos 2 
	//1.- funciones
		//Verificar el tipo de retorno que se desea
		//Verificar si se resiviran parametros
			//En caso de recibir parametros ver cuantos y de que tipo
	//2.-Metodos
		//Verificar si se resiviran parametros
		//En caso de recibir parametros ver cuantos y de que tipo
	
	//Procedimientos
	public void guardar(Ropas ropa);
	public void eliminar(int indice);
	public void editar(int indice, Ropas ropa);
	
	//funcion
	public List<Ropas> mostrar();
	public Ropas buscar(int indice);
	
}
