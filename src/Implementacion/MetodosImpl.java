package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Ropas;
import Interface.Metodos;

public class MetodosImpl implements Metodos{
	
	public List<Ropas> listaRopas = new ArrayList<Ropas>();

	@Override
	public void guardar(Ropas ropa) {
		listaRopas.add(ropa);
		
	}

	@Override
	public void eliminar(int indice) {
		listaRopas.remove(indice);
		
	}

	@Override
	public void editar(int indice, Ropas ropa) {
		// TODO Auto-generated method stub
		listaRopas.set(indice, ropa);
	}

	@Override
	public List<Ropas> mostrar() {
		
		return listaRopas;
	}

	@Override
	public Ropas buscar(int indice) {
		// TODO Auto-generated method stub
		return listaRopas.get(indice);
	}

}
