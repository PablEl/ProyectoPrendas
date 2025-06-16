package Dominio;

public class Ropas {
	private String marca;
	private  float price;
	private String color;
	private int existencia;
	
	public Ropas(String marca, float price, String color, int existencia) {
		this.marca = marca;
		this.price = price;
		this.color = color;
		this.existencia = existencia;
	}
	
	@Override
	public String toString() {
		return "Ropas [marca=" + marca + ", price=" + price + ", color=" + color + ", existencia=" + existencia + "]\n";
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	
	
}
