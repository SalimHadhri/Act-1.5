package Models;

public class Pont extends Bateau{
	
	
	private float height  ;
	private float length ;
	public final int id=3;
	
	
	public float spaceCovered() {
		return this.height*this.length ;
		
	}
	
	public Pont() {
		super() ;
	}
		
	public Pont(float height, float length,String color, float ln) {
		super( color,  ln) ;
		this.height = height;
		this.length = length;
	}



	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
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
	
	public Cabine cabine = new Cabine();
	@Override
	public String toString() {
		return cabine.toString()+"\r\n"+"Le pont n° " +id+  " est consituté du ";
	}

	
	

}
