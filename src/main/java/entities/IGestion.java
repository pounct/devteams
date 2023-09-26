package entities;

public interface IGestion {

	void afegirArbre();
	void afegirFlor();
	void afegirDecoracio();
	void retirarArbre();
	void retirarFlor();
	void retirarDecoracio();
	void imprimirStock(Floristeria floristeria);
	void imprimirStockQuantitats(Floristeria floristeria);
	void imprimirStockValor(Floristeria floristeria);
	void crearTicket();
	void mostrarTickets();
	void visualitzarTotalTickets();
	
	
}
