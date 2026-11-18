package geometry;

public class Vector{
	private int x;
	private int y;
	
	public Vector(int x, int y){
		this.x=x;
		this.y=y;
		}
	public int getXProjection(){
		return x;
		}
		
	public int getYProjection(){
		return y;
		}
		
	public String toString(){
		return "(" + x + "," + y + ")" ;
		}
			
		
	}
