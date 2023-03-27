package clase8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

	// Propiedades
		private List<ItemCarrito> items;
		private double precioTotal;
		private double precioFinal;
		private LocalDate fechacompra;
		
		//Constructores
		public Carrito() {
			this.precioTotal = 0;
			this.precioFinal = 0;
			this.fechacompra = LocalDate.now();
			this.items = new ArrayList<ItemCarrito>();
		}
	

		// Getters
		public double getPrecioTotal() {
			return precioTotal;
		}
		public LocalDate getFechacompra() {
			return fechacompra;
		}
		
		public List<ItemCarrito> getItems() {
			return items;
		}


		public double getPrecioFinal() {
			return precioFinal;
		}

		
		//Setters
		public void setPrecioTotal(double precioTotal) {
			this.precioTotal = precioTotal;
		}

		public void setPrecioFinal(double precioFinal) {
			this.precioFinal = precioFinal;
		}

		// Metodos

		public void addItems(ItemCarrito item) {
			this.items.add(item);
		}
		
		public void RemoveItem(ItemCarrito item) {
			this.items.remove(item);
		}
		
		public void calcularPrecioCompra() {
			double precio = 0;
			double precioItem;
			
			for (ItemCarrito item: this.items ) {
				try {
					precioItem = item.precio();
					precio += precioItem;
				} catch (Exception e) {
					precioItem = 0;
					precio += precioItem;
				}
			}
			this.precioTotal = precio;
		}

	 

	 
		

	}