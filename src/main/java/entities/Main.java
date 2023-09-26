package entities;

import java.util.Scanner;

public class Main {
	
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Floristeria floristeria;
		Gestion gestion = new Gestion();
		boolean onProgram = true;

		Byte opcion;

		while (onProgram) {

			System.out.println(" Floristeria actiu : " + ((floristeria != null) ? floristeria.getNom() : "cap"));

			System.out.println("-----------------\n");
			System.out.println(" 1.Crear Floristeria."); // obrir floristeria
			System.out.println(" 14.Obrir Floristeria.");
			System.out.println(" 2.Afegir Arbre.");
			System.out.println(" 3.Afegir Flor.");
			System.out.println(" 4.Afegir Decoració.");
			System.out.println(" 5.Stock");
			System.out.println(" 6.Retirar arbre.");
			System.out.println(" 7.Retirar flor.");
			System.out.println(" 8.Retirar decoració.");
			System.out.println(" 9.Stock Amb Quantitats");
			System.out.println(" 10.Valor Stock");
			System.out.println(" 11.Compra amb múltiples objectes");
			System.out.println(" 12.Compres Antigues.");
			System.out.println(" 13.diners guanyats");
			System.out.println(" 0.fin");
			opcion = sc.nextByte();
			sc.nextLine();
			switch (opcion) {
			case 1:
				// 1.Crear Floristeria.
				floristeria = crearFloristeria(gestion);
				break;
			case 2:
				// 2.Afegir Arbre.
				if (indexacio != null) {
					afegirArbre();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 3:
				// 3.Afegir Flor.
				if (indexacio != null) {
					afegirFlor();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 4:
				// 4.Afegir Decoració.
				if (indexacio != null) {
					afegirDecoracio();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 5:
				// Stock: Imprimeix per pantalla tots els arbres, flors i decoració
				// que té la floristeria.
				// 5.Stock
				if (indexacio != null) {
					imprimirStock();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 6:
				// 6.Retirar arbre.
				if (indexacio != null) {
					retirarArbre();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 7:
				// 7.Retirar flor.
				if (indexacio != null) {
					retirarFlor();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 8:
				// 8.Retirar decoració.
				if (indexacio != null) {
					retirarDecoracio();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 9:
				// Printar per pantalla stock amb quantitats.
				// 9.Stock Amb Quantitats
				if (indexacio != null) {
					imprimirStockQuantitats();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 10:
				// Printar per pantalla valor total de la floristeria.
				// 10.Valor Stock // Valor Compres // ValorVendes
				if (indexacio != null) {
					imprimirValorStock();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 11:
				// Crear tickets de compra amb múltiples objectes.
				// 11.Compra amb múltiples objectes
				if (indexacio != null) {
					crearTicket();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 12:
				// Mostrar una llista de compres antigues.
				// 12.Compres Antigues.
				if (indexacio != null) {
					mostrarTickets();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 13:
				// Visualitzar el total de diners guanyats amb totes les vendes.*/
				// 13.diners guanyats
				// Vendes
				if (indexacio != null) {
					visualitzarTotalGuanyats();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 14:
				// 14.Obrir Floristeria.
				obrirFloristeria();
				break;
			case 0:
				onProgram = false;
				System.out.println("      Fin de programe.");
				break;

			default:
				break;
			}
		}		

	}

	private static Floristeria crearFloristeria(Gestion gestion) {
		System.out.println("Crear Floristeria.\n");
		System.out.println("nom : ");
		String nom = sc.nextLine();
		Long index = (long) 1;
		// Crear i recuperar Floristeria
		return gestion.crearFloristeria(index,nom);
		
	}

}
