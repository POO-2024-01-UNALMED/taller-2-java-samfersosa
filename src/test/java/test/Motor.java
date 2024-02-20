package test;

public class Motor {
int numeroCilindros;
String tipo;
int registro;
	public void cambiarRegistro(int newregistro) {
		this.registro = newregistro;
	
	}
	public void asignarTipo(String newtipo) {
        if ("electrico".equals(newtipo) || "gasolina".equals(newtipo)) {
            this.tipo = newtipo;
	    }
	}

		
	}

