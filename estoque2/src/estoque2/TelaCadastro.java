package estoque2;

public interface TelaCadastro {

	void appCloseSection();

	Boolean appRegister(Integer sku, Integer unit);

	void appSaveData(Integer sku, Integer unit);

	void appDeleteData(Integer sku);

}
