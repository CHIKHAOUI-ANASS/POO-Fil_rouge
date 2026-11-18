package houses;

import java.util.HashSet;

public class Simulator {
	
	private float basePrice;
	
	public Simulator(float basePrice){
		this.basePrice = basePrice;
		}
	
	public float price(House h){
		return h.price(basePrice);
		}
		
	public float price(HashSet<House> houses){
		float total = 0 ;
		for ( House house : houses ){
			total+=price(house);
			}
		return total;
		}
	}
