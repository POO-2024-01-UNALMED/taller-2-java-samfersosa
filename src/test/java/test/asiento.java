package test;

public class asiento {
	String color;
	int precio;
	int registro;
	
	public asiento (String color, int precio, int registro) {
		this.color = color;
		this.precio = precio;
		this.registro = registro;
		}
	public void cambiarColor(String nuevoColor) {
       
        String[] coloresPermitidos = {"blanco", "amarillo", "negro", "verde", "rojo"};
        
    
        for (String colorPermitido : coloresPermitidos) {
            if (colorPermitido.equalsIgnoreCase(nuevoColor)) {
                this.color = nuevoColor;
            	}	