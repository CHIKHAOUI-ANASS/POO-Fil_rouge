package houses ;


public class House {
	
	private String adresse;
	private int surface;
	
	public House(String adresse , int surface){
		this.adresse = adresse;
		this.surface = surface;
		}
	
	public String getAddress(){
		return adresse;
		}
	
	public float price(float basePrice){
		return surface * basePrice ;
		} 
		
	public String toString(){
		return "Adresse :" + adresse + " , Surface :" + surface +" m2 " ;
		}
	}
