package clase8;

public class ItemCarrito {

	private int cantidad;
	private double precioUnitario;
	private Producto productoComprado;

	public ItemCarrito(Producto productoComprado, int cantidad) {
		this.cantidad = cantidad;
		this.productoComprado = productoComprado;

	}

	public ItemCarrito(int cantidad, double precioUnitario, Producto productoComprado) {
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.productoComprado = productoComprado;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Producto getProductoComprado() {
		return productoComprado;
	}

	public void setProductoComprado(Producto productoComprado) {
		this.productoComprado = productoComprado;
	}

	public double precio() throws NoHayStockException {
		if (!this.productoComprado.hayStock(this.cantidad)) {
			throw new NoHayStockException(this.productoComprado);
		}
		return this.cantidad * this.productoComprado.getPrecio();
	}

	@Override
	public String toString() {
		return "ItemCarrito  cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", productoComprado="
				+ productoComprado;
	}

}
