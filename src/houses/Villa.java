package houses ; 

public class Villa extends House {
	private int outsidesurface;
	
	public Villa(String adresse , int surface, int outsidesurface){
		super(adresse , surface );
		this.outsidesurface	= outsidesurface ;
		}
		
	
	public float price(float basePrice){
		return super.price(basePrice) + outsidesurface * (basePrice/2);
		}
		
	public String toString(){
		return super.toString() + " outsidesurface : " + outsidesurface + " m2 " ;
		}
	}
