package test;

public class Auto {
String modelo;
int precio;
Asiento [] asientos;
String marca;
Motor motor;
int registro;
static int cantidadCreados;

	public int cantidadAsientos() {
		int contador = 0;
		for (Asiento asiento : asientos) {
		          if (asiento != null) { 
		              contador++;}
		}return contador;
		}
		          public String verificarIntegridad() {
		        	    int registroAuto = this.registro;
		        	    int registroMotor = this.motor.registro;
		        	    boolean asientosOriginales = true;

		        	    for (int i = 0; i < asientos.length; i++) {
		        	        Asiento asiento = asientos[i];
		        	        if (asiento != null && asiento.registro != registroAuto) {
		        	            asientosOriginales = false;
		        	            break;
		        	        }
		        	    }

		        	    if (registroAuto == registroMotor && asientosOriginales) {
		        	        return "Auto original";
		        	    } else {
		        	        return "Las piezas no son originales";
		        	    }
		        	}

			}

