package maven.examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import proyecto.finall.Libro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List <Libro> libros=new ArrayList<Libro>();
			String opcion;
			Scanner entrada = new Scanner(System.in);

			do {

				System.out.println("Bienbenido al sistema bibliotecario UCE");
				System.out.println("Seleccione una opcion");
				System.out.println("1_Estudiante");
				System.out.println("2_Bibliotecario");
				System.out.println("3-Salir");
				opcion = entrada.nextLine();
				switch (opcion) {

				case "1":
					String opcion1;

					do {

						System.out.println("1_Consultar libros");
						System.out.println("2_reservar libros");
						System.out.println("3-Salir");
						opcion1 = entrada.nextLine();
						switch (opcion1) {

						case "1":
							break;
						case "2":
							break;

						case "3":

							System.out.println("Saliendo");
							break;
						default:
							System.out.println("opcion incorrecta");
							break;

						}

					} while (!opcion1.equals("3"));

					break;
				case "2":
					String opcion2;

					do {

						System.out.println("1_Ingresar un libro");
						System.out.println("2_Prestar un libro");
						System.out.println("3_Aplazar fecha de netrega");
						System.out.println("4-Salir");
						opcion2 = entrada.nextLine();
						switch (opcion2) {

						case "1": 
							
						  //Se crea un ArrayList para guardar objetos de tipo Coche.
					
						     
						  
						       
						    
						     //Método para leer coches e introducirlos en el array
						
						  
						         //Declaración de variables para leer los datos de los coches
						         String nombre;
						         String descripcion;
						         int anyiVigencia;
						         String codigoPoliza;
						         //genearl
						         int valorPoliza;
						         int 
						         
						   
						         //Variable auxiliar que contendrá la referencia a cada coche nuevo.
						         Libro aux;
						         int i, N;
						   
						         //se pide por teclado el número de coches a leer
						         do {
						             System.out.print("Número de libros? ");
						             N = entrada.nextInt();
						         } while (N < 0);
						         entrada.nextLine(); //limpiar el intro
						   
						         //lectura de N coches
						         for (i = 1; i <= N; i++) {
						             //leer datos de cada coche
						             System.out.println("Libro " + i);
						             System.out.print("Codigo: ");
						             codigo = entrada.nextLine();          
						             System.out.print("Nombre: ");
						             nombre= entrada.nextLine();
						             System.out.print("Autor: ");
						             autor = entrada.nextLine();
						             System.out.print("Año de puiblicacion: ");
						             anyoPublicacion= entrada.nextInt();
						             System.out.print("Editorial: ");
						             editorial = entrada.nextLine();
						             System.out.print(": ");
						             cantidadPaginas= entrada.nextInt();
						             System.out.print("Precio: ");
						             precio= entrada.nextInt();
						           
						             String opcion3;
						     		do {
						     			System.out.println("Escoja una opcion");
						     			System.out.println("1_Libro de trabajo");
						     			System.out.println("2_Libro de lectura");
						     			System.out.println("3.Salir\n");
						     			opcion3 = entrada.nextLine();

						     			if (opcion3.equals("1")) {
						     				System.out.println("Codigo de autorizacion");
						     				codigoAutorizacion =entrada.nextLine();

						     			} else if (opcion3.equals("2")) {
						     				System.out.println("Tiempo aproximado de lectura");
						     				
						     				codigoAutorizacion=entrada.nextLine();
						     			}else if(opcion3.equals("3")) {
						     				System.out.println("Cerrando el sistema ");
						     			}

						     		} while (!opcion3.equals("3"));
						     	      entrada.nextLine(); //limpiar el intro
						    
						             aux = new Libro(); //Se crea un objeto Coche y se asigna su referencia a aux                          
						    
						             //se asignan valores a los atributos del nuevo objeto
						             aux.setCodigo(codigo);
						           aux.setNombre(nombre);
						           aux.setAutor(autor);
						           aux.setAnyoPublicacion(anyoPublicacion);
						           aux.setEditorial(editorial);
						           aux.setCantidadPaginas(cantidadPaginas);
						           aux.setPrecio(precio);
						           aux.setCodigoAutorizacion(codigoAutorizacion);
						           aux.setTiempoAproxiLectura(tiempoAproxiLectura);
						        
						                       
						             //se añade el objeto al final del array
						             libros.add(aux);
						      
							
							
							break;
							
						case "2":
							break;

						case "3":

							System.out.println("Saliendo");
							break;
						default:
							System.out.println("opcion incorrecta\n");
							break;

						}

					} while (!opcion2.equals("4"));

					break;
				case "3":

					System.out.println("Saliendo");
					break;
				default:
					System.out.println("opcion incorrecta");
					break;

				}
			} while (!opcion.equals("3"));
		}
	}

	}

}
