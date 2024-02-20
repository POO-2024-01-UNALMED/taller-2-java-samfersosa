package test;

public class Motor {
int numeroCilindros;
String tipo;
int registro;
	public void cambiarRegistro(int newregistro) {
		this.registro = newregistro;
	
	}
	public void asignarTipo(String newtipo) {
		if(tipo == "eleticro" || tipo == "gasolina")
			this.tipo = newtipo;
		
	}
}
