package Models;

public class Cabine extends Bateau{

	
	private float length ; 
	private float width  ;
	public final int id=4;
	
	
	public Cabine() {
		super() ;
		
	}
	

	
	public Cabine(float length, float width,String color, float ln) {
		super(color,ln) ;
		this.length = length;
		this.width = width;
	}
	
	public float space () {
		return this.length*this.width;
	}

	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}



	public int getId() {
		return id;
	}

	public Coque coque = new Coque();

	@Override
	public String toString() {
		return coque.toString()+"\r\n"+"Cabine n° "+id+" ;";
	}




	
	
}
