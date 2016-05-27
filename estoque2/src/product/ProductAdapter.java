package product;

public interface ProductAdapter {
	void appCloseSection(); 

	boolean appSaveProduct();
	
	/*O produto é válido se o sku for válido, 
	 * se os componentes forem válidos 
	 * e se a quantidade de componentes foram maior que 0*/
	boolean appValidadeProduct(); 
	
	/*Para checar se o sku do produto já foi cadastrado e se a quantidade
	 * é maior que 0 para poder ser deletado do sistema*/
	boolean appIsSkuValid();
	
	
}
