package clase8;

 
	
	
	public class NoHayStockException extends Exception {
		private final Producto prodExcep;
		
		public NoHayStockException(Producto prod) {
			this.prodExcep = prod;
		}
		
	} // fin

 