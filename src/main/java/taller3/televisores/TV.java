package taller3.televisores;

public class TV {
	
	private Marca marca;
	int canal;
	private int precio;
	private boolean estado;
	int volumen;
	private Control control;
	private static int numTV = 0;
	
	
	public TV(Marca marca, boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
		
	}
		

	public void setMarca(Marca marc) {marca = marc;}
	
	public Marca getMarca() {return marca;}
	
	
	public void setCanal(int can) {canal = can;}
	
	public int getCanal() {return canal;}
	
	
	public void setPrecio(int prec) {precio = prec;}
	
	public int getPrecio() {return precio;}
	
	
	public void setVolumen(int vol) {volumen = vol;}
	
	public int getVolumen() {return volumen;}
	
	
	public void setControl(Control con) { control = con; }
	
	public Control getControl() {return control;}
	
	public static void setNumTV(int num) { 
		numTV = num; 
		
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		
		return estado;
	}
	
	
	public void canalUp() {
		
		if(estado && canal < 120 && canal >= 1) {
		
		canal++;
		
		}
	}
	
	public void canalDown() {
		
		if(estado && canal <= 120 && canal > 1) {
		
		canal--;
		
		}
	}
	
	
	public void volumenUp() {
		
		if(estado && volumen < 7 && volumen >= 0 ) {
		
		volumen++;
		
		}
	}
	
	public void volumenDown() {
		
		if(estado && volumen <= 7 && volumen > 0 ) {
		volumen--;
		
		}
	}

}
