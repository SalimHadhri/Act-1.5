package Models;

public class Coque extends Bateau {
	
	private String material ;
	private String color ;
	public final int id=2;
	
	public Coque() {
		super() ;
	}
	
	public Coque(String material, String color,String cc, float length) {
		super(cc,length) ;
		this.material = material;
		this.color = color;
	}

	public void toGreen() {
		setColor("Green") ;
	}
	


	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	
	@Override
	public String toString() {
		return super.toString()+"\r\n"+"Coque n° "+id+" ;";
	}
	
	
	
	

}
