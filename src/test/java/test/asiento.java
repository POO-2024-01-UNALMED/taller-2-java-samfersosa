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
        // Lista de colores permitidos
        String[] coloresPermitidos = {"blanco", "amarillo", "negro", "verde", "rojo"};
        
        // Verificar si el nuevo color está en la lista de colores permitidos
        for (String colorPermitido : coloresPermitidos) {
            if (colorPermitido.equalsIgnoreCase(nuevoColor)) {
                this.color = nuevoColor;
                System.out.println("El color del asiento ha sido cambiado a " + nuevoColor + ".");
                return;