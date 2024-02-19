package test;

public class asiento {
	String color;
	int precio;
	int registro;
}
	public void cambiarColor(String color) {
		if (color == "amarillo" || color == "verde" || color == "rojo" || color == "negro" || color == "blanco")
			this.color = color;
	}