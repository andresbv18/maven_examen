package maven.examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Poliza> poliza = new ArrayList<Poliza>();
		String opcion;
		Scanner entrada = new Scanner(System.in);

		do {

			System.out.println("Aseguradora del sur escoja una opcion");
			System.out.println("Seleccione una opcion");
			System.out.println("1_Ingresar poliza ");
			System.out.println("2_Actualizar Poliza");
			System.out.println("2_Actualizar valor");
			System.out.println("2_Imprimir reporte");
			System.out.println("3-Salir");
			opcion = entrada.nextLine();
			switch (opcion) {

			case "1":
				String opcion1;

				do {

					System.out.println("1_Poliza general");
					System.out.println("2_Poliza vip");
					System.out.println("3-Salir");
					opcion1 = entrada.nextLine();
					switch (opcion1) {

					case "1":
						PolizaGeneral poliza1 = new PolizaGeneral();
						String nombre;
						String descripcion;
						int anyoVigencia;
						String codigoPoliza;
						int valorPoliza;
						String codigoDescuento;
						int numeroSeguro;

						System.out.println("Poliza ");
						System.out.print("nombre: ");
						nombre = entrada.nextLine();
						System.out.print("descripcion: ");
						descripcion = entrada.nextLine();
						System.out.print("Año vigencia: ");
						anyoVigencia = entrada.nextInt();
						System.out.print("codigo poliza: ");
						codigoPoliza = entrada.nextLine();
						System.out.print("valor poliza: ");
						valorPoliza = entrada.nextInt();
						System.out.print("numero seguro:");
						numeroSeguro = entrada.nextInt();
						System.out.print("codigo descuento: ");
						codigoDescuento = entrada.nextLine();
						entrada.nextLine(); // limpiar el intro

						poliza1.setAnyoVigencia(anyoVigencia);
						poliza1.setCodigoDescuento(codigoDescuento);
						poliza1.setCodigoPoliza(codigoPoliza);
						poliza1.setDescripcion(descripcion);
						poliza1.setNombre(nombre);
						poliza1.setNumeroSeguro(numeroSeguro);
						poliza1.setValorPoliza(valorPoliza);
poliza.add(poliza1);
						break;
					case "2":
						PolizaVip poliza2 = new PolizaVip();
						String nombre2;
						String descripcion2;
						int anyoVigencia2;
						String codigoPoliza2;
						int valorPoliza2;
						String codigoDescuento2;
						int numeroSeguro2;
						String beneficio;

						System.out.println("Poliza ");
						System.out.print("nombre: ");
						nombre2 = entrada.nextLine();
						System.out.print("descripcion: ");
						descripcion2= entrada.nextLine();
						System.out.print("Año vigencia: ");
						anyoVigencia2 = entrada.nextInt();
						System.out.print("codigo poliza: ");
						codigoPoliza2 = entrada.nextLine();
						System.out.print("valor poliza: ");
						valorPoliza2 = entrada.nextInt();
						System.out.print("codigo descuento: ");
						beneficio = entrada.nextLine();
						entrada.nextLine(); // limpiar el intro

						poliza2.setAnyoVigencia(anyoVigencia2);
						
						poliza2.setCodigoPoliza(codigoPoliza2);
						poliza2.setDescripcion(descripcion2);
						poliza2.setNombre(nombre2);
						
						poliza2.setValorPoliza(valorPoliza2);
						poliza2.setBeneficio(beneficio);
poliza.add(poliza2);
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
			case "3":
				
				
				
				break;
			case "4":

				System.out.println("Saliendo");
				break;
			default:
				System.out.println("opcion incorrecta");
				break;

			}
		} while (!opcion.equals("4"));
	}

}
