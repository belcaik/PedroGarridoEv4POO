package pojo;

public class alquiler {
	private int id;
	private int monto;
	private boolean ocupado;

	public alquiler(int id, int monto, boolean ocupado){
		this.id = id;
		this.monto = monto;
		this.ocupado =ocupado;
	};

	public void setId(int id) {
		this.id = id;
	}public int getId() {
		return id;
	}
	
	public void setMonto(int monto) {
		this.monto = monto;
	}public int getMonto() {
		return monto;
	}
	
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}public boolean getOcupado(){
		return ocupado;
	}
}
