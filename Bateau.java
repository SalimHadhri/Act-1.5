package Models;

public class Bateau{

	
	private String color ; 
	private float length ;
	
	
	public final int id=1;
	
	public Bateau() {
	}
	
	public void doubleLength() {
		this.length=this.length*2 ;
	}
	


	public Bateau(String color, float length) {
		this.color = color;
		this.length = length;

	}


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}


	public int getId() {
		return id;
	}

	
	
	


	@Override
	public String toString() {
		return "le bateau n° "+id+" est constitue de :" 	;

	}
	
	
}
