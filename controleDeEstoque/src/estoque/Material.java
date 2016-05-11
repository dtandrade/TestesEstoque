package estoque;

public class Material {
	public Long idMat;
	public String nameStr;
	public String descStr;
	public String unitStr;
	public Integer skuUnique;
	
	public Boolean skuIsUnique;
	
	public Material(){
		idMat = (long)0;
		nameStr = "";
		descStr = "";
		unitStr = "";
		skuUnique = 0;
		
		skuIsUnique = false;
		
	}
	

}
