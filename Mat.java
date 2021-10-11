package Models;

public class Mat extends Pont{

	
	private String quality ;
	private float quantity ;
	public final int id=4;
	
	public void doubleQuantity() {
		this.quantity=this.quantity*2 ;
	}
	
	public Mat() {
		super() ;
	}

	public Mat(String quality, float quantity,float height, float length,String color, float ln) {
		super(height, length,color,ln);
		this.quality = quality;
		this.quantity = quantity;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return super.toString()+"Mat n° "+id+" qui est constitué de ";
	}
	
	
	
	
	
}
