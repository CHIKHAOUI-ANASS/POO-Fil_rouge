package geometry;

public class Position{
	private int x ;
	private int y ;
	
	public Position(int x,int y){
		this.x=x;
		this.y=y;
		}
	
	public int getX(){
		return x ;
		}
		
	public int getY(){
		return y ;
		}
		
	public String toString(){
		return "(" + x + "," + y + ")" ;
		}
		
	public String getRepresentation(){
		return "(" + x + "," + y + ")" ;
		}
		
	public Position symmetricX(){
		Position p = new Position(x,-y);
		return p;
		//return Position(x,-y);
		}
		
	public void translate(Vector v){
		x=x + v.getXProjection();
		y=y + v.getYProjection();
		}
	}
