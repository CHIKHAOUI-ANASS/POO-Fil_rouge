package geometry ;

public class Segment{
	private Position p1;
	private Position p2;
	
	public Segment(Position p1,Position p2){
		this.p1=p1;
		this.p2=p2;
		}
	public String getRepresentation(){
		return "[" + p1.getRepresentation() + ";" + p2.getRepresentation() +"]";
		}
	
	public double length(){
		int x = p2.getX() - p1.getX();
		int y = p2.getY() - p1.getY();
		
		return Math.sqrt(x*x + y*y);
		}
	}
