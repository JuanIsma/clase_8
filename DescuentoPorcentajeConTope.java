package clase8;
public class DescuentoPorcentajeConTope extends Descuento {
	private float tope;
	
	public float getTope() {
		return tope;
	}

	public void setTope(float tope) {
		this.tope = tope;
	}

	@Override
	public float valorFinal(float valorInicial) {
		float valorConDescuento;
		valorConDescuento = valorInicial - (valorInicial * this.getValorDesc() / 100);
		if (valorInicial - valorConDescuento > this.tope){
			return valorInicial - tope;
		}
		return valorConDescuento;
		
	}

}// fin de la clase
