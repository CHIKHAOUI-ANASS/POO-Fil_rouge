package houses ;

import java.util.HashSet;

public class Demo{
	public static void main(String[] args){
		House h1 = new House("Caen" , 120 );
		House h2 = new House("Rouen" , 100 );
		House h3 = new House("Paris" , 150 );
		Villa v1 = new Villa("Paris" , 120 , 80);
		float BasePrice = 2000 ;
		System.out.println(h1);
		System.out.println(v1);
		System.out.println("House price :" + h1.price(BasePrice));
		System.out.println("Villa price :" + v1.price(BasePrice));
		
		HashSet<House> houses = new HashSet<House>();
		
		houses.add(h1);
		houses.add(h2);
		houses.add(h3);
		houses.add(v1);
		
		
		Simulator sim = new Simulator(BasePrice);
		System.out.println(sim.price(h1));
		System.out.println(sim.price(v1));
		
		System.out.println("Total price :" + sim.price(houses));
		}
	
	
	}
