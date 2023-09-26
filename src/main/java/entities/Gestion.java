package entities;

public class Gestion implements IGestion{
	
	public Floristeria crearFloristeria(Long id, String nom) {
		return new Floristeria(id,nom);
	}

	public void afegirArbre() {
		// TODO Auto-generated method stub
		
	}

	public void afegirFlor() {
		// TODO Auto-generated method stub
		
	}

	public void afegirDecoracio() {
		// TODO Auto-generated method stub
		
	}

	public void retirarArbre() {
		// TODO Auto-generated method stub
		
	}

	public void retirarFlor() {
		// TODO Auto-generated method stub
		
	}

	public void retirarDecoracio() {
		// TODO Auto-generated method stub
		
	}

	public void imprimirStock(Floristeria floristeria) {
		System.out.println("Productes:");
		System.out.println("----------");
		System.out.println("Arbres:");
		System.out.println(floristeria.getArbres());
		System.out.println("Flors:");
		System.out.println(floristeria.getFlors());
		System.out.println("Decoracions:");
		System.out.println(floristeria.getDecoracions());
		
	}

	public void imprimirStockQuantitats(Floristeria floristeria) {
		System.out.println("Productes amb Quantitats:");
		System.out.println("----------");
		System.out.print("Arbres: ");
		System.out.println(floristeria.getArbres().size());
		System.out.print("Flors: ");
		System.out.println(floristeria.getFlors().size());
		System.out.print("Decoracions: ");
		System.out.println(floristeria.getDecoracions().size());
		
	}

	public void imprimirStockValor(Floristeria floristeria) {
		System.out.print("Valor Total Productes de la floristeria : " + floristeria.getNom());
		System.out.println(floristeria.getValorArbres()+floristeria.getValorFlors()+floristeria.getValorDecoracions());
		
	}

	public void crearTicket() {
		// TODO Auto-generated method stub
		
	}

	public void mostrarTickets() {
		// TODO Auto-generated method stub
		
	}

	public void visualitzarTotalTickets() {
		// TODO Auto-generated method stub
		
	}

}
