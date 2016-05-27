package product;

public interface ProductAdapter {
	void appCloseSection(); 

	boolean appSaveProduct();
	
	/*O produto � v�lido se o sku for v�lido, 
	 * se os componentes forem v�lidos 
	 * e se a quantidade de componentes foram maior que 0*/
	boolean appValidadeProduct(); 
	
	/*Para checar se o sku do produto j� foi cadastrado e se a quantidade
	 * � maior que 0 para poder ser deletado do sistema*/
	boolean appIsSkuValid();
	
	
}
