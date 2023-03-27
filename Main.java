package clase8;

 
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

 

public class Main {

	  static Carrito carrito;
	 static ItemCarrito item;

	public static void main(String[] args) {

	Producto prod1 =new Producto("lata de atun");
	prod1.setPrecio(200.0);
	prod1.setStock(100);
	
	Producto prod2 =new Producto("lata de arvejas");
	prod2.setPrecio(250.0);
	prod2.setStock(120);
	
	 
	ItemCarrito nuevoProd = new ItemCarrito(prod1,5);
	 Carrito carrito = new Carrito();
	 carrito.addItems(nuevoProd);
	
	
	 ItemCarrito nuevoProd2 = new ItemCarrito(prod2,6);
     carrito.addItems(nuevoProd2);
	
	 carrito.calcularPrecioCompra();
	 System.out.println(carrito.getPrecioTotal());
	
	}
		
		
	}
		
		
	/*	String archivo = "C:\\Users\\Win X\\eclipse-workspace\\Clase8\\src\\clase8\\carritos.csv";
		Path ruta;
		List<String> lineasArchivo = null;
		try {
			ruta = Paths.get(archivo);
			lineasArchivo = Files.readAllLines(ruta, StandardCharsets.UTF_8);
			Main.items(lineasArchivo);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	
	
	public static void items(List<String> lineasArchivo) {
		int xpersona=0;
		int j=0 ,k=0;
		
		String vector[] = null;
		String[][] matriz = new String[4][3];
		
		ArrayList<ArrayList<String>> array = new ArrayList(); 
		 
		for (String linea : lineasArchivo) {
			System.out.println(linea);
			vector = linea.split(";");
			for (int i = 0; i < vector.length; i++) {
 		      //para cada alumno se añade una nueva fila vacía
		  //esto es necesario porque el arrayList se crea vacío
		      array.add(new ArrayList<String>());
		      array.get(i).add(vector[i]);
				}
			  // variable que será la cantidad de filas de la matriz
		}
            for(j=0; j < array.size();j++){                       //para cada alumno (para cada fila)  
            for(k=0;k < array.get(j).size();k++){            //se recorre todas la columnas de la fila            
                System.out.print(array.get(j).get(k) + " "); //se obtiene el elemento i,j
           
            
            
        	/*	int cantidad    = Integer.valueOf(array.get(j).get(0));
        		double precioUnitario = Double.valueOf(array.get(j).get(1));
        		String productoComprado = array.get(j).get(2);

        		Producto producto = new Producto(productoComprado);
        		  item = new ItemCarrito(cantidad, precioUnitario, producto);  	*/
        		    
                
           /*  }
            }
            
            System.out.print(array.get(0).get(1) + " ");  
	 
		
	/*    carrito  = new Carrito();
		carrito.agregarItem(item);
		 xpersona++;
		System.out.println("Persona:"+xpersona+")"+carrito.getItems() );*/
	
		 
 

	 
		/*********************************************************************************************/
                                    // FIN

/*	}

}*/



/*Excepciones y Colecciones
1. Modifique el ejercicio del carrito de la clase 5-7, para tener una cantidad ilimitada de
ítems. Verifique que cuando lea un archivo pueda leer items de cualquier tamaño

2. Agregue excepciones a los descuentos:
a. que no se pueda aplicar un descuento a un carrito de precio 0
b. que el resultado del descuento no de un monto negativo
c. Si ocurre alguna de esas 2 situaciones, mostrar por pantalla el error, en lugar
del resultado del carrito

3. Realice algún test para probar la funcionalidad de las 2 excepciones planteadas*/