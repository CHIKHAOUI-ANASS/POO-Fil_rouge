package geometry ;


//src$ javac -d ../build/ geometry/TestVector.java

public class TestVector{
	public static void main(String[] args){
		Vector v= new Vector(10,2) ;
		System.out.println(v.getXProjection());
		System.out.println(v.getYProjection());
		Position P = new Position(3,4);
		System.out.println(P);
		Position P2 = P.symmetricX();
		Position a = new Position(2,3);
		Position b = new Position(7,6);
		Segment s = new Segment(a,b);
		System.out.println(s.getRepresentation());
		System.out.println(s.length());
		}
	
	}
